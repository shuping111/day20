<%--
  Created by IntelliJ IDEA.
  User: HS
  Date: 2021/7/5
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>百度一下</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }
        #box {
            display: inline-block;
        }
        #search {
            width: 545px;
            height: 42px;
            border-color: #4E6EF2;
            border-top-left-radius: 10px;
            border-bottom-left-radius: 10px;
            float: left;
        }
        #btn {
            width: 108px;
            height: 42px;
            background-color: #4e6ef2;
            color: #fff;
            border: none;
            font-size: 17px;
            font-weight: 400;
            border-top-right-radius: 10px;
            border-bottom-right-radius: 10px;
            float: left;
        }
        #show {
            width: 545px;
            border: 1px solid #4e6ef2;
            position: relative;
            left: -55px;
            text-align: left;
        }
    </style>
    <script type="text/javascript" src="jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#search").keyup(function () {
                var content = $("#search").val();
                if(content != null && content != ""){
                    $.get("studentServlet",{"name":content},function (msg) {
                        $("#show").html("");
                        $.each(msg,function (index,content) {
                            var nameDiv ="<div>"+ content.name +"<div>";
                            $("#show").append(nameDiv);

                        });
                    },"json")
                }else {
                    $("#show").html("");
                }

            });
        });
    </script>
</head>
<body>
<center>
    <img alt="" width="310" height="150"
         src="http://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png">
    <br/>
    <div id="box">
        <input id="search" type="text" name="search"/>
        <button id="btn">百度一下</button>
    </div>
    <div id="show">
    </div>
</center>
</body>
</html>
