<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
<% if(request.getParameter("name")==""){%>
	<jsp:forward page="create.jsp"></jsp:forward>
<% }%>

<H1>Making Page about [${param.name}] ...</H1>

<FORM ACTION="create">
	<INPUT TYPE="HIDDEN" NAME="cmd" VALUE="create">
	<INPUT TYPE="HIDDEN" NAME="name" VALUE="${param.name}">

	<TEXTAREA ROWS="15" COLS="60" NAME="content"></TEXTAREA>
	<BR>
	<INPUT TYPE="SUBMIT" VALUE="Save">
	<INPUT TYPE="BUTTON" VALUE="Cancel" ONCLICK="location.href='refer'">
	<INPUT TYPE="BUTTON" VALUE="Back" ONCLICK="location.href='create.jsp'">
</FORM>

</body>
</html>