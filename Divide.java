import javax.swing.*;
import java.awt.event.*;
public class Divide {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Division Calculator");
        frame.setSize(300, 250);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(30, 30, 100, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 30, 120, 25);
        frame.add(t1);


        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(30, 70, 100, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 70, 120, 25);
        frame.add(t2);

        JButton divide = new JButton("Divide");
        divide.setBounds(90, 110, 100, 30);
        frame.add(divide);

        JTextField result = new JTextField();
        result.setBounds(60, 160, 180, 25);
        result.setEditable(false);
        frame.add(result);

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());

                if (n2 != 0) {
                    double answer = n1 / n2;
                    result.setText(String.valueOf(answer));
                } else {
                    result.setText("Cannot divide by zero");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
