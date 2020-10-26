package Bases._9_IO;

import org.junit.Test;

import java.io.*;

/*
读写文件
    一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
FileInputStream
    该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
    有多种构造方法可用来创建对象。
    可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
        InputStream f = new FileInputStream("C:/java/hello");
    也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象：
        File f = new File("C:/java/hello");
        InputStream out = new FileInputStream(f);

*/
public class _3_RWFile {

    /**
     * FileInputStream
     *
     * @throws FileNotFoundException
     */
    @Test
    public void test1() throws IOException {
        // InputStream fileInputStream = new FileInputStream("D:\\Works\\IDEA\\BaseHello\\src\\main\\java\\Bases\\_9_IO\\file\\test.txt");

        File file = new File("D:\\\\Works\\\\IDEA\\\\BaseHello\\\\src\\\\main\\\\java\\\\Bases\\\\_9_IO\\\\file\\\\test.txt");
        InputStream inputStream = new FileInputStream(file);
        int read = inputStream.read();
        // int read1 = inputStream.read(new byte[3]);

        System.out.println(read);
        //  System.out.println(read1);
        inputStream.close();  // 关闭此文件输入流并释放与此流有关的所有系统资源。抛出IOException异常。
    }
}
