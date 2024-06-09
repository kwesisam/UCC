<?php 
    require "home.php";
    $a = "";
    $b = "";

    if (isset($_POST['submit'])) {
        # code...
        $a = intval(htmlspecialchars($_POST['a']));
        $b = intval(htmlspecialchars($_POST['b']));
        
        echo " a = $a " . "<br>". " b = $b " . "<br>";
        
        $a = $a + $b;
        $b = $a - $b;
        $a = $a - $b;
    
        echo "<b>After Swapping " . "<br>" . " a = $a" . "<br>" . "b = $b</b>";
    
        
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swapping of two numbers..!</title>
</head>
<body>
<form action="" method="post">
        <label for="a">Enter first number</label><br>
        <input type="text" name="a" id="" value=<?php echo $a; ?>><br><br>
        <label for="b">Enter second number</label><br>
        <input type="text" name="b" id="" value=<?php echo $b; ?>><br><br>
        <input type="submit" value="submit" name="submit">
    </form>
</body>
</html>