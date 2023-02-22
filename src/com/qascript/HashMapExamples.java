package com.qascript;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        HashMap<Integer,String> languages = new HashMap<>();

        languages.put(1,"java");
        languages.put(2,"python");
        languages.put(3,"net");

        System.out.println(languages);

        if(languages.containsKey(1)){
            System.out.println(languages.get(1));
        }
        if(!languages.isEmpty()){
            System.out.println("Hashmap contains mappings");
        }

        languages.remove(3);
        System.out.println(languages);
    }
}
