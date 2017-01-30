import java.util.*;     // for Random class.
import javax.swing.*;   // for JOptionPane.
public class Test
{
    Random random;
    ProblemGenerator gen;
    /**
     * gives the user a 10 problem test and records/displays the score
     * the type of problem, eg: Power Rule or Quotient Rule, is randomly selected
     * the user can retake the test as many times as desired, but the problems are all randomly generated
     */
    public Test()
    {
        random = new Random();
        gen = new ProblemGenerator();
        
        int rand = 0;
        int score = 0;
        boolean key = false;
        double userAnswer = 0.0;
        String userInput = "";
        String input = "";
        
        do
        {
            for(int i = 0; i < 10; i++)
            {
                key = false;
                score = 0;
                rand = random.nextInt(6);
                
                //randomly selects question type
                switch(rand)
                {
                    case 0:
                        key = gen.genRandPowerProb(2);
                        break;
                    case 1:
                        key = gen.genRandProdProb(2);
                        break;
                    case 2:
                        key = gen.genRandQuoProb(2);
                        break;
                    case 3:
                        key = gen.genRandChainProb(2);
                        break;
                    case 4:
                        key = gen.genRandProdComboProb(2);
                        break;
                    case 5:
                        key = gen.genRandQuoComboProb(2);
                        break;
                    }
                
                //counts score
                if(key)
                {
                    score++;
                }
            }
            
            //displays score
            JOptionPane.showMessageDialog(null, "Your Score: " + score + " out of 10");
            String[] repeat = {"Yes", "No"};
            input = (String)JOptionPane.showInputDialog(null, "Do you want to take another test?", "Menu", JOptionPane.QUESTION_MESSAGE,null,repeat,repeat[0]);
        }
        while(input.equalsIgnoreCase("Yes"));
    }
}
