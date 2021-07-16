package com.example.streamsfilter;
import java.util.*;
import java.util.stream.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Alpha","Beta","Gamma","Lamda","Omega");
        Stream<String> mystream=names.stream();
        Iterator<String> itr= mystream.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
