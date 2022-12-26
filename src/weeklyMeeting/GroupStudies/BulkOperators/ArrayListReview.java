package weeklyMeeting.GroupStudies.BulkOperators;

import java.util.ArrayList;

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
        System.out.println(languages);

        System.out.println(languages.remove(2)); // gives the removed element name
        System.out.println(languages.remove("arabic")); //returns true or false


        //containsAll
        ArrayList<String> list = new ArrayList<>();
        languages.add("english");
        languages.add("arabic");

        if (languages.containsAll(list)) {
            System.out.println("languages has all lis");
        } else {
            System.out.println("some values are missing");
        }

        //removes all the elements from ArrayList and check without printing out
        languages.clear();
        System.out.println(languages.isEmpty());

    }
}
