package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

class Products{
    int id;
    String name;
    Double price;
    public Products(int id,String name, Double price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
List<Products> productslist=new ArrayList<Products>();
        productslist.add(new Products(1,"Lenovo",25000.00));
        productslist.add(new Products(2,"Lenovo1",25800.00));
        productslist.add(new Products(3,"Lenovo2",25600.00));
        productslist.add(new Products(1,"Lenovo22",25890.00));
        List<Products> list=new ArrayList<>();
        productslist.stream().filter(p->p.price>25000)  // filtering
                .forEach(pr->System.out.println(pr.name));//iterating capturing name pr.name
        productslist.stream().filter(p->p.price>25000)  // filtering
                .forEach(pr->System.out.println(pr.price));//capturing price

        productslist.stream().filter(p->p.price>25000)  // filtering
                .forEach(pr->System.out.println(pr.id));//capturing id





    }
}
