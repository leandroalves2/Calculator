import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField textField;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button8;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button12;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button16;
    private JButton a00Button;
    private JButton a0Button;
    private JButton Pontbutton;
    private JButton button7;

    double x, y, result;
    String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a00Button.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().contains(".")) {
                    double decimal = Double.parseDouble(textField.getText());
                    decimal = decimal*-1;
                    textField.setText(String.valueOf(decimal));
                } else {
                    long longInteger = Long.parseLong(textField.getText());
                    longInteger = longInteger*-1;
                    textField.setText(String.valueOf(longInteger));
                }
            }
        });
        Pontbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + Pontbutton.getText());
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textField.getText());
                op = "+";
                textField.setText("");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textField.getText());
                op = "-";
                textField.setText("");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textField.getText());
                op = "*";
                textField.setText("");
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textField.getText());
                op = "/";
                textField.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (textField.getText().length() > 0) {
                    StringBuilder sb = new StringBuilder(textField.getText());
                    sb.deleteCharAt(textField.getText().length() - 1);
                    backspace = String.valueOf(sb);
                    textField.setText(backspace);
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = Double.parseDouble(textField.getText());
                if (op == "+") {
                    result = x+y;
                    textField.setText(String.valueOf(result));
                } else if (op == "-") {
                    result = x-y;
                    textField.setText(String.valueOf(result));
                } else if (op == "*") {
                    result = x*y;
                    textField.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = x/y;
                    textField.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
