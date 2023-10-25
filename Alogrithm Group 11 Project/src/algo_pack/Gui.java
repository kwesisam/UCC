package algo_pack;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Gui {
    private static String[] a;
    private static String[] b;
    private static String[] c;
    private static String[] d;
    private static String[] e;
    private static JFrame jFrame = new JFrame();
    private static String finalArray = "";
    private static Boolean validA, validB, validC, validD, validE;
    private static JPanel labelGroup;
    private static JPanel panelRight;
    private static DefaultComboBoxModel<String> destinationLocationModel;
    private static JFrame window;
    private static JPanel panelLeft;
    private static  JComboBox<String> sourcelocationDropdown;
    private static JComboBox<String> destinationlocationDropdown;
    private static DefaultComboBoxModel<String> sourcelocationModel;
    private static JButton submit_btn;
    private static JLabel sourceLabel, destinationLabel, appName;
    private static String sLocation, dLcoation;
    private static int x = 1;
    private static JTextArea textArea;
    private static JLabel currentLocation;
    private static JLabel nextLocationTion;
    private static String[] name;
    private static int confirm_int;
    private static Main main = new Main();
    private static JLabel aLocation = new JLabel();
    private static JLabel bLocation = new JLabel();
    private static String current;
    private static String next_a;
    private static String[] locationNames = {
            "East_Gate", "Farm_Land", "West_Gate", "GCB", "KNH", "Valco_Hall",
            "ATL_FM", "Vice_Chancellor's_Lodge", "Casford_Hall", "Prudential_Bank",
            "Valco_Trust_Hall", "Sasakwa_Hotel", "SSNIT_Hotel", "UPSHS", "Sam_Jonah Library",
            "CANS_Block", "G-Block", "New_Administration_Block_(new site)", "Science_Market",
            "Parliament_House", "LLT", "LT", "CALC", "NEC", "MIS",
            "Amissah_Arthur_Language_Center", "Institution_Of_Eduction", "NLT",
            "School_Of_Business", "PHD_lecture_Hall", "Sandwich_Lecture_Theatre",
            "University_Primary_and_KG", "University_JHS", "Sport_Complex",
            "Taxi_rank_(old site)", "Old_Administration_block_(old site)", "Oguaa_Hall",
            "Adeyhe_hall", "ATL", "SRC_Hall", "Superannuation_Hall", "PSI_Hall",
            "University_Hall", "SMS", "University_Hospital"
    };


    protected static List<String> element = new ArrayList<>();

    public void setElements(List<String> list){
        System.out.println("from gui");
        element = list;
        System.out.println(element);
        setArray();
    }



    public static void setArray(){

        System.out.println(element);

        try {
            a = element.get(0).split(" ");
            for(String z: a){
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println("Aaaa");
            System.out.println(e);

        }
        try {
            b = element.get(1).split(" ");
            for (String z : b) {
                System.out.println(z);
            }
        } catch (Exception e) {
            System.out.println("BBbb");
            System.out.println(e);
        }
        try {
            c = element.get(2).split(" ");
            for (String z : c) {
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            d = element.get(3).split(" ");
            for (String z : d) {
                System.out.println(z);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            e = element.get(4).split(" ");
            for (String z : e) {
                System.out.println(z);
            }
        }catch (Exception m){
            System.out.println(m);
        }

        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout());

       // displayArray();
        //jFrame.setVisible(true);




        for(int x = 0; x < element.size(); x++){
            System.out.print(x+1);
            System.out.println(element.get(x));
        }


    }

    public static void displayArray(){
        window  = new JFrame();
        panelLeft = new JPanel();
        panelRight = new JPanel();



        window.setTitle("Easy Location Finder");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(900,700);
        window.setLocationRelativeTo(null);
        //window.setBackground(Color.GREEN);

        sourceLabel = new JLabel();
        sourceLabel.setText("Select Your Source Location");
        sourceLabel.setForeground(Color.white);
        destinationLabel = new JLabel();
        destinationLabel.setText("Select Your Destination Location");
        destinationLabel.setForeground(Color.white);
        panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        panelLeft.setPreferredSize(new Dimension(250,250));
        panelLeft.setBackground(Color.blue);
        //panelRight.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        panelRight.setLayout(new BoxLayout(panelRight,BoxLayout.PAGE_AXIS));
        panelRight.setPreferredSize(new Dimension(610,400));
        //panelRight.setBackground(Color.GREEN);
        sourcelocationModel = new DefaultComboBoxModel<>(locationNames);
        destinationLocationModel = new DefaultComboBoxModel<>(locationNames);
        sourcelocationDropdown = new JComboBox<>(sourcelocationModel);
        destinationlocationDropdown = new JComboBox<>(destinationLocationModel);

        appName = new JLabel();
        appName.setText("Easy Location Finder");
        appName.setFont(new Font("Georgia",Font.BOLD,20));
        appName.setForeground(Color.red);



        aLocation.setText( "Source location  "+ " " + "empty");
        aLocation.setFont(new Font("Arial",Font.BOLD,15));
        Border aLocationBorder = BorderFactory.createEmptyBorder(20, 0, 0, 0);
        aLocation.setBorder(aLocationBorder);

        //aLocation.add(Box.createRigidArea(new Dimension(0,39)));
        // int labelX = panelRight.getWidth() - 900 - aLocation.getPreferredSize().width;
        //aLocation.setBounds(labelX, 50, aLocation.getPreferredSize().width, aLocation.getPreferredSize().height);

        bLocation.setText("Destination location " + " " + "empty");
        bLocation.setFont(new Font("Arial",Font.BOLD,15));
        Border bLocationBorder = BorderFactory.createEmptyBorder(20,0,30,0);
        bLocation.setBorder(bLocationBorder);

        submit_btn = new JButton();
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sLocation = (String) sourcelocationDropdown.getSelectedItem().toString();
                dLcoation = (String) destinationlocationDropdown.getSelectedItem().toString();
                System.out.println(sLocation +" " + dLcoation);
                aLocation.setText("Source location: "+ sLocation);
                bLocation.setText("Destination location: " + dLcoation);


                Main.destinationLocation = dLcoation;
                Main.currentLocation = sLocation;
                Main.addPointToTheGraph();

                //setArray();
                Main.addEdgeToTheGraph();
                work();
                String confirm = JOptionPane.showInputDialog(null,finalArray,"The available rout to your destination",JOptionPane.PLAIN_MESSAGE);

                confirm_int = Integer.parseInt(confirm);
                help();
                switch (confirm_int){
                    case 1:
                        name = a;
                        break;
                    case 2:
                        name = b;
                        break;
                }
                //System.out.println(name[1]);





            }
        });

        System.out.println(confirm_int);
        currentLocation = new JLabel();
        nextLocationTion = new JLabel();
        currentLocation.setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
        nextLocationTion.setBorder(BorderFactory.createEmptyBorder(20,0,20,20));




        //String[] name = {"CALC","Sasakawa Hotel","Prudential Bank", "Casford Hall"};





        textArea = new JTextArea(
                """
                        This will direct you to your destination
                    
                        """
        );
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false); // Make the text area read-only
        textArea.setPreferredSize(new Dimension(300, 150));
        textArea.setFont(new Font("Arial", Font.BOLD,20));
        textArea.setColumns(20); // Set the desired number of columns
        textArea.setRows(5);
        JScrollPane scrollPane = new JScrollPane(textArea); // Add scrolling if needed

        JButton next = new JButton("Next");

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try{
                    if(x < name.length){
                        System.out.println(x);
                        System.out.println(name[x]);
                        currentLocation.setText(name[x]);
                        nextLocationTion.setText(name[x+1]);
                        current = currentLocation.getText().toString();
                        next_a = nextLocationTion.getText().toString();
                        displayDirection();
                        x++;
                    }

                    /*currentLocation.setText(name[x]);
                    System.out.println(currentLocation);

                    nextLocationTion.setText( name[++x]);
                    System.out.println(nextLocationTion);*/

                    //x++;
                }catch (Exception e1){
                    textArea.setText(e1 + " you at the end");
                }

            }
        });

        panelLeft.add(appName);
        panelLeft.add(sourceLabel);
        panelLeft.add(sourcelocationDropdown);
        panelLeft.add(destinationLabel);
        panelLeft.add(destinationlocationDropdown);
        panelLeft.add(submit_btn);


        //panelRight.add(aLocation,BorderLayout.CENTER);
        //panelRight.add(bLocation,BorderLayout.CENTER);
        JPanel location_box = new JPanel();
        location_box.setLayout(new BoxLayout(location_box,BoxLayout.PAGE_AXIS));
        location_box.add(aLocation,BorderLayout.CENTER);
        location_box.add(bLocation,BorderLayout.CENTER);
        //location_box.setBackground(Color.red);
        //location_box.setPreferredSize(new Dimension(500,300));
        panelRight.add(location_box);

        JPanel navigationLocation = new JPanel();
        navigationLocation.setLayout(new BoxLayout(navigationLocation,BoxLayout.Y_AXIS));
        //navigationLocation.add(currentLocation,BorderLayout.CENTER);
        //navigationLocation.add(nextLocationTion,BorderLayout.CENTER);

        //panelRight.add(group);
        panelRight.add(nextLocationTion,BorderLayout.CENTER);
        panelRight.add(currentLocation,BorderLayout.CENTER);

        panelRight.add(next);
        navigationLocation.add(scrollPane,BorderLayout.CENTER);
        navigationLocation.setBorder(BorderFactory.createEmptyBorder(150,20,20,20));
        panelRight.add(navigationLocation);

        window.add(panelLeft,BorderLayout.WEST);
        window.add(panelRight,BorderLayout.EAST);
        window.setResizable(false);
        window.setVisible(true);

    }

    private static void help(){

    }

    private static void work(){
        boolean u = false;
        boolean i = false;
        boolean o = false;
        boolean p = false;
        boolean y = false;


        try{

            for(int x = 0; x < a.length; x++){
            }


            y = true;
        }catch (Exception m){
            System.out.println(m);
        }




        try{

            for(int x = 0; x < b.length; x++){


            }


            u = true;
        }catch (Exception m){
            System.out.println(m);
        }



        try{

            for(int x = 0; x < c.length; x++){


            }

            i = true;

        }catch (Exception m){
            System.out.println(m);
        }


        try {

            for(int x = 0; x < d.length; x++){


            }


            o = true;
        }catch (Exception m){
            System.out.println(m);
        }


        try {

            for(int x = 0; x < e.length; x++){
                finalArray +=  e[x] + " ";
            }
            p = true;
        }catch (Exception m){
            System.out.println(m);
        }

        System.out.println(y);
        System.out.println(u);
        System.out.println(i);
        System.out.println(o);
        System.out.println(p);

        validA = y;
        validB = u;
        validC = i;
        validD = o;
        validE = p;

        if(validA){
            finalArray += 1;
            for(int x = 0; x < a.length; x++){
                finalArray +=  a[x] + " ";
            }
        }
        if(validB){
            finalArray += "\n" + 2;
            for(int x = 0; x < b.length; x++){
                finalArray +=  b[x] + " ";
            }
        }

        if(validC){
            finalArray += "\n" + 3;
            for(int x = 0; x < c.length; x++){
                finalArray +=  c[x] + " ";
            }
        }
        if(validD){
            finalArray += "\n" + 4;
            for(int x = 0; x < d.length; x++){
                finalArray +=  d[x] + " ";
            }
        }
        if(validE){
            finalArray += "\n" + 5;
            for(int x = 0; x < e.length; x++){
                finalArray +=  e[x] + " ";
            }
        }


        System.out.println(finalArray);
        //JOptionPane.showMessageDialog(null,finalArray,"The availabe route to your destination",JOptionPane.PLAIN_MESSAGE);

        /*String confirm = JOptionPane.showInputDialog(null,finalArray,"The available rout to your destination",JOptionPane.PLAIN_MESSAGE);

        int confirm_int = Integer.parseInt(confirm);
        System.out.println(confirm_int);
        switch (confirm_int){
            case 1:
                name = a;
                break;
            case 2:
                name = b;
                break;
        }*/
    }

    private static void displayDirection() {
        /*int y = 1;
        nextLocationTion.setText(name[y]);
        if( y <= name.length){
            y++;
        }

            nextLocationTion.setText(name[y]);*/

        System.out.println(current + "is current location");
        System.out.println(next_a + " is next location");


        if (current.equals("East_Gate") && next_a.equals("GCB")) {
            textArea.setText("""
                      East Gate, proceed for 50 meters, and at that point, make a right turn. Continue walking for 90 meters, and you'll arrive at your destination, GCB.

                    """);
        } else if (current.equals("GCB") && next_a.equals("East_Gate")) {
            textArea.setText("""                                                                           
                    "From GCB, walk 90 meters, then make a left turn. After that, proceed for 50 meters, and you'll reach the East Gate."
                    """);

        } else if (current.equals("GCB") && next_a.equals("KNH")) {
            textArea.setText("""
                    Start at GCB and walk for 43 meters. Then, take a right turn. Continue walking for 80.6 meters, and you will arrive at KNH.
                    Or
                    If you're using the road, first head from GCB towards KNH/GCB junction for 150 meters. At the junction, make a right turn, and you'll reach KNH
                    """);
        } else if (current.equals("KNH") && next_a.equals("GCB")) {
            textArea.setText("""
                    Start at KNH and walk for 80.6 meters. Then, take a left turn. Continue walking for 43 meters, and you will arrive at GCB.
                    Or
                    If you're using the road to return, start from KNH and head towards the KNH/GCB junction for 150 meters. At the junction, make a left turn, and you'll reach GCB.
                                                
                    """);

        } else if (current.equals("Valco_Hall") && next_a.equals("Casford_Hall")) {
            textArea.setText("""
                        Walk 125 meters on foot until you reach the Valco Hall/Casford Hall bush junction.
                        At the junction, continue walking for 55 meters.
                        From there, proceed another 98 meters to reach Casford Hall
                    """);
        } else if (current.equals("Casford_Hall") && next_a.equals("Valco_Hall")) {
            textArea.setText("""
                    Walk 125 meters on foot until you reach the Valco Hall/Casford Hall bush junction.
                    At the junction, continue walking for 55 meters.
                    From there, proceed another 98 meters to reach Casford Hall
                    """);
        } else if (current.equals("Valco_Hall") && next_a.equals("KNH")) {
            textArea.setText("""
                    Walk back along the same road for 269 meters from Valco Hall, and you'll reach KNH. No turns are necessary; just follow the road in the opposite direction.
                    """);
        } else if (current.equals("KNH") && next_a.equals("Valco_Hall")) {
            textArea.setText("""
                    Simply follow the road for 269 meters from KNH, and you will arrive at Valco Hall. No turns are needed; just continue straight along the road.
                    """);
        } else if (current.equals("KNH") && next_a.equals("ATL_FM")) {
            textArea.setText("""
                                   Begin at KNH and walk 142 meters until you reach the Valco Hall/KNH/ATL FM junction.
                                   At the junction, turn right.
                                   86 meters from the junction.
                                   Then, turn left again and proceed for 109 meters. You will arrive at ATL FM.
                                                  
                    """);
        } else if (current.equals("ATL_FM") && next_a.equals("Valco_Hall")) {
            textArea.setText("""
                    Begin at ATL FM and walk back 109 meters.
                    Turn left at the Valco Hall/KNH/ATL FM junction and walk or drive 86 meters.
                    At the junction, turn left and walk or drive 142 meters. This will bring you back to KNH.
                    """);
        } else if (current.equals("Valco_Hall") && next_a.equals("ATL_FM")) {
            textArea.setText("""
                                   Begin at Valco Hall and walk or drive 99 meters until you reach the Valco Hall/KNH/ATL FM junction.
                                   At the junction, turn left.
                                   86 meters from the junction.
                                   Then, turn left again and proceed for 109 meters. You will arrive at ATL FM.
                                                  
                    """);
        } else if (current.equals("ATL_FM") && next_a.equals("KNH")) {
            textArea.setText("""
                    Begin at ATL FM and walk back 109 meters.
                    Turn left at the Valco Hall/KNH/ATL FM junction and walk or drive 86 meters.
                    At the junction, turn right and walk 99 meters. This will bring you back to Valoc Hall.
                    """);
        } else if (current.equals("Sasakawa_Hotel") && next_a.equals("CALC")) {
            textArea.setText("""
                        Start at Sasakawa and walk for 356 meters.
                        Continue straight until you reach the CALC/Sasakawa/Farm land road junction.
                        Remember not to turn when you reach the CALC/Sasakawa/Farm land road junction, and you'll find your destination, CALC.
                    """);
        } else if (current.equals("CALC") && next_a.equals("Sasakawa_Hotel")) {
            textArea.setText("""
                            Begin at CALC and walk back to the CALC/Sasakawa/Farm land road junction.
                           From the junction, walk 356 meters to reach Sasakawa.
                           This will guide you in reversing your route from CALC back to Sasakawa.
                    """);
        } else if (current.equals("East_Gate") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    Head Straignt for 560 meters until you reach the traffic junction
                    """);
        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("East_Gate")) {
            textArea.setText("""
                    At the traffic junction, head straight(right) for 560 meters to East Gate.
                    """);
        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("Casford_Hall")) {
            textArea.setText("""
                    The direction to take depends on where you're coming from: 
                    straight if from Vice_Chancellor's_Lodge, left if from the roundabout, 
                    and right if from the East Gate. This will lead you to Casford Hall which is 128 meter from Vice_Chancellor's_Lodge (traffic light)
                    """);

        } else if (current.equals("Casford_Hall") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    At Casford Hall, turn left and proceed for 128 meters until you reach the traffic light. There, you will find Vice_Chancellor's_Lodge.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    Walk or drive for 843 meters from Vice Chancellor's Lodge, and you'll arrive at your destination, Sam Jonah Library. Look out for the landmark,
                     which is a statue of a man reading, located at the roundabout.
                    """);

        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    From Sam Jonah Library, walk back or drive for 843 meters using the road leading to East Gate.
                     You'll recognize the landmark, the statue of the man reading at the roundabout, which will guide you to Vice Chancellor's Lodge.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("New_Administration_Block_(new site)")) {
            textArea.setText("""
                    From Vice Chancellor's Lodge, on the same road (East Gate road). Walk or drive 845 meters to the CANS/Sam Jonah traffic light, 
                    where you'll see the statue of the man reading at the roundabout.
                     Turn left there, and continue for 129 meters to reach the Administration building
                    """);

        } else if (current.equals("New_Administration_Block_(new site)") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    New Administration Block (new site) walk or drive 129 meters from the Administration building to the CANS/Sam Jonah traffic light turn left
                    Then, walk or drive 845 meters to the Vice Chancellor's Lodge. the landmark is the  roundabout with the statue of the man reading.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("University_JHS")) {
            textArea.setText("""
                    From Vice Chancellor's Lodge, walk 357 meters to the statue,
                     turn left, and then continue for 1110 meters to University JHS using Apewosika Road,
                      with the landmark being a roundabout.
                    """);

        } else if (current.equals("University_JHS") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                     From University JHS, walk or drive 1110 meters using Apewosika Road, passing the roundabout landmark.
                     Then, turn right at the statue after covering the 357 meters, and you'll arrive at Vice Chancellor's Lodge.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("Prudential_Bank")) {
            textArea.setText("""
                    From Vice Chancellor's Lodge, walk 357 meters to the statue, turn right, 
                    then travel 241 meters to the SSNIT Hotel/Sasakawa/Zenit Bank Junction and turn right again. 
                    Proceed for 169 meters to reach Prudential Bank.
                    """);

        } else if (current.equals("Prudential_Bank") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    From Prudential Bank, walk or drive 169 meters to the SSNIT Hotel/Sasakawa/Zenit Bank Junction, and then turn left. 
                    Continue for 241 meters and turn left again at the statue. Finally, cover the 357 meters back to Vice Chancellor's Lodge.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("SSNIT_Hotel")) {
            textArea.setText("""
                    From Vice Chancellor's Lodge, walk 357 meters to the statue and turn right. 
                    Proceed for 241 meters to the SSNIT Hotel/Sasakawa/Zenit Bank Junction.
                     Then, continue straight for 384 meters to arrive at SSNIT Hotel.
                    """);

        } else if (current.equals("SSNIT_Hotel") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    Begin at SSNIT Hotel and walk or drive 384 meters straight to the SSNIT Hotel/Sasakawa/Zenit Bank Junction
                     using the road leading to casford field.
                    From there, walk or drive back 241 meters to the statue,
                     and then turn left. Finally, cover the 357 meters back to Vice Chancellor's Lodge.
                    """);

        } else if (current.equals("Vice_Chancellor's_Lodge") && next_a.equals("Valco_Trust_Hall")) {
            textArea.setText("""
                    From Vice Chancellor's Lodge, walk or drive 357 meters to the roundabout 
                    with the statue of the man reading using the main gate road, turn right.
                    Walk or drive 241 meters to the SSNIT Hotel/Sasakawa/Zenit Bank Junction, 
                    then turn left and proceed for 721 meters to reach Valco Trust Hall.
                    """);

        } else if (current.equals("Valco_Trust_Hall") && next_a.equals("Vice_Chancellor's_Lodge")) {
            textArea.setText("""
                    From Valco Trust Hall and walk or drive back 721 meters using the road leading to Zenit Bank. 
                    Then, from the SSNIT Hotel/Sasakawa/Zenit Bank Junction, 
                    turn right and continue for 241 meters. Turn left at the statue after covering 357 meters,
                     and you'll arrive back at Vice Chancellor's Lodge.
                    """);

        } else if (current.equals("New_Administration_Block_(new site)") && next_a.equals("University_JHS")) {
            textArea.setText("""
                    From the New Administration Block (new site), turn right onto the road leading to the traffic light. 
                    Then, turn right at the traffic light, proceed for 492 meters to the roundabout with the statue of the man reading  
                    using the road leading to East Gate, and finally, 
                    turn right at the roundabout and proceed with the statue of the man reading 
                    to reach University JHS using Apewosika road with a landmark of another roundabout.
                    """);

        } else if (current.equals("University_JHS") && next_a.equals("New_Administration_Block_(new site)")) {
            textArea.setText("""
                    From University JHS, use the Apewosika road and proceed 1110 meters until
                     you reach the roundabout with the statue of the man reading landmark. 
                    At the roundabout, turn left onto the road leading from East Gate and continue for 492 meters.
                     Then, at the traffic light, turn left and follow the road back to the Administration block.
                    """);

        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("University_JHS")) {
            textArea.setText("""
                     From Sam Jonah and turn left, then proceed for 47 meters to the traffic light using the road leading to the traffic light.
                     At the traffic light, turn left, and from there, continue for 492 meters to the 
                     roundabout with the statue of the man reading using the road leading to East Gate.
                     At the roundabout, turn right and proceed to University JHS using the Apewosika road, with a landmark being another roundabout.
                    """);

        } else if (current.equals("University_JHS") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    From University JHS, travel along the Apewosika road until you reach the roundabout landmark. 
                    At the roundabout, turn left onto the road leading from East Gate and proceed for 492 meters. 
                    Then, at the traffic light, turn right and continue for 47 meters you'll arrive at Sam Jonah
                    """);


        } else if (current.equals("University_JHS") && next_a.equals("University_Primary_and_KG")) {
            textArea.setText("""
                    Proceed from University JHS for 411 meters using Ekem Ferguson Road. The landmark to watch for is the roundabout. 
                    Simply follow the road without making any turns, and you'll reach your University Primary and KG.
                    """);

        } else if (current.equals("University_Primary_and_KG") && next_a.equals("University_JHS")) {
            textArea.setText("""
                    From University Primary and KG and follow Ekem Ferguson Road without making any turns. 
                    Continue for 411 meters, watching for the roundabout landmark.
                     From there, walk or drive back the same route to University JHS.
                    """);

        } else if (current.equals("University_JHS") && next_a.equals("University_Hospital")) {
            textArea.setText("""
                    From University JHS, go 183 meters using Apewosika and Ekem Ferguson Road to the roundabout, 
                    then turn right. Proceed for 125 meters to reach the University Hospital.
                    """);

        } else if (current.equals("University_JHS") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    From University JHS, travel 183 meters using Apewosika and Ekem Ferguson Road to the roundabout.
                     Turn right at the roundabout, and then continue for 217 meters to reach the Old Administration block (old site).
                    """);

        } else if (current.equals("University_Hospital") && next_a.equals("University_JHS")) {
            textArea.setText("""
                    From University Hospital and walk back 125 meters. At the roundabout, 
                    turn left and proceed for 183 meters using Apewosika and Ekem Ferguson Road, 
                    following the same route to reach University JHS.
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("University_JHS")) {
            textArea.setText("""
                     From Old Administration block (old site) turn right walk or drive 217 meters. At the roundabout,
                     turn left and proceed for 183 meters using Apewosika and Ekem Ferguson Road,
                      following the same route to reach University JHS.
                    """);

        } else if (current.equals("University_Hospital") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    From the University Hospital, turn left and proceed for 92 meters 
                    along Pioneer Road to reach the Old Administration block (old site).
                                      
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("University_Hospital")) {
            textArea.setText("""
                    From Old Administration block (old site) turn right and walk or drive for 
                    92 meters along Pioneer Road. Then you'll arrive at the University Hospital
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("West_Gate")) {
            textArea.setText("""
                    From Old Administration block (old site) and walk or drive 393 meters using the road leading to the West Gate.
                     This will take you to West Gate.
                    """);

        } else if (current.equals("West_Gate") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    Start at West Gate and proceed for 393 meters using 
                    the road leading from the West Gate, and you'll reach your destination,Old Administration block (old site).
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("Taxi_rank_(old site)")) {
            textArea.setText("""
                    From Old Administration block (old site), walk or drive 141 meters to the junction of the Sports Complex and Taxi Rank,
                     then turn right. Proceed for 123 meters to reach the Taxi Rank.
                    """);

        } else if (current.equals("Taxi_rank_(old site)") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    From Taxi Rank turn left, walk or drive 123 meters to the road leading to West Gate.
                     At the junction of the Sports Complex and Taxi Rank, turn left and proceed for 141 meters.
                      This will lead you to the Old Administration block (old site).
                    """);

        } else if (current.equals("Taxi_rank_(old site)") && next_a.equals("West_Gate")) {
            textArea.setText("""
                    From the Taxi Rank, turn right and travel 123 meters to the road leading to West Gate. 
                    Then, at the junction of the Sports Complex and Taxi Rank,
                     turn right and continue for 258 meters to reach West Gate.
                    """);

        } else if (current.equals("West_Gate") && next_a.equals("Taxi_rank_(old site)")) {
            textArea.setText("""
                    Start at West Gate and walk back 258 meters to reach the junction of the Sports Complex and Taxi Rank.
                     At the junction, turn left and proceed for 123 meters to the road leading to the Taxi Rank. 
                    Then, stop at the Taxi Rank.
                    """);

        } else if (current.equals("West_Gate") && next_a.equals("University_Hospital")) {
            textArea.setText("""
                    Start at West Gate and walk or drive 393 meters using the road leading from the West Gate.
                    This will take you to the Old Administration block (old site). 
                    From there, proceed for 92 meters along Pioneer Road to reach the University Hospital.
                    """);

        } else if (current.equals("University_Hospital") && next_a.equals("West_Gate")) {
            textArea.setText("""
                    From the University Hospital, turn left and proceed for 92 meters 
                    along Pioneer Road to reach the Old Administration block (old site).
                    From Old Administration block (old site) and walk or drive 393 meters using the road leading to the West Gate.
                    This will take you to West Gate.
                    """);

        } else if (current.equals("Taxi_rank_(old site)") && next_a.equals("University_Hospital")) {
            textArea.setText("""
                     From Taxi Rank turn left, walk or drive 123 meters to the road leading to West Gate.
                     At the junction of the Sports Complex and Taxi Rank, turn left and proceed for 141 meters.
                      This will lead you to the Old Administration block (old site).
                      From Old Administration block (old site) turn right and walk or drive for 
                    92 meters along Pioneer Road. Then you'll arrive at the University Hospital
                    """);

        } else if (current.equals("University_Hospital") && next_a.equals("Taxi_rank_(old site)")) {
            textArea.setText("""
                     Start at the University Hospital and proceed for 92 meters along Pioneer Road from the Old Administration block (old site). 
                     Then, turn left and walk or drive for 141 meters, reaching the junction of the Sports Complex and Taxi Rank. 
                     At this junction, turn right and walk or drive 123 meters and you'll be Taxi Rank.
                    """);

        } else if (current.equals("Taxi_rank_(old site)") && next_a.equals("Oguaa_Hall")) {
            textArea.setText("""
                    From the Taxi Rank, turn left and walk or drive for 44 meters. Then,
                    turn right and proceed for 91 meters to reach Oguaa Hall
                    """);

        } else if (current.equals("Oguaa_Hall") && next_a.equals("Taxi_rank_(old site)")) {
            textArea.setText("""
                    From Oguaa Hall and walk back for 91 meters. Then, 
                    turn left and walk for 44 meters before turning right. 
                    This will take you to the Taxi Rank.
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("Oguaa_Hall")) {
            textArea.setText("""
                    From Old Administration block (old site) turn left walk or drive 178 meters to Oguaa Hall.
                    """);

        } else if (current.equals("Oguaa_Hall") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    From Oguaa Hall, turn right and proceed for 178 meters to Old Administration block (old site)
                    using the road leading to the West Gate.
                    """);

        } else if (current.equals("Old_Administration_block_(old site)") && next_a.equals("Adeyhe_hall")) {
            textArea.setText("""
                    From Old Administration block (old site) turn left walk or drive 219 meters to Adeyhe Hall.
                    """);

        } else if (current.equals("Adeyhe_hall") && next_a.equals("Old_Administration_block_(old site)")) {
            textArea.setText("""
                    From Adeyhe Hall, turn right and proceed for 219 meters to Old Administration block (old site)
                    using the road leading to the West Gate.
                    """);

        } else if (current.equals("ATL)") && next_a.equals("Adeyhe_hall")) {
            textArea.setText("""
                    From ATL Hall turn right and proceed 42 meters Adeyhe Hall
                    """);

        } else if (current.equals("Adeyhe_hall") && next_a.equals("ATL")) {
            textArea.setText("""
                    From Adeyhe Hall turn left and proceed 42 meters ATL
                    """);

        } else if (current.equals("Oguaa_Hall)") && next_a.equals("Adeyhe_hall")) {
            textArea.setText("""
                    From Oguaa Hall turn left and proceed 28 meters to Adeyhe Hall
                    """);

        } else if (current.equals("Adeyhe_hall") && next_a.equals("Oguaa_Hall")) {
            textArea.setText("""
                    From Adeyhe hall turn right and proceed 28 meters to Oguaa Hall
                    """);

        } else if (current.equals("Casford_Hall") && next_a.equals("Prudential_Bank")) {
            textArea.setText("""
                                From Casford Hall turn right and proceed 187 meters to Prudential Bank
                    """);

        } else if (current.equals("Prudential_Bank") && next_a.equals("Casford_Hall")) {
            textArea.setText("""
                    From Prudential Bank turn left and proceed 187 meters to Casford Hall
                    """);

        } else if (current.equals("Prudential_Bank") && next_a.equals("SSNIT_Hotel")) {
            textArea.setText("""
                    From Prudential Bank turn right and proceed 164 meters using the Cafeteria Road 
                    to the SSNIT Hotel/Sasakawa/Zenit Bank Junction.
                    Then turn right , continue straight for 384 meters to arrive at SSNIT Hotel.
                    """);

        } else if (current.equals("SSNIT_Hotel") && next_a.equals("Prudential_Bank")) {
            textArea.setText("""
                    From SSNIT Hotel, turn left and walk or drive  straight for 384 meters to the SSNIT Hotel/Sasakawa/Zenit Bank Junction. At the junction, 
                    turn left and proceed for 164 meters using the Cafeteria Road. This will lead you to Prudential Bank
                    """);

        } else if (current.equals("SSNIT_Hotel") && next_a.equals("UPSHA")) {
            textArea.setText("""
                    From SSNIT, turn right and walk or drive for 247 meters. Then, turn left and proceed for 251 meters to reach UPSHS.
                    """);

        } else if (current.equals("UPSHS") && next_a.equals("SSNIT_Hotel")) {
            textArea.setText("""
                      From UPSHS turn right and walk or drive for 251 meters. Then, turn right and walk for 247 meters to reach SSNIT.
                    """);

        } else if (current.equals("UPSHS") && next_a.equals("Farm_Land")) {
            textArea.setText("""
                    From UPSHS, turn right and proceed for 622 meters along Kobina Sekyi Road to reach the UPSHS and Farm Land junction. 
                    Turn right at the junction and continue for 429 meters to arrive at Farm Land
                    """);

        } else if (current.equals("Farm_Land") && next_a.equals("UPSHS")) {
            textArea.setText("""
                    From Farm Land and walk or drive for 429 meters to the UPSHS and Farm Land junction. At the junction, 
                    turn left and proceed for 622 meters using Kobina Sekyi Road to reach UPSHS.
                    """);

        } else if (current.equals("Farm_Land") && next_a.equals("Superannuation_Hall")) {
            textArea.setText("""
                    From Farm Land turn left and walk or drive for 886 meters to the traffic light. 
                    At the traffic light, turn right and proceed for 81 meters to Superannuation Hall.
                    """);

        } else if (current.equals("Superannuation_Hall") && next_a.equals("Farm_Land")) {
            textArea.setText("""
                    From Superannuation Hall, turn right and walk for 81 meters to reach the traffic light. 
                    Turn left at the traffic light and proceed for 886 meters to arrive at Farm Land, 
                    where you'll notice a security post as a landmark.
                    """);

        } else if (current.equals("Superannuation_Hall") && next_a.equals("SRC_Hall")) {
            textArea.setText("""
                    From Superannuation Hall turn left and proceed for 183 meters, and you'll arrive at SRC Hall.
                    """);

        } else if (current.equals("SRC_Hall") && next_a.equals("Superannuation_Hall")) {
            textArea.setText("""
                    From SRC Hall turn right and walk or drive walk for 183 meters to Superannuation Hall.
                    """);

        } else if (current.equals("SRC_Hall") && next_a.equals("PSI_Hall")) {
            textArea.setText("""
                    From SRC Hall turn left and proceed 136 meters to PSI Hall
                    """);

        } else if (current.equals("PSI_Hall") && next_a.equals("SRC_Hall")) {
            textArea.setText("""
                    From PSI Hall turn right and proceed 136 meters to SRC Hall  
                    """);

        } else if (current.equals("PSI_Hall") && next_a.equals("University_Hall")) {
            textArea.setText("""
                    From PSI Hall turn left and proceed 161 meters to University Hall
                    """);

        } else if (current.equals("University_Hall") && next_a.equals("PSI_Hall")) {
            textArea.setText("""
                    From University Hall turn right and proceed 161 meters to PSI Hall
                    """);

        } else if (current.equals("UPSHS") && next_a.equals("CALC")) {
            textArea.setText("""
                    From UPSHS, turn right and proceed for 622 meters along Kobina Sekyi Road 
                    to reach the UPSHS and Farm Land junction. 
                    Turn left at the junction and continue 763 meters to CALC/Sam Jonah Junction 
                    with security post as a landmark, right and proceed 84 meters to CALC.
                    """);

        } else if (current.equals("CALC") && next_a.equals("UPSHS")) {
            textArea.setText("""
                    From CALC, turn left and walk or drive 84 meters to the CALC/Sam Jonah Junction. 
                    Turn left at the junction and proceed for 763 meters to reach the UPSHS and Farm Land junction.
                    With security post as a landmark. 
                    At this junction, turn right and continue for 622 meters along Kobina Sekyi Road to reach UPSHS.
                    """);

        } else if (current.equals("Prudential_Bank") && next_a.equals("Valco_Trust_Hall")) {
            textArea.setText("""
                    From Prudential Bank, turn right and walk or drive 165 meters to the SSNIT Hotel/Valco Trust Hall junction. 
                    Continue straight without turning for 169 meters to reach Valco Trust Hall.
                    """);

        } else if (current.equals("Valco_Trust_Hall") && next_a.equals("Prudential_Bank")) {
            textArea.setText("""
                    From Valco Trust Hall turn left and walk or drive 169 meters to the SSNIT Hotel/Valco Trust Hall junction. 
                    Then, continue 165 meters to reach Prudential Bank.
                    """);

        } else if (current.equals("Valco_Trust_Hall") && next_a.equals("Sasakawa_Hotel")) {
            textArea.setText("""
                    From Valco Trust Hall proceed 48 meters to Sasakawa Hotel
                    """);

        } else if (current.equals("Sasakawa Hotel") && next_a.equals("Valco_Trust_Hall")) {
            textArea.setText("""
                    From Sasakawa Hotel turn right and proceed 48 meters to Valco Trust Hall                                                  
                    """);
        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("Sasakawa_Hotel")) {
            textArea.setText("""
                    From Sam Jonah Library, start by walking back 221 meters using the pedestrian road. 
                    Then, turn right and proceed for 90 meters before turning right again to reach Sasakawa Hotel.
                     """);

        } else if (current.equals("Sasakawa_Hotel") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    From Sasakawa Hotel turn left and proceed 90 meters and turn left
                    using the perdistrian road proceed 221 meters to Sam Jonah Library
                    """);
        } else if (current.equals("CALC") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    From CALC, turn right at the Sasakawa Hotel/CALC junction and proceed for 204 meters to the Shuttle station. 
                    At the Shuttle station, turn left and walk or drive 68 meters to reach Sam Jonah.
                    """);

        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("CALC")) {
            textArea.setText("""
                    From Sam Jonah walk or drive 68 meters to the Shuttle station turn right
                    and proceed 204 meters to Sasakawa Hotel/ CALC junction and turn left to reach CALC
                    """);

        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("New_Administration_Block_(new site)")) {
            textArea.setText("""
                    From Sam Jonah and turn left, then proceed for 47 meters to the traffic light using the road leading to the traffic light.
                    From the traffic light proceed 129 straight to New Administration Block (new site)
                    """);
        } else if (current.equals("New_Administration_Block_(new site)") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    From New Administration Block (new site), turn right walk or drive 129 meters straight to the traffic light. 
                    proceed for 47 meters using the road leading from the traffic light. Then, turn right to reach Sam Jonah.
                    """);

        } else if (current.equals("Sam_Jonah_Library") && next_a.equals("Parliament_House")) {
            textArea.setText("""
                    From Sam Jonah proceed 144 meters to Parliament House by passing throught the shuttle station 
                    """);

        } else if (current.equals("Parliament_House") && next_a.equals("Sam_Jonah_Library")) {
            textArea.setText("""
                    From Parliament House, start by walking back 144 meters, passing through the shuttle station, to reach Sam Jonah.
                    """);

        } else if (current.equals("Parliament_House") && next_a.equals("CANS_Block")) {
            textArea.setText("""
                    From Parliament House proceed  47 meters to CANS Block
                    """);

        } else if (current.equals("CANS_Block") && next_a.equals("Parliament_House")) {
            textArea.setText("""
                    From CANS Block proceed  47 meters to Parliament House
                    """);

        } else if (current.equals("CANS_Block") && next_a.equals("Science_Market")) {
            textArea.setText("""
                    From CANS Block turn right and proceed 95 meters to Science Market
                    """);

        } else if (current.equals("Science_Market") && next_a.equals("CANNS_Block")) {
            textArea.setText("""
                    From Science Market turn right and proceed 95 meters to CANS Block
                    """);

        } else if (current.equals("Science_Market") && next_a.equals("New_Administration_Block_(new site)")) {
            textArea.setText("""
                    From Science Market turn left and procees 118 meters to New Administration Block (new site)
                    """);

        } else if (current.equals("New_Aministration_Block_(new site)") && next_a.equals("Science_Market)")) {
            textArea.setText("""
                    From New Administration Block (new site) turn left and proceed 118 meters to Science Market
                    """);

        } else if (current.equals("CANS_Block") && next_a.equals("LT")) {
            textArea.setText("""
                    From CANS Blcok turn left and proceed 62 meters to LT
                    """);

        } else if (current.equals("LT") && next_a.equals("CANS_Block")) {
            textArea.setText("""
                    From LT turn right and proceed 62 meters to CANS Block 
                    """);

        } else if (current.equals("LT") && next_a.equals("G-Block")) {
            textArea.setText("""
                    From LT proceed 108 meters to G-Block
                    """);

        } else if (current.equals("G-Block") && next_a.equals("LT")) {
            textArea.setText("""
                    From G-Block proceed 108 meters to LT 
                    """);

        } else if (current.equals("Parliament_House") && next_a.equals("LT")) {
            textArea.setText("""
                    From LT proceed 96 meters to Parliament House
                                               """);

        } else if (current.equals("LT") && next_a.equals("Parliament_House")) {
            textArea.setText("""
                    From Parliament House turn right and proceed 96 meters to LT
                    """);

        } else if (current.equals("Parliament_House") && next_a.equals("G-Block")) {
            textArea.setText("""
                    From Parliament House turn right and proceed 96 meters to G-Block
                    """);

        } else if (current.equals("G-Block") && next_a.equals("Parliament_House")) {
            textArea.setText("""
                    From G-Block turn right and proceed 96 meters to Parliament House
                    """);

        } else if (current.equals("G-Block") && next_a.equals("CALC")) {
            textArea.setText("""
                    From G-block proceed 123 meters straight to CALC
                    """);

        } else if (current.equals("CALC") && next_a.equals("G-Block")) {
            textArea.setText("""
                    From CALC turn left and proceed 123 meters to G-Block
                    """);

        } else if (current.equals("G-Block") && next_a.equals("MIS")) {
            textArea.setText("""
                    From G-Block turn left and proceed 111 meters to MIS
                    """);

        } else if (current.equals("MIS") && next_a.equals("G-Block")) {
            textArea.setText("""
                    From MIS turn left and proceed 111 meters to G-Block
                    """);

        } else if (current.equals("MIS") && next_a.equals("Institution_Of_Education")) {
            textArea.setText("""
                    They are located at the same place
                    """);

        } else if (current.equals("Institution_Of_Education") && next_a.equals("MIS")) {

            textArea.setText("""
                    They are located at the same place
                    """);

        } else if (current.equals("Institution_Of_Education") && next_a.equals("CALC")) {
            textArea.setText("""
                    From Institution Of Education turn left and proceed 64 meters to CALC
                    """);

        } else if (current.equals("CALC") && next_a.equals("Institution_Of_Education")) {
            textArea.setText("""
                    From CALC turn left and proceed 64 meters to Institution Of Education
                    """);

        } else if (current.equals("Institution_Of_Education") && next_a.equals("NEC")) {
            textArea.setText("""
                    From Institution Of Education turn right and proceed 119 meters to NEC
                    """);

        } else if (current.equals("NEC") && next_a.equals("Institution_Of_Education")) {
            textArea.setText("""
                    From NEC turn right and proceed 119 meter to Institution Of Education
                    """);

        } else if (current.equals("LT") && next_a.equals("MIS")) {
            textArea.setText("""
                    From LT proceed 207 meters to MIS by passing through the Congregation Grounds
                    """);

        } else if (current.equals("MIS") && next_a.equals("LT")) {
            textArea.setText("""
                    From MIS turn left and proceed 207 meter to LT by passing through the Congregation Grounds
                    """);

        } else if (current.equals("LT") && next_a.equals("Amissah_Arthur_Language_Center")) {
            textArea.setText("""
                    From LT proceed 238 meters to Amissah Arthur Language Center by passing through the Congregation Grounds 
                    """);

        } else if (current.equals("Amissah_Arthur_Language_Center") && next_a.equals("LT")) {
            textArea.setText("""
                    From Amissah Arthur Language Center turn left and proceed 238 meters to LT by passing through the Congregation Grounds
                    """);

        } else if (current.equals("NEC") && next_a.equals("CODE")) {
            textArea.setText("""
                    From NEC turn left and proceed 24 meters and turn left,
                    proceed 139 meters to CODE
                    """);

        } else if (current.equals("CODE") && next_a.equals("NEC")) {
            textArea.setText("""
                    From CODE turn left and proceed 139 meters and turn right and proceed 24 meters to NEC
                    """);

        } else if (current.equals("CODE") && next_a.equals("NLT")) {
            textArea.setText("""
                    From CODE turn right and proceed 94 meters to NLT
                    """);

        } else if (current.equals("NLT") && next_a.equals("CODE")) {
            textArea.setText("""
                    From NLT turn left and proceed 94 meters to CODE
                    """);

        } else if (current.equals("Amissah_Arthur_Language_Center") && next_a.equals("MIS")) {
            textArea.setText("""
                    From Amissah Arthur Language Center proceed 122 meters forward to MIS
                    """);

        } else if (current.equals("MIS") && next_a.equals("Amissah_Arthur_Language_Center")) {
            textArea.setText("""
                    From MIS turn back and procedd 122 meters to Amissah Arthur Language Center
                    """);

        } else if (current.equals("Amissah_Arthur_Language_Center") && next_a.equals("School_Of_Business")) {
            textArea.setText("""
                      From Amissah Arthur Language Center turn left and  proceed 221 meters to School Of Business
                      you will SMS on the way.
                                                
                    """);

        } else if (current.equals("Amissah_Arthur_Language_Center") && next_a.equals("Sandwich_Lecture_Theatre")) {
            textArea.setText("""
                    From Amissah Arthur Language Center turn left twice and proceed 382 meters to Sandwich Lecture Theatre
                    """);

        } else if (current.equals("School_Of_Business") && next_a.equals("Amissah_Arthur_Language_Center")) {
            textArea.setText("""
                    From Schoool Of Business turn left and proceed 221 meters to Amissah Arthur Language Center
                    you will SMS on the way.
                    """);

        } else if (current.equals("Sandwich_Lecture_Theatre") && next_a.equals("Amissah_Arthur_Language_Center")) {
            textArea.setText("""
                    From Sandwich Lecture Theatre turn right and proceed 382 meters to Amissah Arthur Language Center
                    """);

        } else if (current.equals("School_Of_Business") && next_a.equals("CODE")) {
            textArea.setText("""
                    From School Of Business turn left and proceed 77 meters to CODE
                    """);

        } else if (current.equals("School_Of_Business") && next_a.equals("PHD_lecture_Hall")) {
            textArea.setText("""
                    From School of Business to PHD Lecture Hall turn left twice and proceed to 142 meters to the destination
                    """);
        } else if (current.equals("CODE") && next_a.equals("School_Of_Business")) {
            textArea.setText("""
                    From CODE turn right and proceed 77 meters to School Of Business
                    """);

        } else if (current.equals("PHD_lecture_Hall") && next_a.equals("School_Of_Business")) {
            textArea.setText("""
                    From PHD lecture Hall turn right and proceed 142 meters to School Of Business
                    """);

        } else if (current.equals("PHD_lecture_Hall") && next_a.equals("NLT")) {
            textArea.setText("""
                    From PHD lecture Hall turn opposite and proceed 29 meters to NTL
                    """);

        } else if (current.equals("NLT") && next_a.equals("PHD_lecture_Hall")) {
            textArea.setText("""
                    From NTL turn opposite and proceed 29 meters to PHD lecture Hall
                    """);

        } else if (current.equals("PHD_lecture_Hall") && next_a.equals("Sandwich_Lecture_Theatre")) {
            textArea.setText("""
                    From PHD lecture hall turn left and proceed 214 using the bush way to Sandwich lecture Theatre
                    """);

        } else if (current.equals("Sandwich_Lecture_Theatre") && next_a.equals("PHD_lecture_Hall")) {
            textArea.setText("""
                    From Sandwich lecture theatre turn left and proceed  214 meters to PHD lecture hall using the bush way.
                    """);

        } else if (current.equals("East_Gate") && next_a.equals("Valco_Hall")) {
            textArea.setText("dddd");
        } else if (currentLocation.equals(next_a)) {
            textArea.setText("""
                    You are at the current destination, thank you.
                    """);
        } else {
            textArea.setText("""
                    No direction is available yet, thank you.
                    """);
        }
    }











    public String getSourceLocation(){
        return  sLocation;
    }

    public String getDestinationLocation(){
        return dLcoation;
    }

    public void displayGui(){

    }


}
