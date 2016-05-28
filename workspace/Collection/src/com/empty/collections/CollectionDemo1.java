package com.empty.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList=new ArrayList<>();
		aList.add("yuwen");
		aList.add("shuxue");
		aList.add("huaxue");
		aList.add("lishi");
		aList.add("shengwu");
		for(String out:aList){
			System.out.println(out);
		}
		Collections.sort(aList);
		//使用二分查找法必须是有序的序列
		System.out.println(Collections.binarySearch(aList,"yuwen"));
		
		//更多使用方法见API
		

	}

}
