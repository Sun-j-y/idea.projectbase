package com.sforits.androidbaseedu.book.zuoye._03._01;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) { // 是大写
                stringBuffer.append(Character.toLowerCase(c));
            } else {
                stringBuffer.append(Character.toUpperCase(c));
            }
        }
        System.out.println(stringBuffer);
    }
}
