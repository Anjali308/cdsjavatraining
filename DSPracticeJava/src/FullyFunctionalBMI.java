import javax.print.attribute.standard.JobKOctetsSupported;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FullyFunctionalBMI {
    public static void main(String[] args) {
        System.out.println("Jframe is used to build GUI java application");
        JFrame jframe = new JFrame("BMI Calculator");
        JLabel userWeightLabel = new JLabel("Enter your Weight in kgs:");
        userWeightLabel.setBounds(40,40,200,40);
        JTextField userWeightTextField = new JTextField(" ");
        userWeightTextField.setBounds(250,40,60,40);

        JLabel userHeightLabel = new JLabel( "Enter your height in meters");
        userHeightLabel.setBounds(40,100,200,40);
        JTextField userHeightTextField = new JTextField(" ");
        userHeightTextField.setBounds(250,100,60,40); 

        JLabel resultLabel= new JLabel();
        resultLabel.setBounds(200,180,60,40);

        JButton calculatebmi = new JButton("Calculate the BMI");
        calculatebmi.setBounds(170,250,150,50);
        JTextField calculatebmiTextField = new JTextField(" ");
        calculatebmiTextField.setBounds(170,250,150,50);

        calculatebmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float weight = Float.parseFloat(userWeightTextField.getText().toString());
                float height = Float.parseFloat(userHeightTextField.getText().toString());
                float BmiValue = weight/(height*height);
                calculatebmi.setText(String.valueOf(BmiValue));
      //18.5<underweight ,18.5 to 24.9 =normal,24.9 to 29.9 = overweight,30>obese
       if(BmiValue<18.5){
           resultLabel.setText("Underweight");
           resultLabel.setBackground(Color.RED);
           resultLabel.setBackground(Color.RED);
       }
       else if (BmiValue>18.5 && BmiValue<24.9){
        resultLabel.setText("Normal Weight");
        resultLabel.setBackground(Color.GREEN);
        resultLabel.setBackground(Color.GREEN);
       }
       else if (BmiValue>24.9 && BmiValue<29.9){
        resultLabel.setText("OverWeight");
        resultLabel.setBackground(Color.GREEN);
        resultLabel.setBackground(Color.GREEN);
       }
       else{
        resultLabel.setText("Obese");
        resultLabel.setBackground(Color.RED);
        resultLabel.setBackground(Color.RED);
       }
       
            }
        });

        jframe.add(userWeightLabel);
        jframe.add(userWeightTextField);
       
        jframe.add(userHeightLabel);
        jframe.add(userHeightTextField);
        
        jframe.add(calculatebmi);
        //jframe.add(calculatebmiTextField);

        jframe.setLayout(null);
        jframe.setSize(500,500);
        jframe.setVisible(true);
 }}