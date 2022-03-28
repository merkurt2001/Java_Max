package groupStudies.EU8_Groups.methodDev;

public class MysteryTouch {

	public static void main(String[] args) {
		String head = "shoulders";
		String knees = "toes";
		String elbow = "head";
		String eye = "eyes and ears";
		String ear = "eye";

		touch(ear, elbow); // touch you eye to your head
		touch(elbow, ear); // touch you head to your eye
		touch(head, "elbow"); //touch you shoulders to your elbow
		touch(eye, eye); // touch you eyes and ears to your eyes and ears
		touch(knees, "Toes"); //touch you toes to your Toes
		touch(head, "knees " + knees); // touch you shoulders to your knees toes
	}

	public static void touch(String elbow, String ear) {
		System.out.println("touch you " + elbow + " to your " + ear);

	}

}
