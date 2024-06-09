<?php 



?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
    </title>
        <style type="text/css">
            div{
                font-size: 20pt;
                color: green;
                font-family:Jokerman;
                text-align:center;
                width: 30%;

            }

            p{
                font-size: 18pt;
                color: darkblue;
                font-weight: bold;
                align-text: center;
                font-family: arial black;
            }

            .double{
                border-style: dashed;
            }

            .dashed{
                border-style: dashed;
                margin-top: 10px;
            }
        </style>
</head>
<body>
    <center>
        <br><br>
        <div class="double">GREETING TEXT</div>
        <div class="dashed">
            <form action="gre.php" method="post">
                <p>Enter The Text: 
                    <br>
                    <input type="text" name="n">
                </p><br>
                <input type="submit" value="&nbsp;&nbsp; SUBMIT &nbsp;&nbsp;">
                <br>
            </form>
        </div>
    </center>
</body>
</html>