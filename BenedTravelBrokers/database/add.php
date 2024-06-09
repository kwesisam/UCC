<?php 
    function addImage($conn, $data) {
        // Extract data from $data array
        $locationName = mysqli_real_escape_string($conn, $data['location_name']);
        $price = mysqli_real_escape_string($conn, $data['price']);
        $description = mysqli_real_escape_string($conn, $data['description']);
        $duration = mysqli_real_escape_string($conn, $data['duration']);
        $location = mysqli_real_escape_string($conn, $data['location']);
        $minimumAge = mysqli_real_escape_string($conn, $data['minimum_age']);
        $rating = mysqli_real_escape_string($conn, $data['rating']);
        $image = mysqli_real_escape_string($conn, $data['image']);
    
        // Construct SQL query
        $sql = "INSERT INTO tours_images (location_name, price, description,duration, location, minimum_age, rating, image) 
                VALUES ('$locationName', '$price', '$description','$duration', '$location', '$minimumAge', '$rating', '$image')";
    
        // Execute SQL query
        if (mysqli_query($conn, $sql)) {
            echo "Image added successfully!";
        } else {
            echo "Error: " . mysqli_error($conn);
        }
    }
    
?>