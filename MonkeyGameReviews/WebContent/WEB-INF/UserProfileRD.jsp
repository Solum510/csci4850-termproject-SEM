<!DOCTYPE html PUBLIC>
<!-- https://stackoverflow.com/questions/3053205/how-create-table-only-using-div-tag-and-css -->
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
		.search{
			border-left-style:solid;
			border-width: 3px;
			border-color:#000000;
			padding-left:5px;
		}
		.grid{
			display:inline-block;
		}
		.div-table {
  	display: table;         
  	width: auto;         
  	border-spacing: 5px; /* cellspacing:poor IE support for  this */
	}
	.div-table-row {
  	display: table-row;
 	 width: auto;
  	clear: both;
  	}
  	
	.div-table-col {
 	 float: left; /* fix for  buggy browsers */
 	 display: table-column;         
 	 width: auto;  
 	 padding-right:5px;       
	}
	.write {
		text-align:left;
	}
	.entry{
	width: auto;
	border: 3px groove #00a36a;
	box-shadow:0px 5px 3px #aaaaaa;
}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monkey Game Reviews</title>
</head>
<body>
	<nav class="appbar">
		<h1 style="color:#ffffff; margin:10px;">Monkey Game Reviews - ${requestScope["pageTitle"]}</h1>
		<div class=nav-button>
			<button onclick="window.location.href='Homepage'" style="height:50px;">Home</button>
			<button onclick="window.location.href='CreateReview'" style="height:50px;">Create Entry</button>
			<button onclick="window.location.href='UserProfile'" style="height:50px;">User Profile</button>
		</div>
	</nav><br><br><br><br>
	<div align=center><p>You must be logged in to see your profile. Please <a href="Login">login.</a></p></div>
</body>
</html>