package Homework16032023.UtilPackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class Intersection {

    public static LinkedList<Integer> intersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();


        ListIterator<Integer> iterator1 = list1.listIterator();
        while (iterator1.hasNext()) {
            Integer element = iterator1.next();

            if (list2.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}