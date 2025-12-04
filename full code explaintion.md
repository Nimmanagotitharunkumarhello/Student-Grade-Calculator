Student Grade Calculator (Java Swing)

This is a small Java Swing application that lets you calculate a student’s total marks, average, and grade using a simple GUI. You just enter the marks as comma-separated values, hit the Calculate button, and the program shows the results instantly.


---

How it works

You type marks like: 80, 90, 75, 60

The program splits them one by one

It checks if each mark is between 0 and 100

Then it adds them all, finds the average, and assigns a grade (A–F)

The total, average, and grade are shown on the window

If you type anything invalid, it shows an error message



---

What the program uses

Java

Swing components (JFrame, JTextField, JButton, JLabel, JOptionPane)



---

Code explanation (simple and human-readable)

A JFrame is created as the main window

A text field is used for entering the marks

A button triggers the calculation

Labels are used to show the results

When the button is clicked:

The text is read and split by commas

Each value is converted to an integer

Marks outside 0–100 are rejected

Total and average are calculated

Grade is decided using basic conditions

The labels are updated with the results



If something goes wrong (letters instead of numbers, empty input, etc.), a popup message appears.


---

How to run it

1. Save the file as GradeCalculatorGUI.java


2. Compile it:

javac GradeCalculatorGUI.java


3. Run it:

java GradeCalculatorGUI



That’s it — the calculator window opens, and you can start using it.
