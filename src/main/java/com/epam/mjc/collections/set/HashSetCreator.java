package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(sourceList);

        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                int x = integer;
                hashSet.add(x);
                while (x % 2 == 0) {
                    x /= 2;
                    hashSet.add(x);
                }
            } else {
                hashSet.add(integer);
                hashSet.add(integer * 2);
            }
        }
        return hashSet;
    }
}
