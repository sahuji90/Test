package com.java8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args)
    {
        Comparator <Integer>comparator = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        };
        System.out.println("using comparator "+comparator.compare(3,2));
        Comparator <Integer> comparator1 = (a,b) -> a.compareTo(b);

        System.out.println("using lambda comparator: " +comparator1.compare(3,2));
    }
}
