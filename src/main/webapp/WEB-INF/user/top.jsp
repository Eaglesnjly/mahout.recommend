<%@ page language="java" pageEncoding="UTF-8" %>
<%--<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    Object list = request.getAttribute("list");
%>--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title>top</title>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/icon.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/demo.css">
    <script type="text/javascript" src="static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>


    <SCRIPT LANGUAGE="javascript">
        <!--
        window.open('page.html', 'newwindow', 'height=100, width=400, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
        -->
    </SCRIPT>
</head>
<body>

<div style="height:55px;background:#B3DFDA;" align="right">
    <table id="top-panel" align="right">
        <tr>
            <td style=" padding: 10px;">

            </td>
            <td style=" padding: 10px;">
                <label id="loginInfo"></label>
            </td>
            <td style="color: red;">
                <div id="register" style="color: red;padding: 10px;">
                    <a href="#" onclick="">注册</a>
                </div>
            </td>
            <td style="color: red">
                <div id="login" style="color: #00ee00;padding: 10px;">
                    <a href="login.jsp" onclick="">登录</a>
                </div>
            </td>

        </tr>

    </table>

</div>


</body>
</html>
