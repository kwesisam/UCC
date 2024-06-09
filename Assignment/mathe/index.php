<?php 

    $s = $f = $ch = $res = '' ;
    if(isset($_POST['disp'])){
        $s = htmlspecialchars($_POST['s']);
        $f = htmlspecialchars($_POST['f']);
        $ch = htmlspecialchars($_POST['ch']);

    }


    $s = intval($s);
    $f = intval($f);

    switch ($ch) {
        case 'ADDITION':
            # code...
            $res = $f + $s;
            break;
        case 'SUBTRACTION':
                # code...
            $res = $f - $s;
            break;
        case 'MULTIPLICATION':
                    # code...
            $res = $f * $s;
            break;
        case 'DIVISION':
                        # code...
            $res = $f / $s;
            break;                       
        default:
            # code...
            break;
    }

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body bgcolor="gold">
    <form action="" method="post">
        <table align="center" border="3" width="20%"> <br><br>
            <tr bgcolor="forestgreen">
                <td align="center" colspan="2">
                    <font color="white" face="arial black" size="5" >CALCULATOR</font>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="Enter First Value" >
                </td>
                <td><input type="text" name="f" id="" value=<?php echo $s; ?>></td>
            </tr>
            <tr>
                <td><input type="button" value="Enter Second Value" ></td>
                <td><input type="text" name="s" id="" value=<?php echo $f; ?>></td>
            </tr>
            <tr>
                <td><input type="button" value="Select Your Choice"></td>
                <td><center>
                    <select name="ch" id="">
                        <option value="ADDITION">ADDITION</option>
                        <option value="SUBTRACTION">SUBTRACTION</option>
                        <option value="MULTIPLICATION">MULTIPLICATION</option>
                        <option value="DIVISION">DIVISION</option>
                    </select>
                </center></td>
            </tr>
            <tr>
                <td><input type="submit" value="     RESULT     " name="disp"></td>
                <td><input type="text" name="" value="<?php echo @$res; ?>" readonly="true"></td>
                <td></td>
            </tr>
        </table>
    </form>

</body>
</html>