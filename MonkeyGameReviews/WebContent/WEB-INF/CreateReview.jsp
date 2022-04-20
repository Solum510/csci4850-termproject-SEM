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
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monkey Game Reviews</title>
</head>
<body>	
    
	<nav class="appbar">
		<h1 style="color:#ffffff; margin:10px;">Monkey Game Reviews - ${requestScope["pageTitle"]}</h1>
		<div class=nav-button>
			<button onclick="" style="height:50px;">Create Entry</button>
			<button onclick="" style="height:50px;">Home</button>
			<button onclick="" style="height:50px;">User Profile</button>
			<button onclick="" style="height:50px;">Logout</button>
		</div>
	</nav>
	<nav class="body">
	   <h1>Title</h1>
	   <form>
	       <input type="text">
	   </form>
	   <h1>Genre</h1>
	   <form>
	       <input type="checkbox" id="action" name="action" value="Action">
	       <label for="action">Action</label>
	       <input type="checkbox" id="rpg" name="rpg" value="RPG">
	       <label for="rpg">Role-Playing</label>
	       <input type="checkbox" id="strategy" name="strategy" value="Strategy">
	       <label for="strategy">Strategy</label>
	       <input type="checkbox" id="adventure" name="adventure" value="Adventure">
	       <label for="adventure">Adventure & Casual</label>
	       <input type="checkbox" id="simulation" name="simulation" value="Simulation">
	       <label for="simulation">Simulation</label>
	       <input type="checkbox" id="sports" name="sports" value="Sports">
	       <label for="sports">Sports & Racing</label>
	   </form>
	   <h1>Rating</h1>
	   <form>
	       <input type="text">
	   </form>
	   <h1>Review</h1>
	   <form>
	       <textarea rows = "5" cols = "60" name = "review">
	       </textarea>
	   </form>
	   <button onclick="" style="height:50px;">Submit Review</button>
	</nav>
</body>
</html>