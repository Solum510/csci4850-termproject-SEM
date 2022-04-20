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
		.search{
			border-right-style:solid;
			border-width: 3px;
			border-color:#000000;
		}
		.grid{
			display:inline-block;
		}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monkey Game Reviews</title>
</head>
<body>	
	<nav class="appbar">
		<h1 style="color:#ffffff; margin:10px;">Monkey Game Reviews - ${requestScope["pageTitle"]}</h1>
		<div class=nav-button>
			<button onclick="" style="height:50px;">Home</button>
			<button onclick="" style="height:50px;">Create Entry</button>
			<button onclick="" style="height:50px;">User Profile</button>
			<button onclick="" style="height:50px;">Logout</button>
		</div>
	</nav><br><br><br><br>
	<div align=left class="search">
		<p style="color:black;">Current Search: </p><br><br>
		<form>
			<label for="gameName">Game Title:</label><br>
			<input type="text" id="gameName" name="gameName"><br><br>
			<label for="gameName">Genres:</label><br>
			<div class="grid"><input type="checkbox" id="genre1" name="genre1" value="Action">
			<label for="genre1">Action</label>
			</div>
			<div class="grid"><input type="checkbox" id="genre2" name="genre2" value="Role-Playing">
			<label for="genre2">Role-Playing</label></div>
			<div class="grid"><input type="checkbox" id="genre3" name="genre3" value="Strategy">
			<label for="genre3">Strategy</label></div><br>
			<div class="grid"><input type="checkbox" id="genre4" name="genre4" value="Adventure & Casual">
			<label for="genre4">Adventure & Casual</label></div>
			<div class="grid"><input type="checkbox" id="genre5" name="genre5" value="Simulation">
			<label for="genre5">Simulation</label></div><br>
			<div class="grid"><input type="checkbox" id="genre6" name="genre6" value="Sports & Racing">
			<label for="genre6">Sports & Racing</label></div><br><br>
		</form>
	</div>
</body>
</html>