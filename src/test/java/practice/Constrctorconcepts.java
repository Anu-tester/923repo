package practice;

import org.testng.annotations.Test;

public class Constrctorconcepts {
int age;
String name;
	@Test
	public Constrctorconcepts() {
		
		System.out.println("This is default constructor");
	}
	@Test
	public Constrctorconcepts(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constrctorconcepts obj=new Constrctorconcepts(20,"Apple");
		

	}

}
