package groupStudies.EU7_Groups.package6;

public class lowerCaseToUpperCase {

	// str.substring(i, i+1).toUpperCase() points to string at 'i' itself and this
	// is done to that the toUppercase() can be applied
	// so it must be of type string and not char

	public static void main(String[] args) {
		String str = "Happy a";
		rep(str);

	}

	public static void rep(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				str = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
			} else
				str = str.substring(0, i) + str.substring(i, i + 1).toLowerCase() + str.substring(i + 1);
		}
		System.out.println(str);
	}

}
