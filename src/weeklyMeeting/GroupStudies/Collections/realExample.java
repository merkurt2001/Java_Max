package weeklyMeeting.GroupStudies.Collections;

import java.util.*;

public class realExample {

    public static void main(String[] args) {

        String[] keys1 = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine",
                "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "watermelon", "blueberry", "blackberry",
                "cranberry", "grapefruit", "guava", "lime", "papaya", "pineapple", "pomegranate"};
        String[] values1 = {"red", "yellow", "red", "brown", "purple", "green", "purple", "green", "brown", "yellow", "orange",
                "orange", "orange", "green", "yellow", "red", "red", "orange", "green", "green", "green", "blue", "black", "red",
                "red", "green", "green", "green", "yellow", "red"};

        String[] keys2 = { "  ", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine",
                "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "watermelon", "blueberry", "blackberry",
                "cranberry", "grapefruit", "guava", "lime", "papaya", "pineapple", "pomegranate"};
        String[] values2 = {"red", "yellow", "red", "brown", "purple", "green", "purple", "green", "brown", "yellow", "orange",
                "orange", "orange", "green", "yellow", "red", "red", "orange", "green", "green", "green", "blue", "black", "red",
                "red", "green", "green", "green", "yellow", "red"};



        Map<String, String> firstPageKeysAndValues = new LinkedHashMap<>();
        for (int i = 0; i < keys1.length; i++) {
            firstPageKeysAndValues.put(keys1[i], values1[i]);
        }

        List<Map<String, String>> firstPageKeyAndValuesList = new LinkedList<>();
        for (Map.Entry<String, String> stringStringEntry : firstPageKeysAndValues.entrySet()) {
            Map<String, String> keysValues = new LinkedHashMap<>();
            keysValues.put(stringStringEntry.getKey(), stringStringEntry.getValue());
            firstPageKeyAndValuesList.add(keysValues);
        }

        Map<String, String> secondPageKeysAndValues = new LinkedHashMap<>();
        for (int i = 0; i < keys2.length; i++) {
            secondPageKeysAndValues.put(keys2[i], values2[i]);
        }

        List<Map<String, String>> secondPageKeyAndValuesList = new LinkedList<>();
        for (Map.Entry<String, String> stringStringEntry : secondPageKeysAndValues.entrySet()) {
            Map<String, String> keysValues = new LinkedHashMap<>();
            keysValues.put(stringStringEntry.getKey(), stringStringEntry.getValue());
            secondPageKeyAndValuesList.add(keysValues);
        }

        // Compare firstPageKeyAndValuesList with secondPageKeyAndValuesList
        for (int i = 0; i < firstPageKeyAndValuesList.size(); i++) {
            Map<String, String> firstPageMap = firstPageKeyAndValuesList.get(i);
            Map<String, String> secondPageMap = secondPageKeyAndValuesList.get(i);

            // Check each key in the first page
            for (String key : firstPageMap.keySet()) {
                if (!secondPageMap.containsKey(key)) {
                    System.out.println("Key '" + key + "' is missing in the second page.");
                } else {
                    String value1 = firstPageMap.get(key);
                    String value2 = secondPageMap.get(key);
                    if (!value1.equals(value2)) {
                        System.out.println("Key '" + key + "' has different values: '" + value1 + "' in the first page and '" + value2 + "' in the second page.");
                    }
                }
            }

            // Check each key in the second page that is not in the first page
            for (String key : secondPageMap.keySet()) {
                if (!firstPageMap.containsKey(key)) {
                    System.out.println("Key '" + key + "' is missing in the first page.");
                }
            }
        }
    }
}
