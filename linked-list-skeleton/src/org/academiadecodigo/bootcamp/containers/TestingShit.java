package org.academiadecodigo.bootcamp.containers;

import java.util.Iterator;

public class TestingShit {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);


        Iterator<Integer> interator = list.iterator();

        for(Integer i : list){
            System.out.println("Iteraded: " + i);
        }

    }

}
