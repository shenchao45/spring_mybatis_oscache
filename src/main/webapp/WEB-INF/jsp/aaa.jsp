<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: shenchao
  Date: 2017/1/3
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="oscache" uri="http://www.opensymphony.com/oscache" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/helloa.do" method="post">
    userid :<input type="text" name="id"> <br>
    name :<input type="text" name="name"> <br>
    sex :<input type="text" name="sex"> <br>
    <input type="submit" value="提交">
</form>
<br>现在时间：
<%=new Date()%> <br><br>
<oscache:cache>
    缓存时间:<%=new Date()%>
</oscache:cache>
<hr>
<form action="/hellob.do" method="post">
    userid :<input type="text" name="id"> <br>
    name :<input type="text" name="name"> <br>
    sex :<input type="text" name="sex"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
