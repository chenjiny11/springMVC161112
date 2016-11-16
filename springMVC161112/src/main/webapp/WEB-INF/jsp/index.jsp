<%--
  Created by IntelliJ IDEA.
  User: f4o823hv9
  Date: 2016/11/12
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path1 = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+"/"; %>
<html>
<head>
    <title></title>
</head>
<body>

这里是页面
</body>
<script src="${path}/resource/js/jquery-1.8.3.min.js" ></script>
<script src="${path}/resource/js/index.js" ></script>
</html>
