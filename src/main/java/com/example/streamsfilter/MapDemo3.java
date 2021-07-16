package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,20,30,40,33,44,55);
        List<Integer> result=new ArrayList<Integer>();

        result=numbers.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(result);

        numbers.stream().map(m->m+20).forEach(m->System.out.println("without storing and using foreach"+" "+m));
    }
}
