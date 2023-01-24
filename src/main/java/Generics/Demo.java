package Generics;

import Generics.classGenerics.PrintSomething;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add("hello");

        String [] a = {"hello", "hi", "yo"};
        Integer [] x = {1,3,4,6,7};


      printELements( x);


        PrintSomething<String> printSomething = new PrintSomething<>("fdsf");

        printSomething.print();

//       for (int i : list){
//            System.out.println(i);
//        }


//        List list = new LinkedList();
//        list.add(new Integer(1));


//        Integer i = (Integer) list.iterator().next();
//        System.out.println(i);
    }

    public static  <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T> List<T>  printELements(T[] arr){
        for (T t : arr){
            System.out.println(t);
        }
        return null;
    }
}
