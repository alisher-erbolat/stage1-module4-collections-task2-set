package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet = new HashSet<>();

        for (String str: firstSet) {
            if (secondSet.contains(str) && !thirdSet.contains(str)) newSet.add(str);
        }
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        newSet.addAll(thirdSet);
        return newSet;
    }
}
