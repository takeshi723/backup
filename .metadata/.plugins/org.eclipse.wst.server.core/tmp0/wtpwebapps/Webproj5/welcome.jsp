<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME</title>
</head>
<body>
名前とパスワードを入れてください。
<s:form action = "LoginAction">
  <s:textfield name = "username" label = "ユーザー名:" placeholder = "名前"/>
  <s:password name = "password" label = "パスワード:" placeholder = "パスワード"/>
  <s:submit value = "そうしん"/>
</s:form>

</body>
</html>