// 02/16/25
// Ian Lewis
// CSD 420
// Module 8 Assignment

/*
    This program completes the following brief:

    Create a class titled <your first name here> ThreeThreads.
        In this class, you are to use three threads to output three types of characters to a text area for display.
           • In the first thread, you are to output random letter characters such as a, b, c, d …
           • In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
           • In the third thread, you are to output random characters such as !, @, #, $, %, &, *
        Display a minimum of 10,000 of each of the three sets.
    Write test code that ensures all methods function correctly.
*/


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class IanThreeThreads extends JFrame {
    private JTextArea textArea;
    public static final int COUNT = 10000;

    public IanThreeThreads() {
        setTitle("Three Threads Output");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea.setEditable(false);
        add(new JScrollPane(textArea));

        setVisible(true);

        startThreads();
    }

    private void startThreads() {
        Thread lettersThread = new Thread(new RandomCharacterPrinter("letters", textArea));
        Thread numbersThread = new Thread(new RandomCharacterPrinter("numbers", textArea));
        Thread symbolsThread = new Thread(new RandomCharacterPrinter("symbols", textArea));

        lettersThread.start();
        numbersThread.start();
        symbolsThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IanThreeThreads::new);
    }
}

class RandomCharacterPrinter implements Runnable {
    private String type;
    private JTextArea textArea;
    private static final Random random = new Random();

    public RandomCharacterPrinter(String type, JTextArea textArea) {
        this.type = type;
        this.textArea = textArea;
    }

    @Override
    public void run() {
        String chars = type.equals("letters") ? "abcdefghijklmnopqrstuvwxyz" :
                type.equals("numbers") ? "0123456789" : "!@#$%&*";

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < IanThreeThreads.COUNT; i++) {
            output.append(chars.charAt(random.nextInt(chars.length())));
        }

        SwingUtilities.invokeLater(() -> textArea.append(output.toString() + "\n"));
    }
}

//Cite: oracle.com, module "Class Thread"
//Cite: w3schools.com, module "Java Threads"
//Cite: geeksforgeeks.org, article "Java Threads"
//Cite: geeksforgeeks.org, article "Multithreading in Java"
//Cite: geeksforgeeks.org, article "Java Multithreading Tutorial"
//Cite: oracle.com, article "Lesson: Concurrency"
//Cite: java tutorials.com, module "Java - Multithreading"
//Cite: jenkov.com, module "Java Concurrency and Multithreading Tutorial"
//Cite: oracle.com, article "How to Use Text Areas"
//Cite: oracle.com, article "Class TextArea"
//Cite: geeksforgeeks.org, article "Java Swing | JTextArea"
