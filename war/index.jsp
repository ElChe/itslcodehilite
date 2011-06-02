<%@page import="com.trovag.itslcodehilite.data.CodeEntity"%>
<%@page import="com.trovag.itslcodehilite.services.CodeServiceImpl"%>
<%@page import="com.trovag.itslcodehilite.services.CodeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<link href="SyntaxHighlighter/Styles/SyntaxHighlighter.css" type="text/css" rel="stylesheet"/>	
<link href="Itslcodehilite.css" type="text/css" rel="stylesheet"/>	
</head>
<%
// Small test to test persitence
CodeService service = new CodeServiceImpl();
CodeEntity entity = service.StoreCode("some code here");
entity.getKey();
%>
<body>
<div>
<textarea id="codeInput" name="input" cols="60" rows="10">
Write your code here...
</textarea>
<a href="#" id="codeGeneratorButton">Preview</a>
</div>
<pre class="c#" name="code" id="codeOutput">
</pre>
<button type="button" name="" value="" class="css3button">Insert to itslearning</button>
<script language="javascript" src="SyntaxHighlighter/Scripts/shCore.js"></script>
<script language="javascript" src="SyntaxHighlighter/Scripts/shBrushCSharp.js"></script>
<script language="javascript" src="SyntaxHighlighter/Scripts/shBrushXml.js"></script>
<script language="javascript">
$(document).ready(function () {
	dp.SyntaxHighlighter.ClipboardSwf = 'SyntaxHighlighter/Scripts/clipboard.swf';
	$('#codeGeneratorButton').bind('click', copyTextToHighlighter);
	function copyTextToHighlighter(){
	    var codeInputText = $("#codeInput").val();
	    $(".dp-highlighter").remove(); // Clean up old
	    $("#codeOutput").text(codeInputText);
	    dp.SyntaxHighlighter.HighlightAll('code', true, false);
	}
});

</script>

</body>
</html>