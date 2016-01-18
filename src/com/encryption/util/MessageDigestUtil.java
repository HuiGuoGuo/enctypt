package com.encryption.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Properties;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author Stone
 * @date 2016年1月17日
 * @forUse 消息摘要算法
 */
public class MessageDigestUtil {
	/**
	 * 计算字符串的摘要值
	 * 
	 * @param input
	 *            字符串
	 * @param encrypt
	 *            算法名称
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String encrypt(byte[] input, String encrypt) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(encrypt);
		md.update(input);
		byte[] resultBytes = md.digest();
		return ByteToHexUtil.printHexString(resultBytes);
	}

	/**
	 * 计算文件的摘要值
	 * 
	 * @param path
	 *            文件路径
	 * @param encrypt
	 *            算法名称
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */

	public static String getMD5FromFile(String path, String encrypt) throws IOException, NoSuchAlgorithmException {
		File file = new File(path);
		if (!file.isFile()) {
			return "false";
		}
		InputStream inputStream = new FileInputStream(new File(path));
		DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance(encrypt));
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = digestInputStream.read(b)) != -1) {
			digestInputStream.read(b, 0, len);
		}
		MessageDigest md = digestInputStream.getMessageDigest();
		byte[] resultBytes = md.digest();
		digestInputStream.close();
		return ByteToHexUtil.printHexString(resultBytes);
	}

	/**
	 * 生成密钥
	 * 
	 * @param encrypt
	 * @return
	 * @throws Exception
	 */

	public static byte[] secretKey(String encrypt) throws Exception {
		KeyGenerator keyGen = KeyGenerator.getInstance(encrypt);
		SecretKey key = keyGen.generateKey();
		return key.getEncoded();
	}

	public static String encryptHmac(String encrypt, byte[] key, byte[] data) throws Exception {
		SecretKey secretKey = new SecretKeySpec(key, encrypt);
		Mac mac = Mac.getInstance(encrypt);
		mac.init(secretKey); // 加入密钥
		byte[] resultBytes = mac.doFinal(data); // 加密数据
		return ByteToHexUtil.printHexString(resultBytes); // 返回加密后的16进制密文
	}

}
