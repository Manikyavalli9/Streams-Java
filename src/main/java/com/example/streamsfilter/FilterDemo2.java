package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Buses","John","Lisa","Gamma","GammaRays","Hulk");
        List<String> names1=new ArrayList<String>();

        names1=names.stream().filter(n->n.length()<6).collect(Collectors.toList());

        System.out.println("Names after storing it in names1 variable:"+names1);

        names1=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());

        System.out.println("Names after storing it in names1 variable and using str is:"+names1);

        names.stream().filter(str->str.length()>8 ).forEach(str->System.out.println("Without storing in variable printing result"+str));
        names.stream().filter(n->n.length()>8 ).forEach(str->System.out.println("Without storing in variable printing result using n in condition"+str));
    }
}
