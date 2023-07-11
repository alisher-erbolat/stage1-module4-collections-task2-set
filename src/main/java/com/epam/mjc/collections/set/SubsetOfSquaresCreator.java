package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer num : sourceList){
            if (num*num>=lowerBound && num*num<=upperBound) {
                treeSet.add(num*num);
            }
        }
        return treeSet;
    }
}
