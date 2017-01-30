import javax.swing.JOptionPane;
/**
 * This class that accesses all the lessons
 */
public class Tutorial
{
    Explanation exp;
    ProblemGenerator gen;
    /**
     * Asks user for which lesson they want to earn. Then accesses the related lesson method.
     */
    public Tutorial()
    {
        exp = new Explanation();
        gen = new ProblemGenerator();
        
        String userStringInput = "";
        String menuInput;
        
        do
        {
            JOptionPane.showMessageDialog(null, "The original method of solving a derivative is using the limit method.\n" +
                                         "This method is by using the formula:\nThe limit as b approaches 0 of (f(x+b)-f(x))/b\n" + 
                                         "This formula may seem confusing but there are shortcuts to solving the derivative of a function.");
            
            String[] menu = {"Power Rule", "Product Rule", "Quotient Rule", "Chain Rule"};
            menuInput = (String)JOptionPane.showInputDialog(null,"Which rule do you want to study?", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);

            switch(menuInput)
            {
                case "Power Rule":
                    powerRule();
                    break;
                case "Product Rule":
                    productRule();
                    break;
                case "Quotient Rule":
                    quotientRule();
                    break;
                case "Chain Rule":
                    chainRule();
                    break;
            }
            
            String[] repeat = {"Yes", "No"};
            menuInput = (String)JOptionPane.showInputDialog(null, "Do you want to take another tutorial?", "Menu", JOptionPane.QUESTION_MESSAGE, null, repeat, repeat[0]);
        }
        while(menuInput.equals("Yes"));
    }
    /**
     * Gives the explanation of power rule and basic random problem that uses power rule to solve
     */
    private void powerRule()
    {
        exp.powerRuleTutorial();
        gen.genRandPowerProb(1);
    }
     /**
     * Gives the explanation of product rule and basic random problem that uses product rule to solve
     */
    private void productRule()
    {
        exp.productRuleTutorial();
        gen.genRandProdProb(1);
    }
     /**
     * Gives the explanation of quotient rule and basic random problem that uses quotient rule to solve
     */
    private void quotientRule()
    {
        exp.quotientRuleTutorial();
        gen.genRandQuoProb(1);
    }
     /**
     * Gives the explanation of chain rule and basic random problem that uses chain rule to solve
     */
    private void chainRule()
    {
        exp.chainRuleTutorial();
        gen.genRandChainProb(1);
    }
}
