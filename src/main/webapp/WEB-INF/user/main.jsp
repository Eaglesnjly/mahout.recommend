<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>main</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/easyui/themes/default/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/easyui/demo.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
</head>

<body class="easyui-layout">
    <div data-options="region:'north'" style="height:60px;">
        <div class="easyui-panel"
             data-options="href:'${pageContext.request.contextPath}/user/top',method:'get'">
        </div>
    </div>
    <div data-options="region:'south',split:true"  style="height:50px;padding:10px;">页脚</div>
    <div data-options="region:'west',split:true,title:'导航栏'" style="width:200px;padding:10px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="基本信息" style="padding:10px;">
                content1
            </div>
            <div title="Title2" data-options="selected:true" style="padding:10px;">
                content2
            </div>
            <div title="Title3" style="padding:10px">
                content3
            </div>
        </div>
    </div>
    <div data-options="region:'east',split:true,title:'资源库'" style="width:200px;padding:10px;">
        <ul class="easyui-tree"
            data-options="url:'../static/tree_data1.json',method:'get',animate:true,dnd:true"></ul>
    </div>

    <div data-options="region:'center',title:'首页',iconCls:'icon-ok'">
        <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
            <%--<div title="基本信息"
                 data-options="href:'${pageContext.request.contextPath}/user/selectUserById?id'"
                 style="padding:10px"></div>--%>
            <div title="DataGrid" style="padding:5px">
                <table class="easyui-datagrid"
                       data-options="url:'../static/datagrid_data1.json',pagination:true,method:'get',singleSelect:true,fit:true,fitColumns:false">
                    <thead>
                    <tr>
                        <th data-options="field:'itemid'" width="80">Item ID</th>
                        <th data-options="field:'productid'" width="100">Product ID</th>
                        <th data-options="field:'listprice',align:'right'" width="80">List Price
                        </th>
                        <th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
                        <th data-options="field:'attr1'" width="150">Attribute</th>
                        <th data-options="field:'status',align:'center'" width="50">Status</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>

    </body>
</html>