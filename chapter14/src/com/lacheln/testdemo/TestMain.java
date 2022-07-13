//package com.lacheln.testdemo;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Future;
//import java.util.concurrent.ThreadPoolExecutor;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementSetter;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.fastjson.JSONObject;
//
//import cn.zuler.common.http.HttpUtils;
//import cn.zuler.common.utils.DateUtil;
//import cn.zuler.common.vo.SyncConfigReqVo;
//import cn.zuler.provider.utils.CallResults.CallResult;
//
//public class TestMain {
//
//
//
//	private static String url = "127.0.0.1:80/config-center/sync-config?fullUpdate=true";
//
//	public static Executor configExecutor() {
//		// 获取当前机器的核数
//		int cpuNum = Runtime.getRuntime().availableProcessors();
//		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//		cpuNum = 30;
//		// 配置核心线程数
//		executor.setCorePoolSize(cpuNum);
//		// 配置最大线程数
//		executor.setMaxPoolSize(cpuNum * 2);
//		// 配置队列大小
//		executor.setQueueCapacity(100);
//		// 线程存活时间
//		executor.setKeepAliveSeconds(60);
//		// 配置线程池中的线程的名称前缀
//		executor.setThreadNamePrefix("m_c_t");
//		// CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
//		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//		// 执行初始化
//		executor.initialize();
//		return executor;
//	}
//	public static class BreakFlg{
//		boolean breakFlg = false;
//	}
//	public static void main(String[] args) {
//		BreakFlg breakFlg = new BreakFlg();
//		{
//			JdbcTemplate jdbcTemplate = DbOperationUtils.getJdbcTemplate();
//			String dpMerge[] = {"{\"test_string\":\"test_string_value\"}","{\"a\":2}","{\"bbb\":2}","{\"ccc\":2}"};
//					//"[{\"ruler\":\"platform\",\"condition\":[\"android\",\"ios\"]},{\"symbol\":\"1\",\"ruler\":\"equipmentIds\",\"condition\":[\"8985851321\",\"8985851322\",\"8985851323\",\"8985851324\",\"8985851325\",\"8985851326\",\"8985851327\",\"8985851328\",\"8985851329\"]},{\"symbol\":\"0\",\"ruler\":\"channel\",\"condition\":[\"apphuawei\",\"ToDesk\"]}]";
//			int id = 10;
//
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					int counter = 0;
//					String sql = "update ums_dispatch_config set dp_merge = ? where id = ?";
//					int loopCounter = 0;
//					while(!breakFlg.breakFlg) {
//						int curCounter = counter;
//						int res = jdbcTemplate.update(sql, new PreparedStatementSetter() {
//							@Override
//							public void setValues(PreparedStatement preparedStatement) throws SQLException {
//								preparedStatement.setString(1, dpMerge[curCounter]);
//								preparedStatement.setInt(2, id);
//							}
//						});
//						System.out.println(DateUtil.formatDate(new Date()) + "---------------------------------["+loopCounter+"] update ums_dispatch_config to [" + dpMerge[curCounter] + "],res " + res);
//						counter ++;
//						if (counter >= dpMerge.length) {
//							counter = 0;
//						}
//						try {
//							Thread.sleep(8000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						loopCounter++;
//					}
//					// return res;
//				}
//			}).start();
//		}
//		ThreadPoolTaskExecutor executor = (ThreadPoolTaskExecutor) configExecutor();
//		int maxThread = 20;
//		int maxLoop = 150;
//		List<Future<CallResults>> fList = new ArrayList<>();
//		String reqBody = "{\"fullUpdate\":\"false\",\"platform\":\"android\",\"channel\":\"ToDesk\",\"version\":\"4.0.3\",\"custId\":\"\",\"deviceId\":\"898585132\",\"groupName\":\"todesk_group_toc\",\"env\":\"pro1\"}";
//
//		for (int i = 0; i < maxThread; i++) {
//			int id = i;
//			fList.add(executor.submit(new Callable<CallResults>() {
//				@Override
//				public CallResults call() throws Exception {
//					CallResults results = new CallResults();
//					results.setId(id);
//
//					for (int j = 0; j < maxLoop; j++) {
////						System.out.println(DateUtil.formatDate() + "=================================" +id + ":" + j);
//						CallResult result = new CallResult();
//						try {
//							result.setStart(new Date());
//							SyncConfigReqVo reqVo = JSONObject.parseObject(reqBody, SyncConfigReqVo.class);
//							reqVo.setDeviceId(reqVo.getDeviceId() + j);
//							String res = HttpUtils.doPost(url, JSONObject.toJSONString(reqVo));
//							result.setEnd(new Date());
//							result.setResults(res);
//							Thread.sleep(200);
//						} catch (Exception e) {
//							result.setResults(e.getMessage());
//						}
//						System.out.println(DateUtil.formatDate(new Date()) + "=================================" +id + ":" + j + ": "+JSONObject.toJSONString(result));
//						results.getResults().add(result);
//					}
//					return results;
//				}
//			}));
//		}
//
//		List<CallResults> resultList = new ArrayList<>();
//		for (Future<CallResults> fs : fList) {
//			try {
//				resultList.add(fs.get()); // 保存各个线程（任务）执行的结果
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// executorService.shutdownNow();
//				e.printStackTrace();
//			}
//		}
//		breakFlg.breakFlg = true;
////		for(CallResults ress:resultList) {
////			for(CallResult res:ress.getResults()) {
////				System.out.println(JSONObject.toJSONString(res));
////			}
////		}
//		// System.out.println("END");
//	}
//
//	public static class DbOperationUtils {
//
//		/**
//		 * 数据库连接需要的字符串
//		 */
//		public static final String username = "root";
//		public static final String password = "su123456";
//		public static final String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/todesk_admin";
//		public static final String driverName = "com.mysql.cj.jdbc.Driver";
//
//		public static JdbcTemplate getJdbcTemplate() {
//
//			// com.alibaba.druid.pool.DruidDataSource
//			DruidDataSource dataSource = new DruidDataSource();
//
//			// 设置数据源属性参数
//			dataSource.setPassword(password);
//			dataSource.setUrl(jdbcUrl);
//			dataSource.setUsername(username);
//			dataSource.setDriverClassName(driverName);
//
//			// 获取spring的JdbcTemplate
//			JdbcTemplate jdbcTemplate = new JdbcTemplate();
//			// 设置数据源
//			jdbcTemplate.setDataSource(dataSource);
//
//			return jdbcTemplate;
//		}
//
//	}
//
//}
