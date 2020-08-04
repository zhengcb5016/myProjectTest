package com.zhengcb.java;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {

        for (int i=0;i<=100;i++){
            System.out.println(i);
        }

        HashMap<String,String>  map=new HashMap<>();
        map.put("city1","杭州");
        map.put("city2","宁波");
        map.put("city3","上饶");

        String city3=map.get("city3");
        System.out.println("当前城市"+city3);

        map.remove("ciye2");
        System.out.println(map);


    }
}
