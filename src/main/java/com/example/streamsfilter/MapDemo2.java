package com.example.streamsfilter;
import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles=Arrays.asList("Car","Bus","Scooty","Van");
        List<String> lengths=new ArrayList<String>();
        //for loop
        for(String names :vehicles){
       System.out.println(names.length());
        }
        //using streams
        vehicles.stream().map(vnames->vnames.length()).forEach(len->System.out.println("To give length"+" "+len)); //vnames is created consumer method..
    }
}
