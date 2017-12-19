<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン成功画面</title>
</head>
<body>
<h1>ログイン成功!</h1>

<br>
<table>
<tbody>

<tr>
  <th>username</th>
  <th>nickname</th>
  <th>password</th>
</tr>

<s:iterator value = "#session.loginDTOList">

<tr>
  <td><s:property value = "username"/></td>
  <td><s:property value = "nickname"/></td>
  <td><s:property value = "password"/></td>
</tr>

</s:iterator>
</tbody>
</table>

</body>
</html>