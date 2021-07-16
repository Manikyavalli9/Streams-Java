package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(null,10,20,30,40,null);
        List<Integer> list1=new ArrayList<Integer>();
        list1 = list.stream().filter(l-> l!=null).collect(Collectors.toList());
        System.out.println("List after storing in list1"+list1);
        //for each
        list.stream().filter(l->l!=null).forEach(l->System.out.println("without using list1 result is printed"+l));

    }
}
