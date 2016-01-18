package com.encryption.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.encryption.util.Base64Util;
import com.encryption.util.MessageDigestUtil;

@Controller
public class Main {

	@RequestMapping(value = { "/main" }, method = { RequestMethod.GET })
	public String main() {
		return "main";
	}

	@RequestMapping(value = { "/decode" }, method = { RequestMethod.POST })
	public @ResponseBody byte[] base64Decode(@RequestParam(value = "input", required = true) String input)
			throws IOException {
		return Base64Util.decode(input);
	}

	@RequestMapping(value = { "/encode" }, method = { RequestMethod.POST })
	public @ResponseBody String base64Encode(@RequestParam(value = "input", required = true) String input)
			throws IOException {
		return Base64Util.encode(input.getBytes("utf-8"));
	}

	@RequestMapping(value = { "/encrypt" }, method = { RequestMethod.POST })
	public @ResponseBody String encrypt(@RequestParam(value = "input", required = true) String input,
			@RequestParam(value = "encryptType") String encryptType) throws IOException, NoSuchAlgorithmException {
		return MessageDigestUtil.encrypt(input.getBytes("UTF-8"), encryptType);
	}

	@RequestMapping(value = { "/encryptFile" }, method = { RequestMethod.POST })
	public @ResponseBody String encryptFile(@RequestParam(value = "input", required = true) String input,
			@RequestParam(value = "encryptType") String encryptType) throws IOException, NoSuchAlgorithmException {
		System.out.println(input);
		return MessageDigestUtil.getMD5FromFile(input, encryptType);
	}
	


	public static void main(String[] args) throws Exception {

	}
}
