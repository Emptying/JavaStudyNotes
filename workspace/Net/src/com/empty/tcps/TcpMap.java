package com.empty.tcps;

import java.util.HashMap;
import java.util.Set;

public class TcpMap<K, V> {
	private HashMap<K, V> map=new HashMap<>();
	
	
	//���socket���û���
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
	//���� key����value
	//�����û����Ҷ���
	public synchronized V keyGetvalue(K  key){
		V result=null;
		for(K k:map.keySet()){
			if(key.equals(k)){
				result=map.get(k);
			}
		}
		return result;
	}
	//���ݶ������û���
	public synchronized K  valueGetkey(V value){
		K result=null;
		for(K k:map.keySet()){
			if(map.get(k)==value){
				result = k;
			}
		}
		return result;
	}
	//�����������ߵĳ�Ա
	public Set<K> keys(){
		return map.keySet();
	}
	
	//���󲻴���ʱɾ������
	
	public synchronized void remove(V value){
		K key=valueGetkey(value);
		map.remove(key);
	}
	
	
}
