package groupStudies.EU6_Groups.package2;

public class MysteryTouch {

	public static void main(String[] args) {
		String head = "shoulders";
		String knees = "toes";
		String elbow = "head";
		String eye = "eyes and ears";
		String ear = "eye";

		touch(ear, elbow);  // touch you eye to your head
		touch(elbow, ear); // touch you head to your eye
		touch(head, "bani"); // touch you shoulders to your bani
		touch(eye, eye);   // touch you eyes an ears to your eyes an ears
		touch(knees, "Toes"); // touch you toes and Toes
		touch(head, "knees " + knees); //touch you shoulder to your knees toes
	}
	public static void touch(String elbow, String ear) {
		System.out.println("touch you " + elbow + " to your " + ear);
		

	}

}
