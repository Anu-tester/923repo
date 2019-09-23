package com.qa.javasessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void getsum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}
	@Test
	public void getsubstract() {
		int a = 10;
		int b = 20;
		int c = b - a;
		System.out.println(c);

	}
	@Test
	public void getmultiply() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}
	@AfterSuite
	public void getaftersuit() {
		System.out.println("This is After suit method");
	}
	@BeforeSuite
	public void getbeforesuit() {
		System.out.println("This is BEFORE suit method");
	}
	@AfterTest
	public void getafterTEST() {
		System.out.println("This is AfterTEST method");
	}
	@BeforeTest
	public void getbeforetest() {
		System.out.println("This is BEFORE TEST method");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is beforeclass method");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is beforemethod method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is aftermethod method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("This is afterclass method");
	}
	
}
