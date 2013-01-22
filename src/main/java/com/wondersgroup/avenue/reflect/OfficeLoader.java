package com.wondersgroup.avenue.reflect;

public class OfficeLoader {
	
	public static String getSuiteName(String className) throws ClassNotFoundException, Exception{
		Class c = Class.forName(className);
		Office o = (Office)c.newInstance();
		return o.getSuiteName();
	}
}
