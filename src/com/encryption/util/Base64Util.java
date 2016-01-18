package com.encryption.util;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Util {
	public static String encode(byte[] bytes) {
		return new BASE64Encoder().encode(bytes);
	}

	public static byte[] decode(String str) throws IOException {
		return new BASE64Decoder().decodeBuffer(str);
	}
}
