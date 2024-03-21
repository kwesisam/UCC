package stackimplementation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

public class MainWindow {

    private JFrame window;
    private JPanel header;
    private JPanel body;
    private JButton undoButton;
    private JButton redoButton;
    private JButton saveButton;
    private static String newText = " ";

    public MainWindow() {
        //main window
        StackImplementation implement = new StackImplementation();

        window = new JFrame();
        window.setTitle("Undo and redo Stack Implementation");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(900, 700);
        //window.setLayout(new BorderLayout());
        //window.add(new JButton("Center"), BorderLayout.WEST);
        window.setLocationRelativeTo(null);

        //head section
        header = new JPanel();
        header.setBackground(Color.GRAY);
        JPanel right = new JPanel();
        JPanel left = new JPanel();

        right.setBackground(Color.GRAY);
        left.setBackground(Color.GRAY);
        //JLabel appName = new JLabel("App Name");
        JLabel label = new JLabel("Stack Undo & Redo");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        right.add(label);
        
        saveButton = new JButton("Save");
        undoButton = new JButton("Undo");
        redoButton = new JButton("Redo");

        saveButton.setFocusable(false);
        undoButton.setFocusable(false);
        redoButton.setFocusable(false);

        left.add(saveButton);
        left.add(undoButton);
        left.add(redoButton);

        header.setLayout(new FlowLayout(FlowLayout.LEFT));
        header.add(right);
        header.add(left);

        JTextArea textfield = new JTextArea();
        textfield.setMargin(new Insets(20, 20, 20, 20));
        textfield.setFont(new Font("Times New Roman",Font.PLAIN, 17));
        //textfield.setBackground(Color.red);

        //body.setLayout(new FlowLayout(FlowLayout.LEFT));
        //body.add(textfield);
        Stack<String> first = new Stack<>();
        Stack<String> last = new Stack<>();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String[] inputValue = textfield.getText().split(" ");

                first.clear();

                for (int i = 0; i < inputValue.length; i++) {
                    first.push(inputValue[i]);
                }

                System.out.println(first.toString());

            }

        });
        
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] inputValue = textfield.getText().split(" ");

                first.clear();

                for (int i = 0; i < inputValue.length; i++) {
                    first.push(inputValue[i]);
                }

                System.out.println("Auto-save: " + first.toString());
            }
        });

        timer.start();

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!(first.isEmpty())) {
                    last.push(first.pop());

                    newText = "";

                    for (int i = 0; i < first.size(); i++) {
                        newText += first.get(i) + " ";
                    }
                    System.out.println(newText);
                    System.out.println(last.toString());
                    textfield.setText(newText);
                }
            }

        });

        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!last.isEmpty()) {
                    System.out.println(last.toString());
                    String popValue = last.pop();
                    first.push(popValue);
                    newText = newText + " " + popValue;
                    System.out.println(newText);
                    textfield.setText(newText);

                }
            }

        });
        window.add(header, BorderLayout.NORTH);
        window.add(textfield, BorderLayout.CENTER);

    }

    public void show() {
        window.setVisible(true);
    }
}
