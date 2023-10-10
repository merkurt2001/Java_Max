package weeklyMeeting.GroupStudies.Collections;

import java.util.*;

public class MapExample1 {

    public static void main(String[] args) {


        String[] keys1 = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine",
                "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "watermelon", "blueberry", "blackberry",
                "cranberry", "grapefruit", "guava", "lime", "papaya", "pineappl", "pomegranate"};//pineapple mistype
        String[] values1 = {"red", "yellow", "red", "brown", "purple", "green", "purple", "green", "brown", "yellow", "orange",
                "orange", "orange", "green", "yellow", "red", "red", "orange", "green", "green", "green", "blue", "black", "red",
                "red", "green", "green", "green", "yellow", "red"};

        String[] keys2 = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine",
                "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "watermelon", "blueberry", "blackberry",
                "cranberry", "grapefruit", "guava", "lime", "papaya", "pineapple", "pomegranate"};//last element pomegranete
        String[] values2 = {"red", "yellow", "red", "brown", "purple", "green", "purple", "green", "brown", "yellow", "orange",
                "orange", "orange", "green", "yellow", "red", "red", "orange", "green", "green", "green", "blue", "black", "red",
                "red", "green", "green", "green", "yellow", "red"};


        Map<String, String> firstPageKeysValues = new LinkedHashMap<>();
        List<String> keysList1 = new LinkedList<>(Arrays.asList(keys1));
        List<String> valuesList1 = new LinkedList<>(Arrays.asList(values1));

        Map<String, String> secondPageKeysValues = new LinkedHashMap<>();
        List<String> keysList2 = new LinkedList<>(Arrays.asList(keys2));
        List<String> valuesList2 = new LinkedList<>(Arrays.asList(values2));

        for (int i = 0; i < keysList1.size(); i++) {
            firstPageKeysValues.put(keysList1.get(i), valuesList1.get(i));
        }

        for (int i = 0; i < keysList2.size(); i++) {
            secondPageKeysValues.put(keysList2.get(i), valuesList2.get(i));
        }

        // Check for missing keys in secondPageKeysValues
        for (String key : firstPageKeysValues.keySet()) {
            if (!secondPageKeysValues.containsKey(key)) {
                System.out.println("Key missing in secondPageKeysValues: " + key);
            }
        }

        // Check for missing keys in firstPageKeysValues
        for (String key : secondPageKeysValues.keySet()) {
            if (!firstPageKeysValues.containsKey(key)) {
                System.out.println("Key missing in firstPageKeysValues: " + key);
            }
        }





        for (Map.Entry<String, String> entry : firstPageKeysValues.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();
            String value2 = secondPageKeysValues.get(key);
            // Check for mistyped values
            if (!value1.equals(value2)) {
                System.out.println("Mismatched value for key '" + key + "': " + value1 + " (firstPageKeysValues) vs. " + value2 + " (secondPageKeysValues)");
            }
// Check for missing values in secondPageKeysValues
            if (value2 == null) {
                System.out.println("Value missing in secondPageKeysValues for key '" + key + "'");
            }
        }

        List<Map<String, String>> listOfMap = new LinkedList<>();
        listOfMap.add(firstPageKeysValues);
        System.out.println(firstPageKeysValues);
        System.out.println(listOfMap);


    }
}
