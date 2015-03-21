<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	body{
		background-color:<%= session.getAttribute("bg") %>
	}
	
	div{
		height:250px;
		
	}
	
	#txtdiv{
		background-color:<%= session.getAttribute("color") %>
	}
	
	#txtdiv1{
		background-color:<%= session.getAttribute("color") %>
	}
	
	#txtdiv2{
		background-color:<%= session.getAttribute("color") %>
	}
	
	p{
		color:<%= session.getAttribute("font") %>
	}
	
</style>

</head>

<body>
		<div id="txtdiv">
		<p class="txt" align="center">
			TEXT TEXT TEXT TEXT TEXT TEXT TEXT TEXT TEXT
		</p>
		</div>
		
		<div id="txtdiv1">
		<p class="txt" align="center">
			TEXT1 TEXT1 TEXT1 TEXT1 TEXT1 TEXT1 TEXT1 TEXT1 TEXT1 
		</p>
		</div>
		
		<div id="txtdiv2">
		<p class="txt" align="center">
			<a href="pref.jsp">Set Preferences</a>
		</p>
		</div>
</body>
</html>