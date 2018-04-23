<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>输入账号和密码</title>
  <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/icon.css">
  <link rel="stylesheet" type="text/css" href="static/easyui/demo.css">
  <script type="text/javascript" src="static/easyui/jquery.min.js"></script>
  <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<div style="margin:20px 0;"></div>
<div class="easyui-panel" style="width:400px;padding:50px 60px">
  <div style="margin-bottom:20px">
    <input class="easyui-textbox" prompt="Username" iconWidth="28" style="width:100%;height:34px;padding:10px;">
  </div>
  <div style="margin-bottom:20px">
    <input id="pass" class="easyui-passwordbox" prompt="Password" iconWidth="28" style="width:100%;height:34px;padding:10px">
  </div>
</div>
<div id="viewer"></div>

<script type="text/javascript">
  $('#pass').passwordbox({
    inputEvents: $.extend({}, $.fn.passwordbox.defaults.inputEvents, {
      keypress: function(e){
        var char = String.fromCharCode(e.which);
        $('#viewer').html(char).fadeIn(200, function(){
          $(this).fadeOut();
        });
      }
    })
  })
</script>
<style>
  #viewer{
    position: relative;
    padding: 0 60px;
    top: -70px;
    font-size: 54px;
    line-height: 60px;
  }
</style>
</body>
</html>