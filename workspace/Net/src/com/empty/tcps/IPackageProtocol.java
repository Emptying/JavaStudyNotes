package com.empty.tcps;

public interface IPackageProtocol {
	//定义协议字符串的长度
	int PROTOCOL_LEN=2;
	//协议字符串
	String USER_REG="ur";
	String USER_MSG="um";
	String PRIVATE_MSG="pm";
	///////////////////////////
	String NAME_REP="-1";
	String LOGIN_SUCCESS="1";
	String SPLIT=";";
}
