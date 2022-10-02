package com.venvo.demo.generic;

import com.venvo.demo.generic.GenericClassExample;

import java.util.LinkedList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {
        List<String> link = new LinkedList();
        link.add("hello");
//        link.add(1);
        for (int i = 0; i <link.size() ; i++) {

            String itetm = link.get(i);
            System.out.println(itetm);
        }


        GenericClassExample<String> stringGenericClassExample = new GenericClassExample<String>("abc");
        GenericClassExample<Integer> integerExample = new GenericClassExample<Integer>(123);
        System.out.println(stringGenericClassExample.getMember().getClass());
        System.out.println(integerExample.getMember().getClass());
        System.out.println(stringGenericClassExample.sayHello("hahha"));


    }

}
