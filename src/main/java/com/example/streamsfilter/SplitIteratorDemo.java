package com.example.streamsfilter;
import java.util.*;
import java.util.stream.*;

public class SplitIteratorDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Alpha","Beta","Gamma","Lamda","Omega");
        Stream<String> mystream=names.stream();
        Spliterator<String> splititr= mystream.spliterator();
        while(splititr.tryAdvance(n-> System.out.println(n)));
    }
}
