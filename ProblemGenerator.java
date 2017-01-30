import java.util.*;
import javax.swing.JOptionPane;
import java.text.*;
public class ProblemGenerator
{
    DecimalFormat formatter;
    /**
     * Constructor of ProblemGenerator
     */
    public ProblemGenerator()
    {
        formatter = new DecimalFormat("#.00"); // Set a decimal format.
    }
    /**
     * generates and solves a problem that uses the Power Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandPowerProb(int type)
    {
        Random random = new Random();
        int coefficient1 = random.nextInt(4) + 1;
        int power1 = random.nextInt(4) + 2;
        int coefficient2 = random.nextInt(4) + 1;
        int power2 = random.nextInt(4) + 2;
        int initialCond = random.nextInt(6) + 1;
        double ans;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of " + coefficient1 + "x^" + power1 + " + " +
                                                  (coefficient2 + "x^" + power2 + " if x = " + initialCond));
        
        ans = (coefficient1 * power1 * (int)(Math.pow(initialCond, power1 - 1))) + 
              (coefficient2 * power2 * (int)(Math.pow(initialCond, power2 - 1)));
              
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * generates and solves a problem that uses the Product Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandProdProb(int type)
    {
        Random random = new Random();
        int coefficient1 = random.nextInt(4) + 1;
        int power1 = random.nextInt(5) + 2;
        int coefficient2 = random.nextInt(4) + 1;
        int power2 = random.nextInt(5) + 2;
        int initialCond = random.nextInt(5) + 1;
        double ans;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of (" + coefficient1 + "x^" + power1 + ")(" +
                                                  (coefficient2 + "x^" + power2 + ") " + "if x = " + initialCond));
        
        ans = (coefficient1 * power1 * (int)(Math.pow(initialCond, power1 - 1))) * 
              (coefficient2 * (int)Math.pow(initialCond, power2)) + 
              (coefficient2 * power2 * (int)(Math.pow(initialCond, power2 - 1))) * 
              (coefficient1 * (int)Math.pow(initialCond, power1));
              
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * generates and solves a problem that uses the Quotient Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandQuoProb(int type)
    {
        Random random = new Random();
        int coefficient1 = random.nextInt(4) + 1;
        int power1 = random.nextInt(5) + 2;
        int coefficient2 = random.nextInt(4) + 1;
        int power2 = random.nextInt(5) + 2;
        int initialCond = random.nextInt(5) + 1;
        double ans;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of (" + coefficient1 + "x^" + power1 + ")/(" +
                                                  (coefficient2 + "x^" + power2 + ") " + "if x = " + initialCond));
        
        ans = ((coefficient1 * power1 * (Math.pow(initialCond, power1 - 1))) * 
              (coefficient2 * Math.pow(initialCond, power2)) - 
              (coefficient2 * power2 * (Math.pow(initialCond, power2 - 1))) * 
              (coefficient1 * Math.pow(initialCond, power1)))/Math.pow((coefficient2 * Math.pow(initialCond, power2)), 2);
        
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * generates and solves a problem that uses the Chain Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandChainProb(int type)
    {
        Random random = new Random();
        int coefficient = random.nextInt(4) + 1;
        int power1 = random.nextInt(5) + 2;
        int power2 = random.nextInt(2) + 2;
        int num = random.nextInt(10) + 1;
        int initialCond = random.nextInt(3) + 1;
        double ans;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of (" + coefficient + "x^" + power1 + " + " + num + ")^" + 
                                                  (power2 + " if x = " + initialCond));
        
        ans = power2 * (coefficient * (int)(Math.pow(initialCond, power1)) + num) * 
              (coefficient * power1 * (int)Math.pow(initialCond, power1 - 1));
        
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * generates and solves a problem that uses both the Product Rule and the Chain Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandProdComboProb(int type)
    {
        Random random = new Random();
        int coefficient1 = random.nextInt(4) + 1;
        int power1 = random.nextInt(2) + 2;
        int coefficient2 = random.nextInt(4) + 1;
        int power2 = random.nextInt(2) + 2;
        int initialCond = random.nextInt(5) + 1;
        int power3 = random.nextInt(2) + 2;
        double ans = 0;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of (" + coefficient1 + "x^" + power1 + ")^" + 
                                                  (power3 + "(" + coefficient2 + "x^" + power2 + ") " + "if x = " + initialCond));
        
        ans = (power3 * (int)Math.pow(coefficient1 * (int)Math.pow(initialCond, power1), power3 - 1) * 
              (coefficient1 * power1 * (int)Math.pow(initialCond, power1 - 1)) * 
              (coefficient2 * (int)Math.pow(initialCond, power2)) + 
              ((coefficient2 * power2 * (int)Math.pow(initialCond, power2 - 1)) * 
              (int)Math.pow(coefficient1 * (int)Math.pow(initialCond, power1), power3)));
       
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * generates and solves a problem that uses both the Quotient Rule and the Chain Rule and takes an answer from the user,
     * then checks the users answer to the correct one
     */
    public boolean genRandQuoComboProb(int type)
    {
        Random random = new Random();
        int coefficient1 = random.nextInt(2) + 2;
        int power1 = random.nextInt(2) + 2;
        int powerc = 2;
        int number1 = random.nextInt(5) + 1;
        int coefficient2 = random.nextInt(3) + 2;
        int number2 = random.nextInt(3) + 1;
        int initialCond = random.nextInt(2) + 1;
        double ans;
        
        String input = JOptionPane.showInputDialog("Q) Find the derivative of ((" + coefficient1 + "x^" + power1 + " + " + number1 + "))^" + 
                                                  (powerc + "/(" + (coefficient2 + "x + " + number2  + ") if x = " + initialCond)));
        
        ans = (((coefficient2*initialCond+number2) * 
              (powerc * Math.pow((coefficient1 * Math.pow(initialCond, power1) + number1), powerc - 1) * 
              (power1 * coefficient1 * Math.pow(initialCond, power1 - 1)))) - 
              (Math.pow(coefficient1 * Math.pow(initialCond, power1) + number1, powerc) * coefficient2))/(Math.pow(coefficient2*initialCond+number2, 2));
     
        if(type == 1)
        {
            checkAnswerTutorial(ans, input);
            return false;
        }
        else
        {
            return checkAnswerTest(ans, input);
        }
    }
    /**
     * A version of check answer that is used in the tutorial.
     * Shows the user what the correct answer is if the answer is wrong
     */
    private void checkAnswerTutorial(double key, String input)
    {   
        double parsedInput = Double.parseDouble(input);

        if(key > parsedInput - .1 && key < parsedInput + .1)
        {
            JOptionPane.showMessageDialog(null, "Correct");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + formatter.format(key));
        }
    }
    /**
     * A version of check answer that is used in the test.
     * Shows the user what the correct answer is if the answer is wrong
     * returns whether the answer is correct or not as a boolean, so that the score can be recorded properly
     * in the RuleTeacher class
     */
    private boolean checkAnswerTest(double key, String input)
    {   
        double parsedInput = Double.parseDouble(input);

        if(key > parsedInput - .1 && key < parsedInput + .1)
        {
            JOptionPane.showMessageDialog(null, "Correct");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + formatter.format(key));
            return false;
        }
    }
}