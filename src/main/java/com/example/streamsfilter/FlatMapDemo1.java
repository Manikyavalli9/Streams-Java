package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
List<Integer> list=Arrays.asList(10,20,30,40);
//flat map
        List<Integer> list1=Arrays.asList(10,20,30,40);
        List<Integer> list2=Arrays.asList(11,22,33,44);
        List<Integer> list3=Arrays.asList(12,24,36,48);
        List<Integer> list4=Arrays.asList(13,26,39,52);
        List<List<Integer>> finallist=Arrays.asList(list1,list2,list3,list4);//adding multiple collections to one single collections

       List<Integer> finalresults=finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        List<Integer> finalresults1=finallist.stream().flatMap(x->x.stream().map(n->n*10)).collect(Collectors.toList());
        //here if we want to perform operation on certain list use .map(n->n*10)
       System.out.println(finalresults);
       System.out.println(finalresults1);
//x represents a collection and we will add to stream again1
    }
}
