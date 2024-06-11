package generics;

import person.person;

public class GenericClassTest {
	public static void main(String[] args) {
		//GenericClass with String Type of data member
		GenericClass<String> StringObj=new GenericClass<String>();
		StringObj.set("Hello");
		System.out.println(StringObj.get());
		
		//GenericClass with Integer type of data number
		GenericClass<Integer> integerObj=new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
		//GenericClass With Person Object of data member
		GenericClass<Person> PersonObj=new GenericClass<Person>();
		PersonObj.set(new Person("Ajay","Chennai"));
		System.out.println(PersonObj.get());
	}

}
