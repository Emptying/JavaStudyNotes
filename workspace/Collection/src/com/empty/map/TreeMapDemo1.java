package com.empty.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tdata = new TreeMap<>();
		tdata.put(7, "yuwen");
		tdata.put(9, "shuxue");
		tdata.put(3, "yingyu");
		tdata.put(5, "huaxue");
		tdata.put(10, "shengwu");
		Set<Map.Entry<Integer, String>> sdata = tdata.entrySet();
		for(Map.Entry<Integer,String> o:sdata){
			System.out.println(o);
		}
		
	}

}
