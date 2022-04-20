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
	       <input type="text">
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