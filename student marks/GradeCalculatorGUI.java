import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculatorGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Grade Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1, 10, 10));

        JLabel label = new JLabel("Enter marks (comma separated):");
        JTextField marksField = new JTextField();

        JButton calculateBtn = new JButton("Calculate");

        JLabel totalLabel = new JLabel("Total Marks: ");
        JLabel avgLabel = new JLabel("Average: ");
        JLabel gradeLabel = new JLabel("Grade: ");

        frame.add(label);
        frame.add(marksField);
        frame.add(calculateBtn);
        frame.add(totalLabel);
        frame.add(avgLabel);
        frame.add(gradeLabel);

        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String input = marksField.getText();
                    String[] parts = input.split(",");

                    int total = 0;
                    for (String p : parts) {
                        int mark = Integer.parseInt(p.trim());
                        if (mark < 0 || mark > 100) {
                            JOptionPane.showMessageDialog(frame,
                                    "Marks must be between 0 and 100",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        total += mark;
                    }

                    double avg = (double) total / parts.length;

                    // Grade logic
                    String grade;
                    if (avg >= 90) grade = "A";
                    else if (avg >= 80) grade = "B";
                    else if (avg >= 70) grade = "C";
                    else if (avg >= 60) grade = "D";
                    else grade = "F";

                    totalLabel.setText("Total Marks: " + total);
                    avgLabel.setText("Average: " + avg);
                    gradeLabel.setText("Grade: " + grade);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Invalid input! Enter numbers separated by commas.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
