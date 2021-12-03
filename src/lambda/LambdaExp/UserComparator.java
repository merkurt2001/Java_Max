package lambda.LambdaExp;

import java.util.Comparator;
import java.util.List;

public class UserComparator {

	public static void main(String[] args) {

		User sarah = new User("Sarah", 28);
		User james = new User("James", 35);
		User mary = new User("Marry", 33);
		User jhon1 = new User("Jhon", 24);
		User jhon2 = new User("Jhon", 25);

		List<User> users = List.of(sarah, james, mary, jhon1, jhon2);

		Comparator<User> cmpName = Comparator.comparing(user -> user.getName());

		// users.sort(cmpName);
		users.forEach(u -> System.out.println(u));

		Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
		Comparator<User> comparator = cmpName.thenComparing(cmpAge);
		Comparator<User> reversed = comparator.reversed();

		//users.sort(comparator); //it is not working ??
		users.forEach(u -> System.out.println(u));

	}

}
