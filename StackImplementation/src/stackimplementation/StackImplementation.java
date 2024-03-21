package stackimplementation;


import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class StackImplementation {

    private static Scanner input = new Scanner(System.in);
    
    public static Stack<String> enteredText = new Stack<>();
    
    
    public static void main(String[] args) {
        //System.out.println("fdsads");
        //Stack<String> done = new Stack<>();
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            try {
                UIManager.setLookAndFeel(info.getClassName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StackImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(StackImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(StackImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(StackImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
    }
                MainWindow mainwindow = new MainWindow();
                mainwindow.show();
            }
        
        });
        
        
        /*String inputValue = input.nextLine();
        
        
        System.out.println(inputValue);
        String[] ola = inputValue.split(" ");
        
        for(int i = 0; i < ola.length; i++){
            done.push(ola[i]);
        }
        
        
        //String[] finString = new String[10];

        //String[] newOla = input.nextLine().split(" ");
        
        for(int i = 0; i < done.size(); i++){
            System.out.println(done.get(i));
        }
        
        
        /*for(int i = 0; i < ola.length; i++){
            if(ola[i].equals(newOla[i])){
                System.out.println("the same");
                //finString[i] = ola[i];
            }else{
                System.out.println("sadfas");
                System.out.println(newOla[i]);
            }
        }*/
        
        
        /*for(int i = 0; i < 1; i++ ){
            System.out.println(finString[i]);
        }*/
        
        
         
        
        
        
        
        
    }
    
}
