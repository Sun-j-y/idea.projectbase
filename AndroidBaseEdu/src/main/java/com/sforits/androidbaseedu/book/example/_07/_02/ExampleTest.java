package com.sforits.androidbaseedu.book.example._07._02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleTest {
    public static void main(String[] args) throws IOException {
        //
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Test\\out1.txt");

//        String str = "hello";
//        fileOutputStream.write(str.getBytes());
        File file = new File("D:\\Test");
        System.out.println(file.isDirectory());
        fileOutputStream.close();
    }
}
