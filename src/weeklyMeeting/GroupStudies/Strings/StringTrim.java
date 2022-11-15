package weeklyMeeting.GroupStudies.Strings;

public class StringTrim {

    public static void main(String[] args) {

//        String str= " ";
//        str.trim();
//
//        System.out.println(str.equals("") + " " + str.isEmpty());

        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1);
        System.out.println(str2);


        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");

        System.out.println(sb);

        String sb1 = new String("hello");
        sb1.concat(" world");
        System.out.println(sb1);
        System.out.println("sb.hashCode() = " + sb.hashCode());


    }
}
