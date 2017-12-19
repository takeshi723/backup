<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
  <s:form action = "HelloStrutsAction">
    <s:submit value = "HelloStruts"/>
  </s:form>

  <s:form action = "WelcomeAction">
    <s:submit value = "Welcome"/>
  </s:form>

  <s:form action = "InquiryAction">
    <s:submit value = "問い合わせ"/>
  </s:form>

  <br>
  GET通信
  <s:form method = "get" action = "TestAction">
  <s:textfield name = "username" placeholder = "名前"/>
  <s:password name = "password" placeholder = "password"/>
  <s:submit value = "sousinn"/>
  </s:form>

  POST通信
  <s:form method = "post" action = "TestAction">
  <s:textfield name = "username" placeholder = "namae"/>
  <s:password name = "password" placeholder = "password"/>
  <s:submit value = "そうしん"/>
  </s:form>

</body>
</html>