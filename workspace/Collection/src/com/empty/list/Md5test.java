package com.empty.list;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5test {

	public static void main(String[] args) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		String input = "you password";
		byte[]in=input.getBytes();
		md.update(in);
		byte []sum=md.digest();
		String out="";
		for(byte o:sum){
			out=out+String.format("%02X",o);
		}
		System.out.println(out);

	}

}
