package main.java;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>((Integer o1, Integer o2) -> {
                if (o1 % 2 == 0) {
                    if (o2 % 2 == 0) {
                        return o1 - o2;
                    }
                    return -1;
                } else if (o2 % 2 == 0) {
                    return 1;
                } else
                    return o1 - o2;
            });

        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(5);

        System.out.println(treeSet);
    }
}
