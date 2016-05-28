package com.empty.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		map.put("yuwen", "����");
		map.put("shuxue", "��ѧ");
		map.put("yingyu", "Ӣ��");
		System.out.println(map);
		System.out.println(map.get("yuwen"));
		//�������������е�key
		Set<String> set = map.keySet();
		for(String sets:set){
			System.out.println(sets+",");
		}
		//�������������е�values
		Collection<String> val = map.values();
		for(String vals:val){
			System.out.println(vals);
		}
		//���ش�ӳ����������ӳ���ϵ��
		Set<Map.Entry<String, String>> maps=map.entrySet();
		for(Map.Entry<String,String> out:maps){
			System.out.println(out);//Ĭ�������ʽ
			System.out.println(out.getKey()+"--"+out.getValue());//�Զ��������ʽ
		}
		

	}

}
