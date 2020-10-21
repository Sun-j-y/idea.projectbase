package com.sforits.BasePlus.二维码;

import com.sforits.BasePlus.二维码.util.QRCodeUtil;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/20-14:21 Created by IntelliJ IDEA.
 */
public class TestExample {
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        // 二维码中的内容可以是文字，可以是链接等
        String text = "http://www.baidu.com";
        // 嵌入二维码的图片路径
        //String imgPath = "C:\\Users\\Administrator\\Pictures\\img\\dog.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:\\" + System.currentTimeMillis() + ".jpg";
        //生成二维码
        QRCodeUtil.encode(text, null, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
}