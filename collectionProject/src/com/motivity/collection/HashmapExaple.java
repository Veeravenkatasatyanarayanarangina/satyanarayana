package com.motivity.collection;

import java.util.HashMap;

public class HashmapExaple
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "satya");
		hm.put(102, "abhi");
		hm.putIfAbsent(103, "noor");
		
	
		System.out.println(hm);
		//hm.putIfAbsent(102, "satya");
		System.out.println(hm);
		
		
	}

}
