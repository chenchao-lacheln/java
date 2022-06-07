package com.lacheln.date_;

import java.time.Instant;
import java.util.Date;

/**
 * Instant_
 *
 * @author chenchao
 * @date 2022/6/7 9:46 PM
 * @since 1.0.0
 */
public class Instant_ {
    public static void main(String[] args) {
        //通过静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        // 通过 from() 方法 可以把 Instant 转成Date
        Date from = Date.from(now);
        //通过 toInstant() 方法可以把 from转换成 Instant对象
        Instant instant = from.toInstant();

    }
}
