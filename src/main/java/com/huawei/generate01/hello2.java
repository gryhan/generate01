package com.huawei.generate01;

/**
 * Created by HIAPAD on 2019/9/11.
 */
public class hello2 {

    public void abc(String[] args) {
        byte[] bytes = "abc".getBytes();
        String str = new String(bytes);
        System.out.println("args = [" + str + "]");
        str = "1"+"1"+"1"+"1"+"1"+"1"+"1";
        System.out.println("args = [" + str + "]");
    }
}
