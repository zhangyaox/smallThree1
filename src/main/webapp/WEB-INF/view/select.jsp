<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</head>
<body>
	<form action="select" method="post">
		<input type="date" name="begin">
		<input type="date" name="end">
		<select name="gj">
			<option value="created">时间</option>
			<option value="user_id">作者</option>
			<option value="id">评论</option>
		</select>
		<button>查找</button>
	</form>
	<table>
		<tr>
			<th>Column 1 Heading</th>
			<th>Column 2 Heading</th>
		</tr>
		<c:forEach items="${info}" var="list">
			<tr>
				<td>${list.id}</td>
				<td>${list.title }</td>
				<td>${list.picture }</td>
				<td>${list.hits }</td>
				<td>${list.hot }</td>
				<td>${list.status }</td>
				<td>${list.deleted }</td>
				<td>${list.created }</td>
				<td>${list.updated }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>