<?php
    function getImages($conn){
        $sql = "SELECT * FROM tours_images";
        $result = mysqli_query($conn, $sql);
        $images = mysqli_fetch_all($result, MYSQLI_ASSOC);
        return $images;
    }

?>