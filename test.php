<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
<form action="test.php" method="get" style="text-align:center;margin-top:5%;" name="form1"  >
    <input type="text" name="data1" value="nana"><br>
    <input type="password" name="data" value="aaaaaD12">
    <br>
    <input type="submit" value="submit">
</form> 
<?php
if(isset($_GET['pass'])){
    $data=$_GET['pass'];
    $password="aaaaaD12";
    if($data!=$password) {echo "false\n"; echo"<h3 style='color:red;'>Mot de passe incorrect</h3>";}
    else if($data==$password){echo "true\n"; echo"<h3 style='color:green;'>Mot de passe correct</h3><br>";}
    
}
?>
</body>
</html>