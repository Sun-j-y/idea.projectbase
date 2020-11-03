package com.sforits.androidbaseedu.utils.file;

import org.junit.Test;

import java.io.File;
import java.util.*;

public class Files {

    /**
     * 递归遍历指定目录下的所有子目录及其文件
     *
     * @param file     指定目录的File对象
     * @param fileList 遍历结果要存入的列表
     */
    public void fileAndDir(File file, List<File> fileList) {
        File[] files = file.listFiles();

        for (File f : files) {
            fileList.add(f);
            System.out.println(f);
            if (f.isDirectory()) {
                fileAndDir(f, fileList);
            }
        }
    }

    /**
     * 获取所有XML文件
     *
     * @param path     文件路径
     * @param fileList 存放所有XML文件的列表
     */
    public void getXmlFiles(String path, List<File> fileList) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File fileIndex : files) {
            if (!fileIndex.exists()) {
                throw new NullPointerException("Cannot find " + fileIndex);
            } else if (fileIndex.isFile()) {
                fileList.add(fileIndex);
            } else {
                if (fileIndex.isDirectory()) {
                    getXmlFiles(fileIndex.getAbsolutePath(), fileList);
                }
            }
        }
    }

    @Test
    public void test2() {
        //声明一个HashMap，用于存放XML文件，格式：<文件名，文件>，以文件名为KEY，可以得到整个文件所在的路径和文件名
        Map<String, String> filePathMap = new HashMap<>();

        //存放xml文件的根目录
        String filePath = "C:\\download\\file";
        //声明一个List，用于存放所有得到的XML文件
        List<File> fileList = new ArrayList<>();

        getXmlFiles(filePath, fileList);

        for (File f : fileList) {
            System.out.println(f);
            //把每个文件存放到HashMap中
            filePathMap.put(f.getName(), f.getAbsolutePath());
        }
        System.out.println(filePathMap);
    }

    @Test
    public void test() {
        List<File> files = new ArrayList<>();
//        Arrays.stream(new File("D:/Test").listFiles()).forEach(System.out::println);
        try {
            fileAndDir(new File("D:\\Test"), files);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------");
        System.out.println(files.toArray().length);
    }
}
