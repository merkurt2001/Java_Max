package weeklyMeeting.GroupStudies.SwitchStatement;

public class switchExample8 {

    public static void main(String[] args) {

        int age = 8;
//        String group;
        switch (age){
            case 4 : case 5 : {
                String group = "Play House";
            }
            case 6: case 7: case 8:{
                String group = "Nursery";
            } //System.out.println(group); create local variable
        }

    }

}
