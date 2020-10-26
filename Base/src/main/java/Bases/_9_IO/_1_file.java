package Bases._9_IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class _1_file {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\Works\\IDEA\\BaseHello\\src\\main\\java\\Bases\\_9_IO\\file\\test.txt");
//        File file = new File("");
//        file.createNewFile();
        System.out.println(file.getParent());
        System.out.println(file.length());  // 文件大小
        System.out.println("文件是否存在? " + file.exists());  // exists()
        System.out.println("是否是文件? " + file.isFile());  // exists()
        System.out.println("是否目录? " + file.isDirectory());  // exists()

    }

    /**
     * 文件的创建和删除
     *
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        File file = new File("D:\\Works\\IDEA\\BaseHello\\src\\main\\java\\Bases\\_9_IO\\file\\test2.txt");
        if (file.exists()) {
            System.out.println("文件已存在!");
            System.out.println("删除文件: " + file.delete());
        } else {
            System.out.println("文件不存在!");
            System.out.println("创建文件: " + file.createNewFile());
        }
    }
}
