<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>
var s=1;
function addoptions()
{
var input=document.createElement("input");
var br = document.createElement("br");
var label = document.createElement("label");
var node=document.createTextNode("选项"+s);
label.appendChild(node);
input.name="optionlist"+s;


var element=document.getElementById("optionlist");
element.appendChild(label);
element.appendChild(input);
element.appendChild(br);
s=s+1;
}
</script>
</head>

<body>

	<div>
		<ul>

			<s:iterator value="categorylist" id="list">
				<s:property value="categoryname" />
			</s:iterator>
		</ul>

	</div>
	<div id="add">
		<form action="addvote" method="post">
			<table >
				<tr>
					<select name="select" id="select_k1" class="xla_k">
						<s:iterator value="categorylist" id="list">
							<option value="${list.categoryid}">
								<s:property value="categoryname" />选择一
							</option>
						</s:iterator>
					</select>
					<input name="votename" id="addoption">
					
					<input type="button" value="点击添加" id="addoption" onclick="addoptions()"></button>
				</tr>
				<tr id="optionlist"></tr>
				<input type="submit" value="提交">
</table>

				</form>
			
	</div>
	<div id="adminadd">

		<form action="addcategory" method="post">
			<label>添加分类</label> <input type="text" name="category"> <input
				type="submit">
		</form>
	</div>
</body>
</html>
