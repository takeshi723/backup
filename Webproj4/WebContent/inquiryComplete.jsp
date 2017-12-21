<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" type = "text/css" href = "./css/style.css">
<title>お問い合わせ　うけつけかんりょう</title>
</head>
<body>

<table>
<tbody>
  <tr>
    <th>名前</th>
    <th>おといあわせのしゅるい</th>
    <th>お問い合わせ内容</th>
  </tr>

  <s:iterator value = "inquiryDTOList">
    <tr>
      <td><s:property value = "name"/></td>

      <s:if test = 'qtype == "company"'>
        <td>かいしゃについて</td>
      </s:if>

      <s:if test = 'qtype == "support"'>
        <td>アフターサポートについて</td>
      </s:if>

      <td><s:property value = "body"/></td>
      </tr>
      </s:iterator>
      </tbody>
      </table>

</body>
</html>