package com.yupi.cli.pattern;

public class StringDemo {
    public static void main(String args[]) {
        String site = "www.hao123.com";
        int len = site.length();
        System.out.println("hao123网址长度 : " + len);
        String string1 = "百度网址：";
        System.out.println("1、" + string1 + "www.baidu.com");
        String string2 = "腾讯网址：";
        System.out.println("1、" + string2 + "www.qq.com");
        String string3 = "网易网址：";
        System.out.println("1、" + string3 + "www.163.com");
        String string4 = "哔哩哔哩网址：";
        System.out.println("1、 "+  string4 + "www.bilibili.com");
    }
}
