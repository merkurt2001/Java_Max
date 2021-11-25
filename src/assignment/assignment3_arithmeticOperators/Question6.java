package assignment.assignment3_arithmeticOperators;

/*

Question-6

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and 
outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup of coffee has approximately 
160 mg of caffeine.

In one gram there is 1000 mg.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
 */

public class Question6 {

	public static void main(String[] args) {
		
		double numberOfMilligrams = 500;
		
		double gram = numberOfMilligrams / 1000;
		
		int countDrinks = (int) (10 / gram);
		
		System.out.println("it would take about " + countDrinks + " drinks for a lethal overdose");
		
		

	}

}
