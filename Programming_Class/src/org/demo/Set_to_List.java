package org.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_to_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Set<Object> set = new LinkedHashSet<Object>();
			set.add(12);
			set.add(31);
			set.add(13);
			System.out.println("set " + set);
			
			List<Object> list = new ArrayList<Object>(set);
			list.add(89);
			System.out.println("list " + list);
			
		}
	}


