<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
Choose your preferred Theme:</br>
	<form action="pref" method="POST">
		Background color: 
		<select name="color">
			<option value="black">Black</option>
			<option value="blue">Blue</option>
			<option value="yellow">Yellow</option>
		</select>
		</br>
		Font Color:
		<select name="font">
			<option value="black">Black</option>
			<option value="blue">Blue</option>
			<option value="yellow">Yellow</option>
		</select>
		</br>
		Post Color: 
		<select name="bg">
			<option value="black">Black</option>
			<option value="blue">Blue</option>
			<option value="yellow">Yellow</option>
		</select>
		</br>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>