<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Insert title here</title>
</head>
<body>
<H1>${wikiPage.name}noEdit</H1>

<FORM ACTION="update">
	<INPUT TYPE="HIDDEN" NAME="cmd" VALUE="update">
	<INPUT TYPE="HIDDEN" NAME="name" VALUE="${wikiPage.name}">

	<TEXTAREA ROWS="15" COLS="60" NAME="content">${wikiPage.content}</TEXTAREA>
	<BR>

	<INPUT TYPE="SUBMIT" VALUE="KOUSIN">
	<INPUT TYPE="SUBMIT" VALUE="delete" ONCLICK="cmd.value='delete'">
	<INPUT TYPE="BUTTON" VALUE="cancel" ONCLICK="location.href='refer'">
</FORM>

</body>
</html>