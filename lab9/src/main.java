import javax.lang.model.type.TypeKind;
import javax.management.ValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.ExceptionListener;
import java.beans.ExceptionListener;
import java.text.ParseException;
import java.util.Date;

public class main implements ActionListener {
    public static JTextField num1;
    public static JPanel panel;
    public static JLabel number1;
    public static JTextField num2;
    public static JLabel number2;
    public static JLabel exceptionText;
    public static JButton result;
    public static JFrame frame;
    public static JLabel res;
    public static JLabel divisionSign;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(350, 190);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Adding numbers");
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        number1 = new JLabel("First number");
        number1.setBounds(5, 20, 90, 25);
        num1 = new JTextField();
        num1.setBounds(100, 20, 80, 25);

        divisionSign = new JLabel("÷");
        divisionSign.setBounds(38, 40, 10, 25);

        number2 = new JLabel("Second number");
        number2.setBounds(5, 60, 90, 25);
        num2 = new JTextField();
        num2.setBounds(100, 60, 80, 25);

        result = new JButton("result");
        result.setBounds(30, 90, 80, 25);

        res = new JLabel("0");
        res.setBounds(128, 92, 150, 25);

        result.addActionListener(new main());

        exceptionText = new JLabel("");
        exceptionText.setBounds(20, 110, 320, 25);

        //panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        panel.add(divisionSign);
        panel.add(result);
        panel.add(number1);
        panel.add(number2);
        panel.add(num1);
        panel.add(num2);
        panel.add(res);
        panel.add(exceptionText);


        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException, ArithmeticException {
        exceptionText.setText("");
        String numb1 = num1.getText();
        String numb2 = num2.getText();
        System.out.println("-" + numb2 + "-");
        if (numb2.equals("13")){
            try {
                exceptionText.setText("Feeling unlucky today, huh?");
                throw new UnluckyException("Feeling unlucky today, huh?");
            } catch (UnluckyException unluckyException) {
                exceptionText.setText("Feeling unlucky today, huh?");
                unluckyException.printStackTrace();
            }
        }else if(numb1.equals("") || numb2.equals("")){
            exceptionText.setText("All fields are required.");
        }else if(numb2.equals("0")){
            res.setText("Zero division, black hole");
        }else{
            try {

                double sum = Double.parseDouble(numb1) / Double.parseDouble(numb2);
                res.setText(sum + "");

            }catch(ArithmeticException n) {
                exceptionText.setText("Arithmetic error");
            }catch(NumberFormatException nfe){
                exceptionText.setText("Gimme numbers!");
            }
        }
    }


}
