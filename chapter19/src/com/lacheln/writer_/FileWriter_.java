package com.lacheln.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter_
 *
 * @author chenchao
 * @date 2022/10/17 6:23 PM
 * @since 1.0.0
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/chenchao/tmp/note.txt";
        // 1.创建 FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath); //默认是覆盖写入
//            3) write(int):写入单个字符
            fileWriter.write('H');
//            4) write(char[):写入指定数组
            fileWriter.write(chars);
//            5) write(char[],off,len):写入指定数组的指定部分 toCharArray()转换为字符数组
            fileWriter.write("霍格沃兹魔法学院".toCharArray(),0,3);
//            6) write (string) :写入整个字符串
            fileWriter.write("你好 上海 ~~");
//            7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("北京上海",0,2);
            //在数据量大的情况下，可以使用循环操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 对应FileWriter，一定要关闭流，或者flush才能正在的把数据写入 -->> 源码解读  底层还是用的FileOutoutStream 文件输出流
            /*
                源码解读
            private void writeBytes() throws IOException {
                    this.bb.flip();
                    int var1 = this.bb.limit();
                    int var2 = this.bb.position();

                    assert var2 <= var1;

                    int var3 = var2 <= var1 ? var1 - var2 : 0;
                    if (var3 > 0) {
                        if (this.ch != null) {
                            assert this.ch.write(this.bb) == var3 : var3;
                        } else {
                            this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);
                        }
                    }

                    this.bb.clear();
                }

             */
            try {
                //关闭文件流 等价于 flush() + 关闭
                fileWriter.close();
//                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束....");
    }
}
