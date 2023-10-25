package algo_pack;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public  class Main extends JFrame {

    private static final Scanner input = new Scanner(System.in);
    protected static String currentLocation;
    protected static String destinationLocation;
    private static String end;
    private static boolean validSourceInput = false;
    private static boolean validDestinationInput = false;
    private static boolean stop = false;
    private static ArrayList<Object> pointOnGraph = new ArrayList<>();

    private static algo_pack.Gui gui = new Gui();
    private static List<String> elements = new ArrayList<>();



    public static void main(String[] args) {
        Gui.displayArray();
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });*/



    }

    private static void runProgram() {


        //while (!stop){
            //gui.displayGui();

            //currentLocation = gui.getSourceLocation();
            //destinationLocation = gui.getDestinationLocation();
            //addPointToTheGraph();
            //addEdgeToTheGraph();

            //dFT();


            /*displaySource();
            displayDestinationLocation();
            if (currentLocation == destinationLocation){
                System.out.println("The destination you are searching for is where you are standing\n");
            }else {
                showWorking();
            }*/
            //runProgram();
            /*System.out.println("Enter 'q' to quit ");
            if (input.hasNext()) {
                String end = input.next();
                if (end.equals("q")){
                    stop = false;
                    break;
                }else{
                    runProgram();
                }
            }*/

        //}

        return;

    }

    private static void showWorking() {

        //gui.displayGui();
        addPointToTheGraph();
        addEdgeToTheGraph();
        dFT();

    }


    public static void displaySource(){
        //--uncomment this one
/*
        System.out.println("Location Finder");
        System.out.println("What is your source location");
        System.out.println("""
                    ( 1 )  East Gate
                    ( 2 )  Farm Land
                    ( 3 )  West Gate
                    ( 4 )  GCB
                    ( 5 )  KNH
                    ( 6 )  Valco Hall
                    ( 7 )  ATL office
                    ( 8 )  Vice Chancellor's Lodge
                    ( 9 )  Casford Hall
                    ( 10 ) Prudential Bank
                    ( 11 ) Valco Trust Hall
                    ( 12 ) Sasakwa
                    ( 13 ) SSNIT Hotel
                    ( 14 ) UPSHA
                    ( 15 ) Sam Jonah Library
                    ( 16 ) CANS Block
                    ( 17 ) G-Block
                    ( 18 ) New Admistration Block (New Site)
                    ( 20 ) Science Market
                    ( 21 ) Parliament House
                    ( 22 ) LLT
                    ( 23 ) LT
                    ( 24 ) CALC
                    ( 25 ) NEC
                    ( 26 ) MIS
                    ( 27 ) Amissah Arthur Language Center
                    ( 28 ) Institution Of Eduction
                    ( 29 ) NLT
                    ( 30 ) School Of Business
                    ( 31 ) PHD lecture Hall
                    ( 32 ) Sandwich Lecture Theater
                    ( 33 ) University Primary and KG
                    ( 34 ) University JHS
                    ( 35 ) Sport Complex
                    ( 36 ) Taxi rank (old site)
                    ( 37 ) Old Administration block (old site)
                    ( 38 ) Oguaa Hall
                    ( 39 ) Adeyhe hall 
                    ( 40 ) ATL
                    ( 41 ) SRC Hall
                    ( 42 ) Superanuation Hall
                    ( 43 ) PSI Hall
                    ( 44 ) University Hall
                    
                    
                
                """);
        int inputForCurrentLocation = 0;
        if(input.hasNextInt()){
            inputForCurrentLocation = input.nextInt();
        }else{
            System.out.println("\n Invalid input try again");
            displaySource();
        }

        switch (inputForCurrentLocation) {
            case 1:
                currentLocation = "East_Gate";
                validSourceInput = true;
                break;
            case 2:
                currentLocation = "Farm_Land";
                validSourceInput = true;
                break;
            case 3:
                currentLocation = "West_Gate";
                validSourceInput = true;
                break;
            case 4:
                currentLocation = "GCB";
                validSourceInput = true;
                break;
            case 5:
                currentLocation = "KNH";
                validSourceInput = true;
                break;
            case 6:
                currentLocation = "Valco_Hall";
                validSourceInput = true;
                break;
            case 7:
                currentLocation = "ATL_FM";
                validSourceInput = true;
                break;
            case 8:
                currentLocation = "Vice_Chancellor's_Lodge";
                 validSourceInput = true;
                break;
            case 9:
                currentLocation = "Casford_Hall";
                validSourceInput = true;
                break;
            case 10:
                currentLocation = "Prudential_Bank";
                validSourceInput = true;
                break;
            case 11:
                currentLocation = "Valco_Trust_Hall";
                validSourceInput = true;
                break;
            case 12:
                currentLocation = "Sasakawa_Hotel";
                validSourceInput = true;
                break;
            case 13:
                currentLocation = "SSNIT_Hotel";
                validSourceInput = true;
                break;
            case 14:
                currentLocation = "UPSHS";
                validSourceInput = true;
                break;
            case 15:
                currentLocation = "Sam_Jonah_Library";
                validSourceInput = true;
                break;
            case 16:
                currentLocation = "CANS_Block";
                validSourceInput = true;
                break;
            case 17:
                currentLocation = "G-Block";
                validSourceInput = true;
                break;
            case 18:
                currentLocation = "New_Administration_Block_(new site)";
                validSourceInput = true;
                break;
            case 19:
                currentLocation = "CODE";
                validSourceInput = true;
                break;
            case 20:
                currentLocation = "Science_Market";
                validSourceInput = true;
                break;
            case 21:
                currentLocation = "Parliament_House";
                validSourceInput = true;
                break;
            case 22:
                currentLocation = "LLT";
                validSourceInput = true;
                break;
            case 23:
                currentLocation = "LT";
                validSourceInput = true;
                break;
            case 24:
                currentLocation = "CALC";
                validSourceInput = true;
                break;
            case 25:
                currentLocation = "NEC";
                validSourceInput = true;
                break;
            case 26:
                currentLocation = "MIS";
                validSourceInput = true;
                break;
            case 27:
                currentLocation = "Amissah_Arthur_Language_Center";
                validSourceInput = true;
                break;
            case 28:
                currentLocation = "Institution_Of_Education";
                validSourceInput = true;
                break;
            case 29:
                currentLocation = "NLT";
                validSourceInput = true;
                break;
            case 30:
                currentLocation = "School_Of_Business";
                validSourceInput = true;
                break;
            case 31:
                currentLocation = "PHD_lecture_Hall";
                validSourceInput = true;
                break;
            case 32:
                currentLocation = "Sandwich_Lecture_Theater";
                validSourceInput = true;
                break;
            case 33:
                currentLocation = "University_Primary_and_KD";
                validSourceInput = true;
                break;
            case 34:
                currentLocation = "University_JHS";
                validSourceInput = true;
                break;
            case 35:
                currentLocation = "Sport_Complex";
                validSourceInput = true;
                break;
            case 36:
                currentLocation = "Taxi_rank_(old site)";
                validSourceInput = true;
                break;
            case 37:
                currentLocation = "Old_Administration_Block_(old site)";
                validSourceInput = true;
                break;
            case 38:
                currentLocation = "Oguaa_Hall";
                validSourceInput = true;
                break;
            case 39:
                currentLocation = "Adeyhe_Hall";
                validSourceInput = true;
                break;
            case 40:
                currentLocation = "ATL";
                validSourceInput = true;
                break;
            case 41:
                currentLocation = "SRC_Hall";
                validSourceInput = true;
                break;
            case 42:
                currentLocation = "Superannuation_Hall";
                validSourceInput = true;
                break;
            case 43:
                currentLocation = "PSI_Hall";
                validSourceInput = true;
                break;
            case 44:
                currentLocation= "University_Hall";
                validSourceInput = true;
                break;
            case 45:
                currentLocation = "SMS";
                validSourceInput = true;
                break;
            case 46:
                currentLocation = "University_Hospital";
                validSourceInput = true;
                break;
            default:
                System.out.println("Enter a number with the range");
                displaySource();
        }*/

    }

    private static  void displayDestinationLocation(){
        //--uncomment this one
        /*System.out.println("Location Finder");
        System.out.println("What is your source location");
        System.out.println("""
                    ( 1 )  East Gate
                    ( 2 )  Farm Land
                    ( 3 )  West Gate
                    ( 4 )  GCB
                    ( 5 )  KNH
                    ( 6 )  Valco Hall
                    ( 7 )  ATL office
                    ( 8 )  Vice Chancellor's Lodge
                    ( 9 )  Casford Hall
                    ( 10 ) Prudential Bank
                    ( 11 ) Valco Trust Hall
                    ( 12 ) Sasakwa
                    ( 13 ) SSNIT Hotel
                    ( 14 ) UPSHA
                    ( 15 ) Sam Jonah Library
                    ( 16 ) CANS Block
                    ( 17 ) G-Block
                    ( 18 ) New Admistration Block (New Site)
                    ( 20 ) Science Market
                    ( 21 ) Parliament House
                    ( 22 ) LLT
                    ( 23 ) LT
                    ( 24 ) CALC
                    ( 25 ) NEC
                    ( 26 ) MIS
                    ( 27 ) Amissah Arthur Language Center
                    ( 28 ) Institution Of Eduction
                    ( 29 ) NLT
                    ( 30 ) School Of Business
                    ( 31 ) PHD lecture Hall
                    ( 32 ) Sandwich Lecture Theater
                    ( 33 ) University Primary and KG
                    ( 34 ) University JHS
                    ( 35 ) Sport Complex
                    ( 36 ) Taxi rank (old site)
                    ( 37 ) Old Administration block (old site)
                    ( 38 ) Oguaa Hall
                    ( 39 ) Adeyhe hall 
                    ( 40 ) ATL
                    ( 41 ) SRC Hall
                    ( 42 ) Superanuation Hall
                    ( 43 ) PSI Hall
                    ( 44 ) University Hall
                    ( 45 ) SMS
                    ( 46 ) University Hospital
                    
                    
                
                """);
        int inputForCurrentLocation = 0;
        if(input.hasNextInt()){
            inputForCurrentLocation = input.nextInt();
        }else{
            System.out.println("\n Invalid input try again");
            displaySource();
        }

        switch (inputForCurrentLocation) {
            case 1:
                destinationLocation = "East_Gate";
                validDestinationInput = true;
                break;
            case 2:
                destinationLocation = "Farm_Land";
                validDestinationInput = true;
                break;
            case 3:
                destinationLocation = "West_Gate";
                validDestinationInput = true;
                break;
            case 4:
                destinationLocation = "GCB";
                validDestinationInput = true;
                break;
            case 5:
                destinationLocation = "KNH";
                validDestinationInput = true;
                break;
            case 6:
                destinationLocation = "Valco_Hall";
                validDestinationInput = true;
                break;
            case 7:
                destinationLocation = "ATL_FM";
                validDestinationInput = true;
                break;
            case 8:
                destinationLocation = "Vice_Chancellor's_Lodge";
                validDestinationInput = true;
                break;
            case 9:
                destinationLocation = "Casford_Hall";
                validDestinationInput = true;
                break;
            case 10:
                destinationLocation = "Prudential_Bank";
                validDestinationInput = true;
                break;
            case 11:
                destinationLocation = "Valco_Trust_Hall";
                validDestinationInput = true;
                break;
            case 12:
                destinationLocation = "Sasakawa_Hotel";
                validDestinationInput = true;
                break;
            case 13:
                destinationLocation = "SSNIT_Hotel";
                validDestinationInput = true;
                break;
            case 14:
                destinationLocation = "UPSHS";
                validDestinationInput = true;
                break;
            case 15:
                destinationLocation = "Sam_Jonah_Library";
                validDestinationInput = true;
                break;
            case 16:
                destinationLocation = "CANS_Block";
                validDestinationInput = true;
                break;
            case 17:
                destinationLocation = "G-Block";
                validDestinationInput = true;
                break;
            case 18:
                destinationLocation = "New_Administration_Block_(new site)";
                validDestinationInput = true;
                break;
            case 19:
                destinationLocation = "CODE";
                validDestinationInput = true;
                break;
            case 20:
                destinationLocation = "Science_Market";
                validDestinationInput = true;
                break;
            case 21:
                destinationLocation = "Parliament_House";
                validDestinationInput = true;
                break;
            case 22:
                destinationLocation = "LLT";
                validDestinationInput = true;
                break;
            case 23:
                destinationLocation = "LT";
                validDestinationInput = true;
                break;
            case 24:
                destinationLocation = "CALC";
                validDestinationInput = true;
                break;
            case 25:
                destinationLocation = "NEC";
                validDestinationInput = true;
                break;
            case 26:
                destinationLocation = "MIS";
                validDestinationInput = true;
                break;
            case 27:
                destinationLocation = "Amissah_Arthur_Language_Center";
                validDestinationInput = true;
                break;
            case 28:
                destinationLocation = "Institution_Of_Education";
                validDestinationInput = true;
                break;
            case 29:
                destinationLocation = "NLT";
                validDestinationInput = true;
                break;
            case 30:
                destinationLocation = "School_Of_Business";
                validDestinationInput = true;
                break;
            case 31:
                destinationLocation = "PHD_lecture_Hall";
                validDestinationInput = true;
                break;
            case 32:
                destinationLocation = "Sandwich_Lecture_Theater";
                validDestinationInput = true;
                break;
            case 33:
                destinationLocation = "University_Primary_and_KD";
                validDestinationInput = true;
                break;
            case 34:
                destinationLocation = "University_JHS";
                validDestinationInput = true;
                break;
            case 35:
                destinationLocation = "Sport_Complex";
                validDestinationInput = true;
                break;
            case 36:
                destinationLocation = "Taxi_rank_(old site)";
                validDestinationInput = true;
                break;
            case 37:
                destinationLocation = "Old_Administration_Block_(old site)";
                validDestinationInput = true;
                break;
            case 38:
                destinationLocation = "Oguaa_Hall";
                validDestinationInput = true;
                break;
            case 39:
                destinationLocation = "Adeyhe_Hall";
                validDestinationInput = true;
                break;
            case 40:
                destinationLocation = "ATL";
                validDestinationInput = true;
                break;
            case 41:
                destinationLocation = "SRC_Hall";
                validDestinationInput = true;
                break;
            case 42:
                destinationLocation = "Superannuation_Hall";
                validDestinationInput = true;
                break;
            case 43:
                destinationLocation = "PSI_Hall";
                validDestinationInput = true;
                break;
            case 44:
                destinationLocation = "University_Hall";
                validDestinationInput = true;
                break;
            case 45:
                destinationLocation = "SMS";
                validDestinationInput = true;
                break;
            case 46:
                destinationLocation = "University_Hospital";
                validDestinationInput = true;
                break;
            default:
                System.out.println("Enter a number with the range");
                displayDestinationLocation();
        }*/
    }



    protected static void addEdgeToTheGraph() {
        GraphHashMap graphHashMap = new GraphHashMap(pointOnGraph);

        graphHashMap.addEdge("East_Gate","GCB",170);
        graphHashMap.addEdge("GCB","KNH",210);
        graphHashMap.addEdge("KNH","Valco_Hall",225);
        graphHashMap.addEdge("KNH","ATL_FM",300);
        graphHashMap.addEdge("Valco_Hall","Casford_Hall",317);
        graphHashMap.addEdge("Casford_Hall","Valco_Trust_Hall",600);
        graphHashMap.addEdge("Valco_Trust_Hall","Sasakawa_Hotel",78);
        graphHashMap.addEdge("Sasakawa_Hotel","Sam_Jonah_Library",260);
        graphHashMap.addEdge("Sam_Jonah_Library","LLT",37);
        graphHashMap.addEdge("Sasakawa_Hotel","CALC",405);
        graphHashMap.addEdge("Sam_Jonah_Library","New_Administration_Block_(new site)",305);
        graphHashMap.addEdge("Sam_Jonah_Library","CANS_Block",340);
        graphHashMap.addEdge("CANS_Block","LT",73);
        graphHashMap.addEdge("LT","G-Block",202);
        graphHashMap.addEdge("G-Block","MIS",220);
        graphHashMap.addEdge("LT","Amissah_Arthur_Language_Center",290);
        graphHashMap.addEdge("LT","MIS",237);
        graphHashMap.addEdge("G-Block","CALC",82);
        graphHashMap.addEdge("Institution_Of_Eduction","SMS",123);
        graphHashMap.addEdge("MIS","Institution_Of_Eduction",0);
        graphHashMap.addEdge("SMS","NEC",43);
        graphHashMap.addEdge("Amissah_Arthur_Language_Center","School_Of_Business",197);
        graphHashMap.addEdge("School_Of_Business","CODE",83);
        graphHashMap.addEdge("School_Of_Business","PHD_lecture_Hall",117);
        graphHashMap.addEdge("CODE","NLT",222);
        graphHashMap.addEdge("NLT","School_Of_Business",200);
        graphHashMap.addEdge("NLT","PHD_lecture_Hall",135);
        graphHashMap.addEdge("PHD_lecture_Hall","Sandwich_Lecture_Theater",300);
        graphHashMap.addEdge("Amissah_Arthur_Language_Center","Sandwich_Lecture_Theater",418);
        graphHashMap.addEdge("West_Gate","Taxi_rank_(old site)",397);
        graphHashMap.addEdge("Taxi_rank_(old site)","Oguaa_Hall",265);
        graphHashMap.addEdge("West_Gate","University_Hospital",551);
        graphHashMap.addEdge("Taxi_rank_(old site)","Old_Administration_block_(old site)",305);
        graphHashMap.addEdge("West_Gate","Old_Administration_block_(old site)",413);
        graphHashMap.addEdge("Old_Administration_block_(old site)","Oguaa_Hall",190);
        graphHashMap.addEdge("Old_Administration_block_(old site)","Adeyhe_hall",203);
        graphHashMap.addEdge("Old_Administration_block_(old site)","ATL",270);
        graphHashMap.addEdge("Oguaa_Hall","Adeyhe_hall",50);
        graphHashMap.addEdge("Adeyhe_hall","ATL",66);
        graphHashMap.addEdge("ATL","Oguaa_Hall",123);
        graphHashMap.addEdge("Oguaa_Hall","New_Administration_Block_(new site)",2080);
        graphHashMap.addEdge("University_Hospital","New_Administration_Block_(new site)",1720);
        graphHashMap.addEdge("Taxi_rank_(old site)","Science_Market",2560);
        graphHashMap.addEdge("Science_Market","New_Administration_Block_(new site)",218);
        graphHashMap.addEdge("University_Hall","PSI_Hall",161);
        graphHashMap.addEdge("PSI_Hall","SRC_Hall",156);
        graphHashMap.addEdge("SRC_Hall","Superannuation_Hall",191);
        graphHashMap.addEdge("Superannuation_Hall","Farm_Land",335);
        graphHashMap.addEdge("Farm_Land","CALC",1280);
        graphHashMap.addEdge("Sam_Jonah_Library","Parliament_House",155);
        graphHashMap.addEdge("Parliament_House","LT",87);
        graphHashMap.addEdge("Parliament_House","G-Block",73);
        graphHashMap.addEdge("Parliament_House","CANS_Block",67);
        graphHashMap.addEdge("CANS_Block","Science_Market",106);
        graphHashMap.addEdge("UPSHA","Farm_Land",1020);
        graphHashMap.addEdge("University_JHS","University_Hospital",235);
        graphHashMap.addEdge("University_Hospital","University_Primary_and_KG",373);
        graphHashMap.addEdge("East_Gate","Sam_Jonah_Library",1530);
        graphHashMap.addEdge("UPSHA","SSNIT_Hotel",505);
        graphHashMap.addEdge("University_JHS","New_Administration_Block_(new site)",1450);
        graphHashMap.addEdge("Vice_Chancellor's_Lodge","University_JHS",1480);
        graphHashMap.addEdge("Casford_Hall","Prudential_Bank",273);
        graphHashMap.addEdge("Vice_Chancellor's_Lodge","Casford_Hall",203);
        graphHashMap.addEdge("Vice_Chancellor's_Lodge","Sam_Jonah_Library",759);
        graphHashMap.addEdge("Vice_Chancellor's_Lodge","East_Gate",572);
        graphHashMap.addEdge("Vice_Chancellor's_Lodge","New_Administration_Block_(new site)",1030);
        graphHashMap.addEdge("SSNIT_Hotel","Valco_Trust_Hall",616);
        graphHashMap.addEdge("SSNIT_Hotel","Prudential_Bank",611);
        graphHashMap.addEdge("Sport_Complex","University_Hospital",406);
        graphHashMap.addEdge("Sport_Complex","Taxi_rank_(old site)",340);
        graphHashMap.addEdge("ATL_FM","Valco_Hall",336);
        graphHashMap.addEdge("Prudential_Bank","Valco_Trust_Hall",422);
        graphHashMap.addEdge("NEC","CODE",317);
        graphHashMap.addEdge("Valco_Trust_Hall","Prudential_Bank",422);
        graphHashMap.addEdge("Prudential_Bank","Casford_Hall",273);
        graphHashMap.addEdge("Casford_Hall", "Vice_Chancellor's_Lodge",203);
        graphHashMap.addEdge("East_Gate","Valco_Hall",366);
        graphHashMap.addEdge("Valco_Hall","Vice_Chancellor's_Lodge",490);
        graphHashMap.addEdge("KNH","Vice_Chancellor's_Lodge",551);
        //graphHashMap.addEdge("GCB","East Gate",29);
        /*graphHashMap.addEdge("","",);
        graphHashMap.addEdge("","",);
        graphHashMap.addEdge("","",)
        graphHashMap.addEdge("","",);
        graphHashMap.addEdge("","",)  */

        System.out.println(currentLocation+ " ----> " + destinationLocation);

         graphHashMap.printAllPaths(currentLocation, destinationLocation);
            //graphHashMap.printGraph();



//
        String allPathsArray;
        int minArrayLength = Integer.MAX_VALUE;
        for(String[] s : graphHashMap.allPaths) {
//                    allPathsArray = Arrays.toString(s);
//                    System.out.print(allPathsArray);
            if(s.length<minArrayLength){
                minArrayLength=s.length;
            }
        }

        List<String[]> pathsList = new ArrayList<>();  // A list to store individual arrays

        for (String[] s : graphHashMap.allPaths) {
            if (s.length == minArrayLength) {
                String pathString = String.join(" ", s);
               // System.out.println(pathString);  // Print the comma-separated line
                pathsList.add(s.clone());  // Add the array to the list
            }
        }

        String[][] arrayOfArrays = pathsList.toArray(new String[0][]);  // Convert the list to a 2D array

        try(FileWriter writer = new FileWriter("output.txt")){
            for (String[] row : arrayOfArrays) {
                for (String element : row) {
                    writer.write(element + " ");
                }
                writer.write("\n"); // Move to the next line after printing a row
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        for (String[] row : arrayOfArrays) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

      //  System.out.println(rows +" " + colum);

        int row = arrayOfArrays.length;
        System.out.println(row);
        for(int x = 0; x < row; x++){

        }

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();


        System.out.println("reading from the file");

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                elements.add(line); // Store each line as an element
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : elements) {
            System.out.println(line);
        }
        //System.out.println(elements.get(0));
        //System.out.println(elements.get(1));

        // Print each element
        //System.out.println(elements.size());

        /*try {
            a.add(elements.get(0));
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            b.add(elements.get(1));
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            c.add(elements.get(2));
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            d.add(elements.get(3));
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            l.add(elements.get(4));
        }catch (Exception e){
            System.out.println(e);
        }

        for(int x = 0; x < a.size(); x++){
            System.out.println(a.get(x));
        }
        for(int x = 0; x < b.size(); x++){
            System.out.println(b.get(x));
        }
        System.out.println(b.size());
        System.out.println(a.size());*/
        String[] arraya;
        String[] arrayb;
        String[] arrayc;
        String[] arrayd;
        String[] arraye;

       // gui.setElements(elements);





        try {
            arraya = elements.get(0).split(" ");
            for(String z: arraya){
                try {
                    System.out.println(z);
                    System.out.println("aaa");

                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println(e);

        }
        try {
                arrayb = elements.get(1).split(" ");
                for (String z : arrayb) {
                    System.out.println(z);
                }
        } catch (Exception e) {
            System.out.println("bb");
            System.out.println(e);
        }
        try {
            arrayc = elements.get(2).split(" ");
            for (String z : arrayc) {
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println("cvc");

            System.out.println(e);
        }
        try {
            arrayd = elements.get(3).split(" ");
            for (String z : arrayd) {
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            arraye = elements.get(4).split(" ");
            for (String z : arraye) {
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println(e);
        }



        //Gui.element = elements;

        //---
        gui.setElements(elements);
        System.out.println(Gui.element);



    }

    private static void direction(String[] p) {

    }

    protected static void addPointToTheGraph() {
        pointOnGraph.add("Farm_Land");
        pointOnGraph.add("West_Gate");
        pointOnGraph.add("East_Gate");
        pointOnGraph.add("GCB");
        pointOnGraph.add("KNH");
        pointOnGraph.add("Valco_Hall");
        pointOnGraph.add("ATL_FM");
        pointOnGraph.add("Vice_Chancellor's_Lodge");
        pointOnGraph.add("Casford_Hall");
        pointOnGraph.add("Prudential_Bank");
        pointOnGraph.add("Valco_Trust_Hall");
        pointOnGraph.add("Sasakawa_Hotel");
        pointOnGraph.add("SSNIT_Hotel");
        pointOnGraph.add("UPSHA");
        pointOnGraph.add("Sam_Jonah_Library");
        pointOnGraph.add("CANS_Block");
        pointOnGraph.add("G-Block");
        pointOnGraph.add("New_Administration_Block_(new site)");
        pointOnGraph.add("CODE");
        pointOnGraph.add("Science_Market");
        pointOnGraph.add("Parliament_House");
        pointOnGraph.add("LLT");
        pointOnGraph.add("LT");
        pointOnGraph.add("CALC");
        pointOnGraph.add("NEC");
        pointOnGraph.add("MIS");
        pointOnGraph.add("Amissah_Arthur_Language_Center");
        pointOnGraph.add("Institution_Of_Eduction");
        pointOnGraph.add("NLT");
        pointOnGraph.add("School_Of_Business");
        pointOnGraph.add("PHD_lecture_Hall");
        pointOnGraph.add("Sandwich_Lecture_Theater");
        pointOnGraph.add("University_Primary_and_KG");
        pointOnGraph.add("University_JHS");
        pointOnGraph.add("Sport_Complex");
        pointOnGraph.add("Taxi_rank_(old site)");
        pointOnGraph.add("Old_Administration_block_(old site)");
        pointOnGraph.add("Oguaa_Hall");
        pointOnGraph.add("Adeyhe_hall");
        pointOnGraph.add("ATL");
        pointOnGraph.add("SRC_Hall");
        pointOnGraph.add("Superannuation_Hall");
        pointOnGraph.add("PSI_Hall");
        pointOnGraph.add("University_Hall");
        pointOnGraph.add("SMS");
        pointOnGraph.add("University_Hospital");
        //pointOnGraph.add("");

    }

private static void dFT() {

}

}

