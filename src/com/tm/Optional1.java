package com.tm;

import java.util.Optional;

public class Optional1 {
    public static void main(String gg[])
    {
        Optional<String> optional=Optional.of("shivam");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("Another string"));
        optional.ifPresent((s)->System.out.println(s.charAt(0)));
    }
}
