<?php
    //including files from the database folder
    include './database/connect.php';
    include './database/add.php';
    include './database/get.php';
    include './database/delete.php';




    $imageUploadData = ['location_name' => '','price' => '','description' => '', 'duration' => '', 'location' => '','minimum_age' => '','rating' => '','image' => ''];
    $uploadImageErrors = ['location_name' => '','price' => '','description' => '','duration' => '','location' => '','minimum_age' => '','rating' => '','image' => ''];
    
    function sanitize_input($input) {
        $input = trim($input); // Remove leading/trailing whitespace
        $input = stripslashes($input); // Remove backslashes
        $input = htmlspecialchars($input); // Convert special characters to HTML entities
        return $input;
    }
    if (isset($_POST['uploadBtm'])) {
        // Validate Location Name
        $locationName = $_POST['location_name'] ?? '';
        $locationName = sanitize_input($locationName);
        if (empty($locationName)) {
            $uploadImageErrors['location_name'] = 'Location Name is required';
        }else{
            $imageUploadData['location_name'] = $locationName;
        }
        
        // Validate Price
        $price = $_POST['price'] ?? '';
        $price = sanitize_input($price);
        if (!is_numeric($price) || $price <= 0) {
            $uploadImageErrors['price'] = 'Price must be a positive number';
        }else{
            $imageUploadData['price'] = $price;
        }
        
        // Validate Description
        $description = $_POST['description'] ?? '';
        $description = sanitize_input($description);
        if (empty($description)) {
            $uploadImageErrors['description'] = 'Description is required';
        }else{
            $imageUploadData['description'] = $description;
        }
        
        // Validate Duration
        $duration = $_POST['duration'] ?? '';
        $duration = sanitize_input($duration);
        if (empty($duration)) {
            $uploadImageErrors['duration'] = 'Duration is required';
        }else{
            $imageUploadData['duration'] = $duration;
        }
        
        // Validate Location
        $location = $_POST['location'] ?? '';
        $location = sanitize_input($location);
        if (empty($location)) {
            $uploadImageErrors['location'] = 'Location is required';
        }else{
            $imageUploadData['location'] = $location;
        }
        
        // Validate Minimum Age
        $minimumAge = $_POST['minimum_age'] ?? '';
        $minimumAge = sanitize_input($minimumAge);
        if (!is_numeric($minimumAge) || $minimumAge < 0) {
            $uploadImageErrors['minimum_age'] = 'Minimum Age must be a non-negative number';
        }else{
            $imageUploadData['minimum_age'] = $minimumAge;
        }
        
        // Validate Rating
        $rating = $_POST['rating'] ?? '';
        $rating = sanitize_input($rating);
        if (!is_numeric($rating) || $rating < 0 || $rating > 10) {
            $uploadImageErrors['rating'] = 'Rating must be a number between 0 and 10';
        }else{
            $imageUploadData['rating'] = $rating;
        }
        
        // Check if an image was uploaded
        if (isset($_FILES['uploadImage']) && $_FILES['uploadImage']['error'] === UPLOAD_ERR_OK) {
            $image = $_FILES['uploadImage'];
            print_r($image);

            // Check if the uploaded file is an image
            $imageInfo = getimagesize($image['tmp_name']);
            if ($imageInfo === false) {
                $uploadImageErrors['image'] = 'Invalid image file';
            } else {
                $validImageExtension = ['jpg','jpeg','png'];
                $fileName = $_FILES['uploadImage']['name'];
                $imageExtension = explode(".", $fileName);
                $imageExtension = strtolower(end($imageExtension));
                $tmpName = $_FILES['uploadImage']['tmp_name'];
                if(!in_array($imageExtension, $validImageExtension)){
                  $create_errors['image'] = "Please select a valid image (JPG, JPEG, PNG).";
                }else{
                  $newImageName = uniqid();
                  $newImageName .= '.' . $imageExtension;
                  
                  if(!move_uploaded_file($tmpName, "img/".$newImageName)){
                    $uploadImageErrors['image'] = "Failed to upload image.";
                  }else{
                    $imageUploadData['image'] = $newImageName;
                  }
                
                }
            }
        } else {
            $uploadImageErrors['image'] = 'No image file uploaded';
        }

        if (array_filter($uploadImageErrors)) {
            print_r($uploadImageErrors);
        }else{
            addImage($conn,$imageUploadData);
        }
    
    }
?>
<p>Hello World</p>
<form action="admin.php" method="POST" enctype="multipart/form-data">
<label for="location_name">Location Name:</label>
        <input type="text" id="location_name" name="location_name" placeholder="Location Name">
        <p><?php echo $uploadImageErrors['location_name'] ?? ''; ?></p>
    </div>
    <div>
        <label for="price">Price:</label>
        <input type="text" id="price" name="price" placeholder="Price">
        <p><?php echo $uploadImageErrors['price'] ?? ''; ?></p>
    </div>
    <div>
        <label for="description">Description:</label>
            <textarea id="description" name="description" cols="30" rows="10"></textarea>
        <p><?php echo $uploadImageErrors['description'] ?? ''; ?></p>
    </div>
    <div>
        <label for="duration">Duration:</label>
        <input type="text" id="duration" name="duration" placeholder="Duration">
        <p><?php echo $uploadImageErrors['duration'] ?? ''; ?></p>
    </div>
    <div>
        <label for="location">Location:</label>
        <input type="text" id="location" name="location" placeholder="Location">
        <p><?php echo $uploadImageErrors['location'] ?? ''; ?></p>
    </div>
    <div>
        <label for="minimum_age">Minimum Age:</label>
        <input type="text" id="minimum_age" name="minimum_age" placeholder="Minimum Age">
        <p><?php echo $uploadImageErrors['minimum_age'] ?? ''; ?></p>
    </div>
    <div>
        <label for="rating">Rating:</label>
        <input type="text" id="rating" name="rating" placeholder="Rating">
        <p><?php echo $uploadImageErrors['rating'] ?? ''; ?></p>
    </div>
    <label for="image">Image:</label>
        <input type="file" id="image" name="uploadImage" accept="image/*" >
        <p><?php echo $uploadImageErrors['image'] ?? ''; ?></p>
    <button type="submit" name='uploadBtm'>Upload</button>
</form>
