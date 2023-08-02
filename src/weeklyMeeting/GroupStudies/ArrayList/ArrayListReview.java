package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
    public static void main(String[] args) {
        //Creating an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        //Assigning values to arrayList
        languages.add("Java");
        languages.add("english");
        languages.add("arabic");
        languages.add("turkish");
        languages.add("dutch");
        languages.add("turkish");
        languages.add("turkish");
        languages.add("turkish");
        languages.add("turkish");
        languages.add("turkish");
        languages.add("turkish");
        languages.add("chinese");
        languages.add("turkish");

        //How can I print out all elements of the ArrayList
        System.out.println(languages);

        //How can I get the lenght of the ArrayList
        System.out.println("to get length of ArrayList = " + languages.size());

        //inserts element to ArrayList
        languages.add("russian");
        System.out.println(languages);

        //print out the first element from ArrayList
        System.out.println("first element = " + languages.get(0));


        //add index 0 "ruby"
        languages.add(0, "ruby");
        System.out.println(languages);

        //set index 0 "python"
        languages.set(0, "python");
        System.out.println(languages);

        //get the index number of "arabic"
        int index = languages.indexOf("arabic");
        System.out.println(index);

        //how to check if englis is the second position
        System.out.println(languages.get(2).equals("english"));
        System.out.println(languages.indexOf("english") == 2);


        //remove all the "turkish" by using regular for loop
        System.out.println("removing turkish"); //do not use remove method inside for loop or if you want to use
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).equals("turkish")) {
                languages.remove(i);
                i--; // do not forget to decrease the iterator when the condition is true
            }
        }

        //second approach to remove element from ArrayList

        languages.removeAll(Arrays.asList("turkish"));
        //this method is used to remove all the elements from a list that are contained in the specific collection


        //third approach to remove an element from ArrayList

        languages.removeIf(each -> each.equals("turkish"));
        //this method is used to remove all of the elements of this collection that satisfy the given predicate.
        System.out.println(languages);

        System.out.println(languages.remove(1));
        System.out.println(languages.remove("arabic"));


        ArrayList<String> newList = new ArrayList<>(Arrays.asList("chinese", "dutch"));
        System.out.println(newList);

        if (languages.containsAll(newList)) {
            System.out.println("languages has all list");
        } else {
            System.out.println("some values are missing");
        }

        System.out.println(languages);


        //how to add one list to another


        languages.addAll(newList);
        //this method is used to append all of the elements in the specified collection to the end of the list.
        System.out.println(languages);


        //replace all chinese with russian

        Collections.replaceAll(languages, "chinese", "russian");//
        // this method is used to replace each element of this list with the result of appliying the operator that element

        System.out.println(languages);


        //retain all the elements that languages and newList has

        languages.retainAll(newList);
        //this method is used to remove it’s elements from a list that are not contained in the specific collection
        System.out.println(languages);


        languages.clear();
        System.out.println(languages);

        System.out.println(languages.isEmpty());


    }
}
