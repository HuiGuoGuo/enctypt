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
<link rel="stylesheet" href="css/ui.jqgrid.css" type="text/css">
<link rel="stylesheet" href="css/ui.jqgrid-bootstrap.css" type="text/css">
<link rel="stylesheet" href="css/ui.jqgrid-bootstrap-ui.css" type="text/css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/grid.locale-en.js"></script>
<script type="text/javascript" src="js/jquery.jqGrid.min.js"></script>
<title>jqGrid</title>
<script type="text/javascript">
$(function(){
	  pageInit();
	});
	function pageInit(){
	  $("#list1").jqGrid(
	      {
	        url : 'getData',
	        datatype : "xml",
	        colNames : [ 'Inv No', 'Date', 'Client', 'Amount', 'Tax','Total', 'Notes' ],
	        colModel : [ 
	                     {name : 'id',index : 'id',width : 75}, 
	                     {name : 'invdate',index : 'invdate',width : 90}, 
	                     {name : 'name',index : 'name',width : 100}, 
	                     {name : 'amount',index : 'amount',width : 80,align : "right"}, 
	                     {name : 'tax',index : 'tax',width : 80,align : "right"}, 
	                     {name : 'total',index : 'total',width : 80,align : "right"}, 
	                     {name : 'note',index : 'note',width : 150,sortable : false} 
	                   ],
	        rowNum : 10,
	        autowidth : true,
	        rowList : [ 10, 20, 30 ],
	        pager : jQuery('#pager1'),
	        mtype : "post",
	        sortname : 'id',
	        viewrecords : true,
	        sortorder : "desc",
	        caption : "XML 实例"
	      }).navGrid('#pager1', {
	    edit : true,
	    add : true,
	    del : true
	  }); 
	}

</script>
</head>
<body>

	<div>

		<table id="list1">
		</table>
		<div id="pager1"></div>
	</div>

</body>
</html>