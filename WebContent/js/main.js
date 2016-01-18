function decode() {
	var input = "";
	input = $("#input").val();
	$.ajax({
		url : "decode",
		data : {
			"input" : input
		},
		type : "POST",
		success : function(request) {
			$("#output").text(request);
		}
	})
}

function encode() {
	var input = "";
	input = $("#input").val();
	$.ajax({
		url : "encode",
		data : {
			"input" : input
		},
		type : "POST",
		success : function(request) {
			$("#output").text(request);
		}
	})
}
function encrypt() {
	var input = "", type = "";
	input = $("#input2").val();
	type = $("#select_type").val();
	$.ajax({
		url : "encrypt",
		data : {
			"input" : input,
			"encryptType" : type
		},
		type : "POST",
		success : function(request) {
			$("#output2").text(request);
		}
	})
}
function encryptFile() {
	var input = "", type = "";
	var file=document.getElementById("input3");
	file.select();
	document.getElementById("input3").focus();
	input =document.selection.createRange().text();
	type = $("#select_file_type").val();
	input.replace("", '\\');
	alert(type)
	$.ajax({
		url : "encryptFile",
		data : {
			"input" : input,
			"encryptType" : type
		},
		type : "POST",
		success : function(request) {
			$("#output3").text(request);
		}
	})
}

function getFilePath(filePathId){
	//判断浏览器类型
	 var isIE = (document.all) ? true : false;
	 var isIE7 = isIE && (navigator.userAgent.indexOf('MSIE 7.0') != -1);
	 var isIE8 = isIE && (navigator.userAgent.indexOf('MSIE 8.0') != -1);

	 var path = '';
	 if(isIE7 || isIE8)
	{
	 var file = document.getElementById(filePathId);
	file.select();
	 path = document.selection.createRange().text;
	document.selection.empty();
	}else{
	 try {
	netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
	 }catch (e) {
	alert('在地址栏输入about:config，然后修改signed.applets.codebase_principal_support的键值，将值修改为true');
	return;
	}

	 var fname = document.getElementById(filePathId).value;
	 var file = Components.classes["@mozilla.org/file/local;1"].createInstance(Components.interfaces.nsILocalFile);
	 try {
	 // Back slashes for windows
	 file.initWithPath( fname.replace("///g","\\") );
	 }catch(e) {
	 if (e.result!=Components.results.NS_ERROR_FILE_UNRECOGNIZED_PATH) throw e;
	alert('无法加载文件');
	return;
	}
	 path = file.path;
	}
	 return path;
	}
	function inputDir(){

	var path = getFilePath('path');
	 alert(path)
	}