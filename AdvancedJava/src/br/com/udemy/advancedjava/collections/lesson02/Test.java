package br.com.udemy.advancedjava.collections.lesson02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

//		System.out.println(arrayList);//		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(99));//		
//		System.out.println(arrayList.size());			
//		for(int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//		
//		for(Integer x : arrayList) {
//			System.out.println(x);
//		}
		
		list.remove(0);
		System.out.println(list);
		
		list = new LinkedList<>();
	}
}