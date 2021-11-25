package assignment.assignment4_selectionStatements;

public class Question6 {

	public static void main(String[] args) {
		
		int objectMass=20;
		double objectWeight=objectMass*9.8;
		
		if(objectWeight>1000) {
			System.out.println("Object is too heavy");
		}else if(objectWeight<10) {
			System.out.println("Object is too light");
		}else {
			System.out.println("Object is on normal weight");
		}

	}

}
