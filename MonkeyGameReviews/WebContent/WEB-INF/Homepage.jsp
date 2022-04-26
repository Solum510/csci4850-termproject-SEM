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
  	/*border-spacing: 5px; /* cellspacing:poor IE support for  this */
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
		<div class="div-table">
		<div class="div-table-col" align=left style="background:#23463f; margin-left:-8; box-shadow:0px 5px 3px #aaaaaa;">
		<p style="color:black;">Current Search: ${requestScope["search"]}</p><br><br>
		<form action="Homepage" method="post">
			<label for="gameName">Game Title:</label><br>
			<input type="text" id="gameName" name="gameName"><br><br>
			<label for="author">Author:</label><br>
			<input type="text" id="author" name="author"><br><br>
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
			<p>Rating:</p>
			<div class="grid"><input type="radio" id="rad" name="rad" value="1">
			<label>1 star</label></div>
			<div class="grid"><input type="radio" id="rad" name="rad" value="2">
			<label>2 stars</label></div>
			<div class="grid"><input type="radio" id="rad" name="rad" value="3">
			<label>3 stars</label></div><br>
			<div class="grid"><input type="radio" id="rad" name="rad" value="4">
			<label>4 stars</label></div>
			<div class="grid"><input type="radio" id="rad" name="rad" value="5">
			<label>5 stars</label></div><br><br>
			<input type="submit" value="Submit">
			<input type="reset" value="Reset">
		</form>
	</div>
	<div class="div-table-col">
		<div class="search">
		<h1>Search results:</h1>
		<div class="entry">
		<div class="div-table-row">
			<img alt="game" src="stock-vector-game-controller-gamepad-vector-icon.jpg" width=15% height=15% align=left>
			<p class="write" style="font-weight: bold;">Realm of the Mad God Exalt</p>
			<p class="write">Genres: Role-Playing</p>
			<p class="write">Review by: user1</p>
			<p class="write">Rating: 4</p>
			<p class="write">Review:</p>
			<p class="write"> Would be a 5 but the server lag KILLS character that have had DAYS of work put into them.</p>
		</div></div><br>
		<div class="entry">
		<div class="div-table-row">
			<img alt="game" src="stock-vector-game-controller-gamepad-vector-icon.jpg" width=15% height=15% align=left>
			<p class="write" style="font-weight: bold;">Game Title</p>
			<p class="write">Genres: all of em</p>
			<p class="write">Review by: user</p>
			<p class="write">Rating: 5</p>
			<p class="write">Review:</p>
			<p class="write">blah blah blah blah blah blah blah blah blah blah blah blah blah</p>
		</div></div><br>
		<div class="entry">
		<div class="div-table-row">
			<img alt="game" src="stock-vector-game-controller-gamepad-vector-icon.jpg" width=15% height=15% align=left>
			<p class="write" style="font-weight: bold;">Game Title</p>
			<p class="write">Genres: all of em</p>
			<p class="write">Review by: user</p>
			<p class="write">Rating: 5</p>
			<p class="write">Review:</p>
			<p class="write">blah blah blah blah blah blah blah blah blah blah blah blah blah</p>
		</div></div><br>
		</div>
	</div>
	</div>
</body>
</html>