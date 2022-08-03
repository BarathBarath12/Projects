package org.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List_to_Set {
public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	list.add(12);
	list.add(31);
	list.add(13);
	System.out.println("List " + list);
	Set<Object> set = new LinkedHashSet<Object>(list);
	set.add(89);
	System.out.println("Set " + set);
	
}
}
