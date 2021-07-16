package com.example.streamsfilter;
import java.util.*;

public class ParallelDemo {
    public static void main(String[] args) {
        List<Double> mylist=Arrays.asList(10.1,30.3,40.6,60.8,77.7);
        double productOfRoots=mylist.parallelStream().reduce(1.0,(a,b)->a*Math.sqrt(b),(a,b)->a*b);
        System.out.println("Product of roots"+productOfRoots);

    }
}
