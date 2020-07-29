package br.com.udemy.advancedjava.collections.lesson07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
//		Map<String, String> translations = new HashMap<>();//		
//		translations.put("кошка", "cat");
//		translations.put("собака", "dog");
//		translations.put("слон", "elephant");//		
//		for(Map.Entry entry : translations.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());	
//		}

		Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется никакого порядка
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке пары (ключ, значение) были добавлены в таком порядке они и вернутся
		Map<Integer, String> treeMap = new TreeMap<>(); // пары (ключ, значения) сортируются по ключу (естественный порядок)
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(39, "Bob");
		map.put(12, "Mike");		
		map.put(78, "Tom");		
		map.put(0, "Tim");		
		map.put(1500, "Lewis");		
		map.put(7, "Bib");		
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
	}
}