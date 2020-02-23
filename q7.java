package assignment1.Collections;

import java.util.*;


public class q7 {

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> map) {

        List<Map.Entry<Integer, Integer>> IntList = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(IntList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : IntList) {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(12);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(7);
        integerList.add(15);

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (map.containsKey(integerList.get(i)))
                map.put(integerList.get(i), map.get(integerList.get(i)) + 1);

            else
                map.put(integerList.get(i), 1);
        }

        Map<Integer, Integer> map1 = sortByValue((HashMap<Integer, Integer>) map);

        for (Map.Entry<Integer, Integer> en : map1.entrySet()) {
            System.out.println("Number = " + en.getKey() + ", Frequency = " + en.getValue());
        }

    }
}