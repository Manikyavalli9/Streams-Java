package com.example.streamsfilter;
import java.util.*;
import java.util.stream.Collectors;

class ObjectProducts{
    int objid;
    String name;
    int salary;

    ObjectProducts(int objid,String name,int salary){
        this.objid=objid;
        this.name=name;
        this.salary=salary;
    }
}


public class MapDemo4 {
    public static void main(String[] args) {
List<ObjectProducts> objectsproducts=new ArrayList<ObjectProducts>();
        objectsproducts.add(new ObjectProducts(101,"Laptop",23000));
        objectsproducts.add(new ObjectProducts(102,"Laptop 1",25000));
        objectsproducts.add(new ObjectProducts(103,"Laptop 2",26000));
        objectsproducts.add(new ObjectProducts(104,"Laptop 3",27000));
        //combination of filter and mapp
        List<Integer> result=objectsproducts.stream().filter(n->n.salary>23000).map(n->n.salary).collect(Collectors.toList());
        System.out.println(result);
    }
}
