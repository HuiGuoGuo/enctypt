package com.encryption.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 测试文件上传速度
 * 
 * @author Stone
 * @date 2016年1月18日
 * @forUse
 */
public class FileUpload {
	public static final String PATH = "D:/迅雷下载/火星救援.原盘中英字幕.The.Martian.2015.BD720P.X264.AAC.English.CHS-ENG.Mp4Ba/火星救援.原盘中英字幕.The.Martian.2015.BD720P.X264.AAC.English.CHS-ENG.Mp4Ba.mp4";
	public static final String OUTPATH = "E:";

	public static void TestFileInputStream() throws IOException {
		System.out.println("进入上传文件" + new File(PATH).length());
		InputStream in = new FileInputStream(new File(PATH));
		OutputStream os = new FileOutputStream(new File(OUTPATH + "/" + new File(PATH).getName()));
		byte[] b = new byte[2056];
		int len = 0;
		os.flush();
		while ((len = in.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println("传送成功");
		in.close();
		os.close();
	}

	public static void main(String[] args) throws IOException {
		TestFileInputStream();
	}
}
