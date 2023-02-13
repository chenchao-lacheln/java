package com.lacheln;

/**
 * BufferedReader_
 *
 * @author chenchao
 * @date 2022/10/18 5:24 PM
 * @since 1.0.0
 * 做成处理流/包装流
 */
public class BufferedReader_ extends Reader_{

    private Reader_ reader_; // 属性是 Reader_ 类型

    // 接收Reader_ 的子类对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //也可以直接调用，不进行扩展
    public void readFile(){ //封装一层
        reader_.readFile();
    }
    //让方法更加灵活，多次读取文件，或者加缓冲char[] ...
    //可以增加缓存，可以提交输入输出的效率
    //可以提供一些列便捷方法，使用更加灵活方便
    public void readFiles (int num){
        for (int i = 0;i < num;i++){
            reader_.readFile();
        }
    }

    //扩展readString ,批量处理字符串数据
    public void readStrings(int num){
        for (int i = 0;i < num;i++) {
            reader_.readString();
        }
    }
}
