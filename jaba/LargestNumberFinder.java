import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LargestNumberFinder extends JFrame {
    // Create textboxes and button
    private JTextField textField1, textField2, textField3;
    private JButton findButton;

    public LargestNumberFinder() {
        // Set up the frame
        setTitle("Find Largest Number");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Enter second number:");
        textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Largest number:");
        textField3 = new JTextField(10);
        textField3.setEditable(false); // Result text field should not be editable
        findButton = new JButton("Find Largest");

        // Add components to the frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(textField3);
        add(findButton);

        // Declare variables as final for JDK 1.3 compatibility
        final JTextField text1 = textField1;
        final JTextField text2 = textField2;
        final JTextField text3 = textField3;
        final JFrame frame = this;

        // Add button click event handler
        findButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get values from text fields and convert to integers
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());

                    // Find the largest number
                    int largest = Math.max(num1, num2);

                    // Display the largest number in the third textbox
                    text3.setText(String.valueOf(largest));
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        // Set size and make the frame visible
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LargestNumberFinder();
    }
}
