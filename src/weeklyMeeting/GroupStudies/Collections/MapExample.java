package weeklyMeeting.GroupStudies.Collections;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        String[] keys1 = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine",
                "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "watermelon", "blueberry", "blackberry",
                "cranberry", "grapefruit", "guava", "lime", "papaya", "pineapple", "pomegranate"};
        String[] values1 = {"red", "yellow", "red", "brown", "purple", "green", "purple", "green", "brown", "yellow", "orange",
                "orange", "orange", "green", "yellow", "red", "red", "orange", "green", "green", "green", "blue", "black", "red",
                "red", "green", "green", "green", "yellow", "red"};

        String[] keys2 = {"grape", "papaya", "lemon", "blueberry", "guava", "pear", "kiwi", "cranberry", "elderberry", "orange",
                "grapefruit", "banana", "pineapple", "watermelon", "cherry", "strawberry", "date", "blackberry", "lime", "honeydew",
                "fig", "apple", "pomegranate", "tangerine", "ugli fruit", "mango", "quince", "raspberry", "nectar"};
        String[] values2 = {"green", "red", "yellow", "green", "green", "green", "brown", "green", "purple", "red", "green",
                "yellow", "green", "yellow", "red", "red", "brown", "red", "green", "orange", "purple", "orange", "orange", "red",
                "green", "green", "green", "yellow", "green"};


        List<String> keysList1 = new LinkedList<>(Arrays.asList(keys1));
        List<String> valuesList1 = new LinkedList<>(Arrays.asList(values1));

        Map<String, String> firstPageKeysValues = new LinkedHashMap<>();
        for (int i = 0; i < keysList1.size(); i++) {
            firstPageKeysValues.put(keysList1.get(i), valuesList1.get(i));
        }


        List<String> keysList2 = new LinkedList<>(Arrays.asList(keys2));
        List<String> valuesList2 = new LinkedList<>(Arrays.asList(values2));

        Map<String, String> secondPageKeysValues = new LinkedHashMap<>();
        for (int i = 0; i < keysList2.size(); i++) {
            secondPageKeysValues.put(keysList2.get(i), valuesList2.get(i));
        }

        // Find missing elements in secondPageKeysValues
        Map<String, String> missingElements = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : firstPageKeysValues.entrySet()) {
            if (!secondPageKeysValues.containsKey(entry.getKey())) {
                missingElements.put(entry.getKey(), entry.getValue());
            }
        }

        // Display missing elements
        for (Map.Entry<String, String> entry : missingElements.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
