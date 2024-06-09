<?php 
    require "home.php";
    $a = "";
    if(isset($_POST['submit'])){
        $a = htmlspecialchars($_POST['in']);
    }

    $a = intval($a);
    if ($a % 2 == 0) {
        # code...
        echo "Given number is " . "<br>" . "<b>EVEN</b><br>";
    }else{
        echo "Given number is " . "<br>" . "<b>ODD</b><br>";
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Find out odd or even number..!</title>
</head>
<body>
    
    <form action="" method="post">
        <label for="in">Enter a number</label><br>
        <input type="text" name="in" id="" value=<?php echo $a; ?>><br><br>
        <input type="submit" value="submit" name="submit">
    </form>

</body>
</html>