import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ArithmeticGame extends JFrame {
    private JLabel questionLabel;
    private JTextField answerField;
    private JLabel timerLabel;
    private JButton submitButton;
    private Timer timer;
    private int timeLeft = 30; // 30 seconds for each question
    private int correctAnswer;

    public ArithmeticGame() {
        // Set up the frame
        setTitle("Arithmetic Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Question Label
        questionLabel = new JLabel("Question will appear here");
        questionLabel.setBounds(50, 30, 300, 30);
        add(questionLabel);

        // Answer Field
        answerField = new JTextField();
        answerField.setBounds(50, 70, 100, 30);
        add(answerField);

        // Timer Label
        timerLabel = new JLabel("Time left: " + timeLeft + "s");
        timerLabel.setBounds(200, 70, 100, 30);
        add(timerLabel);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(50, 110, 100, 30);
        add(submitButton);

        // Action Listener for Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        // Start the game
        generateQuestion();
        startTimer();
    }

    // Method to generate a new arithmetic question
    private void generateQuestion() {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        correctAnswer = num1 + num2; // Here you can change the operation
        questionLabel.setText("What is " + num1 + " + " + num2 + "?");
    }

    // Method to start the timer
    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerLabel.setText("Time left: " + timeLeft + "s");
                if (timeLeft <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time's up! The correct answer was " + correctAnswer);
                    generateQuestion();
                    resetTimer();
                }
            }
        });
        timer.start();
    }

    // Method to reset the timer for the next question
    private void resetTimer() {
        timeLeft = 30;
        timerLabel.setText("Time left: " + timeLeft + "s");
        timer.start();
    }

    // Method to check the user's answer
    private void checkAnswer() {
        try {
            int userAnswer = Integer.parseInt(answerField.getText());
            if (userAnswer == correctAnswer) {
                JOptionPane.showMessageDialog(null, "Correct!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was " + correctAnswer);
            }
            generateQuestion();
            resetTimer();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArithmeticGame game = new ArithmeticGame();
            game.setVisible(true);
        });
    }
}
