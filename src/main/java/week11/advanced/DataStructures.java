package week11.advanced;

import java.util.*;

public class DataStructures {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Gokhan");
        nameList.add("Jack");

        System.out.println("Coming from name arraylist : " + nameList.get(0));

        List<String> nameList2 = new LinkedList<>();
        nameList2.add("Gokhan");
        nameList2.add("Jack");

        System.out.println("Coming from name linkedlist : " + nameList.get(0));

        Set<String> nameSet = new HashSet<>();
        nameSet.add("Gokhan");
        nameSet.add("Jack");
        for (String name : nameSet) {
            System.out.println("Coming from name set : " + name);
        }

        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(76, "Gokhan");
        nameMap.put(1145, "Jack");

        System.out.println("Coming from name map : " + nameMap.get(1145));
    }
}
