package person;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in); 
		String name;
		System.out.println("Enter the person name:");
		name=ob.next();
		System.out.println("Enter the age:");
		int age=ob.nextInt();
		System.out.println("Enter the gender:");
		String gender=ob.next();
		System.out.println("Enter the taxable income:");
		int income=ob.nextInt();
		person person=new person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After calculating Tax:");
		System.out.println(person);
		ob.close();
		
		
		
				
				

	}

}
