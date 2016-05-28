package com.empty.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo3 {

	public static void main(String[] args) {
		String [] str = {"yuwen","yingyu","yuwen","shuxue","shuxue"};
		Tools.Tool(str);
		Tools.print();

	}

}

class Tools{
	static HashMap<String, Integer> data = new HashMap<>();
	public static void Tool(String[] str){
		for(int i = 0;i<str.length;i++){
			String sdata = str[i];
			if(data.get(sdata)==null){
				data.put(sdata, 1);
			}else{
				data.put(sdata, data.get(sdata)+1);
			}
		}
	}
	
	public static void print(){      
		Set<Map.Entry<String, Integer>> out = data.entrySet();
		for(Map.Entry<String, Integer> o:out){
			System.out.println(o.getKey()+"出现的次数为"+o.getValue());
		}
	}
}
