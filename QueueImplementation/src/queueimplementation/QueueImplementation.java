package queueimplementation;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
public class QueueImplementation {
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                 for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            try {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QueueImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(QueueImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(QueueImplementation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(QueueImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
                MainWindow mainwindow = new MainWindow();
                mainwindow.show();
            }
        
        });
    }
    
}
