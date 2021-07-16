package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Stream;


public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(10,30,66,88,78,100,67,66);
        System.out.println("The original list is: "+list);
        Stream<Integer> mystream=list.stream();
        Optional<Integer> minval=mystream.min(Integer::compare);
        if(minval.isPresent())
        System.out.println("The min val is:"+minval.get());
        //max
       mystream=list.stream();
        Optional<Integer> maxval=mystream.max(Integer::compare);
        if(maxval.isPresent())
            System.out.println("The max value is: "+maxval.get());
        //sort
        Stream<Integer> sortedStream=list.stream().sorted();
        System.out.println("Sorted stream is :");
        sortedStream.forEach((n)->System.out.println(n+" "));
        System.out.println();
        //displaying odd values
        Stream<Integer> oddvals=list.stream().sorted().filter(n->n%2==1);
        oddvals.forEach(n->System.out.println("odd value: "+n));

    }
}
