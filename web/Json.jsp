<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 2021/7/5
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json</title>
    <script type="text/javascript" src="jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.post("jsonServlet",null,function (msg) {
                   console.log(msg);
                   $(msg).each(function (index,content) {
                       console.log(content.sid + "," + content.sex);

                   })

                },"json");

            });

        });
    </script>
</head>
<body>
<input type="button" value="测试Json" id="btn">
</body>
</html>
