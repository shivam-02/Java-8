package com.tm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambda {
    public static void main(String gg[]){
        List<String> names= Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names,(a,b)-> b.compareTo(a));
        System.out.println(names);
    }
}
