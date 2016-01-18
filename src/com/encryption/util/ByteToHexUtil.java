package com.encryption.util;

public class ByteToHexUtil {
	public static String printHexString(byte[] b) {
		String hexString = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			hexString = hexString + hex;
		}
		return hexString;
	}


}
