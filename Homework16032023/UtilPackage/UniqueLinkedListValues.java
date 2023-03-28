package Homework16032023.UtilPackage;

import java.util.HashSet;
import java.util.LinkedList;

public class UniqueLinkedListValues {
    public static LinkedList<String> getUniqueValues(LinkedList<String> inputList) {


        HashSet<String> uniqueValues = new HashSet<>();
        for (String value : inputList) {
            uniqueValues.add(value);
        }


        LinkedList<String> result = new LinkedList<>();
        for (String value : uniqueValues) {
            result.add(value);
        }

        return result;
    }
}
