<!DOCTYPE html PUBLIC>
<html>
<head>
	<style>
		.appbar {
			background:#00a36a;
			display:table;
			height:90px;
			width:100%;
			position:absolute;
			top:0;
			left:0;
			box-shadow:0px 5px 3px #aaaaaa;
			padding:0px;
		}
		.nav-button{
			height:100%;
			display:table-cell;
			text-align:right;
			vertical-align:middle;
			padding-right:20px;
		}
		.body {
			position:absolute;
			top:90;
			left:0;
		}
		.checked{
		    color: orange;
		}
		.grid{
			display:inline-block;
		}
		label{
		color:#08ffd1
		}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monkey Game Reviews - Create Review</title>
<%
	final String title = (String) request.getAttribute("gameName");
	final String review = (String) request.getAttribute("review");
%>
</head>
<body>	
    
	<nav class="appbar">
		<h1 style="color:#ffffff; margin:10px;">Monkey Game Reviews - ${requestScope["pageTitle"]}</h1>
		<div class=nav-button>
			<button onclick="window.location.href='Homepage'" style="height:50px;">Home</button>
			<button onclick="window.location.href='CreateReview'" style="height:50px;">Create Entry</button>
			<button onclick="window.location.href='UserProfile'" style="height:50px;">User Profile</button>
		</div>
	</nav><br><br><br><br><br><br>
		<div align=center>
	   		${requestScope["output"]}
	   		${requestScope["error"]}
	   		
	   </div>
	   <!--<p>${requestScope["review"]}</p>-->
</body>
</html>