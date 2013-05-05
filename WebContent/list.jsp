<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>

<H1>List of page</H1>

<c:foreach var="wikipage" items="${list}">
	<c:url value="/refer" var="url">
		<c:param name="name" value="${wikiPage.name }"/>
		</c:url>
		<LI><A HREF="${url}">${wikiPage.name}</A><BR>
	</c:foreach>

</body>
</html>