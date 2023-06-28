package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		s2.add("A");
		s2.add("D");
		
		System.out.println(s1);
		System.out.println(s2);
		
//		합집합
		Set<String> union = new HashSet<String>(s1);
		System.out.println(union);
		union.addAll(s2);
		System.out.println("합집합 : "+union);
		
//		교집합
		Set<String> Intersaction = new HashSet<String>(s1);
		Intersaction.retainAll(s2);
		System.out.println("교집합 : "+Intersaction);
		
//		차집합
		Set<String> dif = new HashSet<String>(s1);
		dif.removeAll(s2);
		System.out.println("차집합 : "+dif);
		
	}
}
