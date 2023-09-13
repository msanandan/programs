package com.optional.classes;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Encodeing {
	
	public static void main(String[] args) {
		
		String pwd = "sanandan_63";
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		
		String encodpwd = new String(encode);
		
		System.out.println(encodpwd);
		
		Decoder decoder = Base64.getDecoder();
		
		byte[] decode = decoder.decode(encodpwd);
		String decodpwd = new String(decode);
		
		System.out.println(decodpwd);
	}

}
