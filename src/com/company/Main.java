package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> alpha = new LinkedList<>();
        alpha.add("alpha 1");
        alpha.add("alpha 2");
        alpha.add("alpha 3");
        alpha.add("alpha 4");
        alpha.add("alpha 4");
        alpha.add("alpha 5");
        alpha.add("alpha 6");
        alpha.add("alpha 7");
        alpha.add("alpha 8");
        alpha.add("alpha 9");
        alpha.add("alpha 10");
        Queue<String> omega = new LinkedList<>();
        omega.add("carrot");
        omega.add("xbox");
        omega.add("PC");
        omega.add("stick");
        omega.add("light");
        System.out.print(omega);
        alpha.add(omega.poll());
        alpha.add(omega.poll());
        alpha.add(omega.poll());
        alpha.add(omega.poll());
        alpha.add(omega.poll());
        System.out.print(alpha);
    }
}
