package com.core.LT;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("A"));
		set.add(new String("B"));
		set.add(new String("b"));
		System.out.println(set);
		TreeSet obj = new TreeSet();
		obj.add(set);
		System.out.println(obj);
	}
}
