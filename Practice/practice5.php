<?php 
    require "home.php";

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Variable Function:gettype:1</title>
</head>
<body>
    <?php 
    
    $no = 5;
    $value = 13.5;
    $name = "Bioin R. Prajapati";
    $var = true;
    $myarray = array(110,45,"Bipin",true);

    echo gettype($no) . "<br/>";
    echo gettype($value) . "<br/>";
    echo gettype($name) . "<br/>";
    echo gettype($var) . "<br/>";


    ?>
</body>
</html>