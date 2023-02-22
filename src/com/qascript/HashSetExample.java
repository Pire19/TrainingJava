package com.qascript;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        values.add("java");
        values.add(".net");
        values.add("python");
        values.add(".net");
        values.add("python");

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);
        for(String s: removeDuplicates){
            System.out.println(s);
        }
    }
}
