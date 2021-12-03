package lambda.LambdaExp;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

/**
 * @author shift+alt+J ---for eclipse
 *
 */
public class SomeMapping {

	public static void main(String[] args) {
		
		
		User sarah = new User("Sarah");
		User james = new User("James");
		User mary = new User("Marry");
		User jhon = new User("Jhon");
		
		List<User> users= List.of(sarah, james, mary, jhon);
		List<String> names= new ArrayList<>();
		
		Function<User, String> toName = (User user) -> user.getName();
		
		for (User user  : users) {
			String name = toName.apply(user);
			names.add(name);
		}
		
		users.forEach( u-> System.out.println(u));
		names.forEach(u->System.out.println(u));
				
				

	}

}
