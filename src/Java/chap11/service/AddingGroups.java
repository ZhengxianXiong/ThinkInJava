package chap11.service;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {1, 2, 3, 4, 5, 6};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 1, 2, 3, 4, 5);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(12, 13, 13, 14, 16);
        list.set(1, 99);
    }
}
