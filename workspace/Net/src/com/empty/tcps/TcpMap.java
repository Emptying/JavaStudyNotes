package com.empty.tcps;

import java.util.HashMap;
import java.util.Set;

public class TcpMap<K, V> {
	private HashMap<K, V> map=new HashMap<>();
	
	
	//添加socket和用户名
	public synchronized String put(K key,V value){
		String result=null;
		for(K k:map.keySet()){
			if(k.equals(key)){
				result = IPackageProtocol.NAME_REP;
				return result;
			}
		}
		map.put(key, value);
		result = IPackageProtocol.LOGIN_SUCCESS;
		return result;
		
	}
	//根据 key查找value
	//根据用户名找对象
	public synchronized V keyGetvalue(K  key){
		V result=null;
		for(K k:map.keySet()){
			if(key.equals(k)){
				result=map.get(k);
			}
		}
		return result;
	}
	//根据对象找用户名
	public synchronized K  valueGetkey(V value){
		K result=null;
		for(K k:map.keySet()){
			if(map.get(k)==value){
				result = k;
			}
		}
		return result;
	}
	//返回所有在线的成员
	public Set<K> keys(){
		return map.keySet();
	}
	
	//对象不存在时删除对象
	
	public synchronized void remove(V value){
		K key=valueGetkey(value);
		map.remove(key);
	}
	
	
}
