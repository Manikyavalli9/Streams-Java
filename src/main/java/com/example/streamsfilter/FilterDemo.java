package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(10,20,33,39,30,40,50); //collections as list arraylist
        List<Integer> list1=new ArrayList<Integer>();
        //for loop without streams
        for(int n:list){
            if(n%2==0){
                list1.add(n);
                System.out.println("using for loop result is:"+n);

            }
        }
    //using streams
        list1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("The LIST after using stream and storing it in list1:"+list1);
//without storing list in list1
        list.stream().filter(n->n%2==0).forEach(n->System.out.println("without storing in any variable:"+n));
    }
}
