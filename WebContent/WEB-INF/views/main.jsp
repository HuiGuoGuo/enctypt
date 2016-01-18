<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/commons/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>

<title>编码</title>
<style type="text/css">
textarea {
	margin-left: 0px;
	margin-right: 0px;
	width: 570px;
}

.container-fluid {
	margin-top: 100px;
}

.father->div {
	margin-left: auto;
	margin-left: auto;
	color: red;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
		<div class="row">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 father">
				<div>
					<h1>Base64编码,解码</h1>
					<textarea rows="20" cols="20" id="input"></textarea>
					<br>
					<div class="">
						<button type="button" class="btn btn-primary"
							onclick="javascript:decode();">BASE64解码</button>
						<button type="button" class="btn btn-success"
							onclick="javascript:encode();">BASE64编码</button>
					</div>

					<br>
					<textarea rows="20" cols="20" id="output"></textarea>
				</div>
				<br>


				<h1>信息摘要值</h1>
				<textarea rows="20" cols="20" id="input2"></textarea>
				<br>
				<div class="">
					<select id="select_type">
						<option value="MD5">MD5</option>
						<option value="MD2">MD2</option>
						<option value="SHA-1">SHA-1</option>
						<option value="SHA-256">SHA-256</option>
						<option value="SHA-384">SHA-384</option>
						<option value="SHA-512">SHA-512</option>
					</select>
					<button type="button" class="btn btn-primary"
						onclick="javascript:encrypt();">计算摘要值</button>
				</div>

				<br>
				<textarea rows="20" cols="20" id="output2"></textarea>
				<br>


				<h1>文件信息摘要值</h1>
				<input type="file" id="input3" name="file"> <br>
				<div class="">
					<select id="select_file_type">
						<option value="MD5">MD5</option>
						<option value="MD2">MD2</option>
						<option value="SHA-1">SHA-1</option>
						<option value="SHA-256">SHA-256</option>
						<option value="SHA-384">SHA-384</option>
						<option value="SHA-512">SHA-512</option>
					</select>
					<button type="button" class="btn btn-primary"
						onclick="javascript:;">计算摘要值</button>
				</div>
				<br>
				<textarea rows="20" cols="20" id="output3"></textarea>

			</div>
			<div class="col-xs-6 col-md-4"></div>
		</div>
	</div>
</body>
</html>