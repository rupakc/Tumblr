package org.tumblr.util;

public class StringUtil {
	
	public static String fillTagSpace(String tag) { 
		
		String temp = tag.trim();
		String space = " ";
		String replace = "%20";
		
		temp = temp.replace(space, replace);
		
		return temp;
	}
}
