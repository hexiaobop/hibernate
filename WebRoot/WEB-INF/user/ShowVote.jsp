<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ShowVote.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="margin-left: 50px;margin-top: 30px;">
  
  <div>
   <s:iterator value="categoroy.setvote"> 
   <form action="addoption" method="get"> 
   <input type="hidden" name = "voteid" value="<s:property value="voteid"/>"/>
    <s:property value="votename"/>  <br>
         <s:iterator value="setoption"> 
        <label><input name="optionlist" type="radio" value='<s:property value="optionid"/>'/><s:property value="optionname"/> </label><br>
         </s:iterator>
         <input type="submit">
         </form>
</s:iterator> 
</div>
<div style=" postion:absolute;botton:0px;display:inline;"><a href="#">上一页</a><a href="#">下一页</a></div>
    
    <div style="margin-right: 20px;display:inline;">最新投票</div>
  </body>
</html>
