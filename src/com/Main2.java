package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Pattern p8= Pattern.compile("[(a)b\1]");//leteral a b ( ) 1
        Matcher m8=p8.matcher("abc()\\1");
        while (m8.find()){
            System.out.println(m8.start()+" "+m8.group()+" ");
        }
        System.out.println("");
    }
}
