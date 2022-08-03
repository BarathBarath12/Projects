package org.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repeatable_Char {
	public static void main(String[] args) {
		String name = "Barath is for a better for a change than than";
		char[] split = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char a : split) {
			if (map.containsKey(a)) {
		 Integer integer = map.get(a);
		 map.put(a, integer + 1);
				
			} else {
				map.put(a, 1);
			}
			
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 0) {

				System.out.println(entry);
			}

		}

	}

}
