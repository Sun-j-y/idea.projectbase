package com.sforits.androidbaseedu.utils.io.file;

import java.io.File;
import java.io.IOException;

public class MyFile {
    public void test() {
        File file = new File("D:\\test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件已创建");
        } else {
            System.out.println("文件已存在");
        }


        File folder = new File("d:\\test1\\test2");
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdirs();
            System.out.println("创建文件夹");
        } else {
            System.out.println("文件夹已存在");
        }
    }
}
