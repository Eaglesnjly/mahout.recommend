<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/icon.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/demo.css">
    <script type="text/javascript" src="static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h2>complex layout</h2>

<p>This sample shows how to create a complex layout.</p>

<div style="margin:20px 0;"></div>
<div class="easyui-layout" style="width:1300px;height:650px;">
    <div data-options="region:'north'" style="height:50px">complex layout</div>
    <div data-options="region:'south',split:true" style="height:50px;">底角</div>
    <div data-options="region:'east',split:true" title="East" style="width:180px;">
        <ul class="easyui-tree"
            data-options="url:'static/tree_data1.json',method:'get',animate:true,dnd:true"></ul>
    </div>
    <div data-options="region:'west',split:true" title="West" style="width:150px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="Title1" style="padding:10px;">
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
    <div data-options="region:'center',title:'首页',iconCls:'icon-ok'">
        <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
            <div title="About" data-options="href:'index.jsp'"
                 style="padding:10px"></div>
            <div title="DataGrid" style="padding:5px">
                <table class="easyui-datagrid"
                       data-options="url:'static/datagrid_data1.json',pagination:true,method:'get',singleSelect:true,fit:true,fitColumns:true">
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
</div>
</body>
</html>