package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles=Arrays.asList("Car","Bus","Scooty","Van");
        List<String> upper=new ArrayList<String>();
        //forloop
        for(String names:vehicles){
           upper.add(names.toUpperCase(Locale.ROOT));
        }
        //using stream
        upper=vehicles.stream().map(names->names.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);
//for each
        vehicles.stream().map(name->name.toUpperCase()).forEach(name->System.out.println("without storing in variable:"+name));


        System.out.println(upper);
    }
}
