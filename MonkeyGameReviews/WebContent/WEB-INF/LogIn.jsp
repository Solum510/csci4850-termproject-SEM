<!DOCTYPE html PUBLIC>
<html>
<head>
	<style>
 
.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #23463f;  
        border-radius: 15px ;  
          
}  
 
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#Uname{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#log{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
  
  
}  
span{  
    color: white;  
    font-size: 17px;  
}  

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
	</style>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Monkey Game Reviews - Login</title>
</head>
<body>	
	<div class="appbar">
	<div align=center><h1 style="color:#ffffff;">Monkey Game Reviews</h1></div></div><br><br>
	<br><br>
	<div>
    <h2 style="text-align:center">Log in to Monkey Game Reviews</h2><br>
	<nav class="login">
	<div align=center>
    <form id = "login" method = "post" action = "Login">
        <label for="Uname"><b>User Name     
        </b>    
        </label>    
        <input type="text" name="Uname" id="Uname" placeholder="Username" required>    
        <br><br>    
        <label for="Pass"><b>Password     
        </b>    
        </label> <br>   
        <input type="Password" name="Pass" id="Pass" placeholder="Password" required>    
        <br><br>    
        <input type="submit" name="log" id="log" value="Log In">       
        <br><br>       
    </form>
    </div>
	</nav>
		<div align=center>
		    	<p>Not a user? <a href="CreateAccount">Create an account</a></p><br>
		${requestScope["error"]}
		</div>
	</div>
</body>
</html>