<?php

    $object = new User;

    $object->name = "Save";
    $object->password = "123qwe";
    print_r($object);
    echo "<br>";

    print_r($object->save_user());// accessing the element of an object

    class User{
        public $name, $password;

         function save_user(){
            echo "Save use code goes here";
        }
    }

    //constructor and destructors

    echo "<br> <br>";
    $hello = new Hello();
    $hello->__construct();
    print_r($hello);
    class Hello{
         
        function __construct() {
            
        }

        function __destruct(){

        }
    }

    echo "<br> <br>";

    //static method

    Hi::pwd_string();// accessing static members
    class Hi{
        static function pwd_string(){
            echo "Please enter your password";
        }
        static $static_property = "I'm static";
        function get_sp()
        {
            return self::$static_property;
        }
    }

    //inheritance

?>