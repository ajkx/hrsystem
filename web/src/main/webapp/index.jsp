<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/5
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery.js"></script>
<body>

<form action="/test" method="POST" id="form1">
    <input type="text" name="name"/>
    <input type="text" name="age"/>
    <input type="submit">
</form>

<button onclick="test()">safdasd</button>
<script>
    function test(){
        var form = $('#form1');
        $.ajax({
            url: form.attr('action'),
            type: "POST",
            dataType: "json",
            contentType: 'application/json',
            data: form.serialize(),
            success: function (result) {
            },
            error: function (xhr, status) {
                alert("数据传输错误" + status + ",请联系系统管理员");
            }
        });
    }
</script>
</body>
</html>
