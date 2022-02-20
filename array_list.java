package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListResourceBundle;

public class Main {

    public static void main(String[] args) {
        int b = 3;
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, -2, 3, 1, 2));
        int a;
        a=Math.max(sum(arr.subList(0,b)),sum(arr.subList(arr.size()-b, arr.size())));
        int x=arr.get(0)+sum(arr.subList(arr.size()-b+1,arr.size()));
        int y=arr.get(arr.size()-1)+sum(arr.subList(0, arr.size()-b));
        int z;
        z=Math.max(x,y);
        System.out.println(Math.max(z,a));
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(a);
    }
    public static int sum(List<Integer> li) {
        int sum = 0;

        for (int i : li) {
            sum += i;
        }
        return sum;
    }
}
