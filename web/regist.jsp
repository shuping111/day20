<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 2021/7/5
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script type="text/javascript" src="jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#un").blur(function () {
                var username = $("#un").val();
                //发送Ajax请求
                $.get("registerServlet",{"un":username},function (msg) {
                    if(msg){
                        $("#un_msg").text("√")
                    }else {
                        $("#un_msg").text("账号已被占用，请重新输入");
                    }

                },"json");

            });
        });
    </script>
</head>
<body>
<form>
    账号：<input type="text" name="username" id="un">
    <span id="un_msg"></span><br>
    密码：<input type="password" name="password" id="pw"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
