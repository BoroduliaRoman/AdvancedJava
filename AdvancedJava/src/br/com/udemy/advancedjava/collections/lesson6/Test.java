package br.com.udemy.advancedjava.collections.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "����");
		map.put(2, "���");
		map.put(3, "���");
		
//		System.out.println(map);//		
//		map.put(3, "������ �������� ��� ����� ���");//		
//		System.out.println(map);//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(10));	
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}