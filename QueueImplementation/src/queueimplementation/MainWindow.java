package queueimplementation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;

public class MainWindow {

    private JFrame window;
    private JPanel header;
    private JPanel body;
    private JButton undoButton;
    private JButton redoButton;
    private JButton saveButton;
    private static String newText = " ";

    private Queue<String> undoQueue;
    private Queue<String> redoQueue;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("Text Editor");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(900, 700);
        window.setLocationRelativeTo(null);

        header = new JPanel();
        header.setBackground(Color.gray);

        JPanel right = new JPanel();
        JPanel left = new JPanel();
        right.setBackground(Color.gray);
        left.setBackground(Color.gray);

        right.add(new JLabel("Undo and redo Queue Implementation"));
        right.setLayout(new FlowLayout(FlowLayout.CENTER));

        saveButton = new JButton("Save");
        undoButton = new JButton("Undo");
        redoButton = new JButton("Redo");

        saveButton.setFocusable(false);
        undoButton.setFocusable(false);
        redoButton.setFocusable(false);

        left.add(saveButton);
        left.add(undoButton);
        left.add(redoButton);

        header.setLayout(new FlowLayout(FlowLayout.CENTER));
        header.add(right);
        header.add(left);

        JTextArea textfield = new JTextArea();
        textfield.setMargin(new Insets(20, 20, 20, 20));
        textfield.setFont(new Font("Times New Roman", Font.PLAIN, 17));

        undoQueue = new LinkedList<>();
        redoQueue = new LinkedList<>();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] inputValue = textfield.getText().split(" ");
                undoQueue.offer(textfield.getText());

                newText = "";

                for (int i = 0; i < inputValue.length; i++) {
                    newText += inputValue[i] + " ";
                }

                JOptionPane.showMessageDialog(window, "Text saved successfully!");
            }
        });

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!undoQueue.isEmpty()) {
                    redoQueue.offer(textfield.getText());
                    textfield.setText(undoQueue.poll());
                } else {
                    JOptionPane.showMessageDialog(window, "Nothing to undo.");
                }
            }
        });

        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!redoQueue.isEmpty()) {
                    undoQueue.offer(textfield.getText());
                    textfield.setText(redoQueue.poll());
                } else {
                    JOptionPane.showMessageDialog(window, "Nothing to redo.");
                }
            }
        });

        window.add(header, BorderLayout.NORTH);
        window.add(textfield, BorderLayout.CENTER);
    }

    public void show() {
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainwindow = new MainWindow();
                mainwindow.show();
            }
        });
    }
}
