package com.qa.javasessions;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistsample {
	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("California");
		ar1.add("Washington");
		ar1.add("Utah");
		ar1.add("Texas");
		ar1.add("Nevada");
		ar1.add("Arizona");
		ar1.add("Kansas");
		ar1.add("lowa");
		ar1.add("Oregon");
		ar1.add("NewYork");
		Iterator<String> it = ar1.iterator();
		while (it.hasNext()) {
			String states = it.next();
			System.out.println(states);

		}
	}
}
