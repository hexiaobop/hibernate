<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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

	<link rel="stylesheet" type="text/css" href="css/user.css">
	

  </head>

  
  <body>
  <div id="category">
  <s:iterator value="categorylist">
  
  <ul>
  <li> <a href="showvote?categoryid=${categoryid}" target="rightFrame"><s:property value="categoryname"/></a>  </li>
  </ul>
  </s:iterator>
    </div>
    <br>
    <div>

    </div>
    
    

<s:if test="null==#session.user||#session.user.isEmpty()">

<font size="5" color="#855E03"><s:a href="go_login.action">请登录</s:a></font>


</s:if>
<iframe id="rightFrame" name="rightFrame" src="showvote?categoryid=3" frameborder="0" width="100%" height="90%" scrolling="no" marginheight="0" marginwidth="0" style="border:1px solid #CCC; margin:0; padding:0;"></iframe>  

  </body>
  
</html>
