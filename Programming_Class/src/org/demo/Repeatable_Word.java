package org.demo;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatable_Word {
	public static void main(String[] args) {
		String name = "Barath is for a better for a change than than";
		String[] split = name.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String a : split) {
			if (map.containsKey(a)) {
				Integer integer = map.get(a);
				map.put(a, integer + 1);
			} else {
				map.put(a, 1);
			}
			
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println(entry);
			}

		}

	}
}
