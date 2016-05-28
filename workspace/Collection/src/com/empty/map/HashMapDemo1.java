package com.empty.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		map.put("yuwen", "语文");
		map.put("shuxue", "数学");
		map.put("yingyu", "英语");
		System.out.println(map);
		System.out.println(map.get("yuwen"));
		//返回容器中所有的key
		Set<String> set = map.keySet();
		for(String sets:set){
			System.out.println(sets+",");
		}
		//返回容器中所有的values
		Collection<String> val = map.values();
		for(String vals:val){
			System.out.println(vals);
		}
		//返回此映射所包含的映射关系的
		Set<Map.Entry<String, String>> maps=map.entrySet();
		for(Map.Entry<String,String> out:maps){
			System.out.println(out);//默认输出格式
			System.out.println(out.getKey()+"--"+out.getValue());//自定义输出格式
		}
		

	}

}
