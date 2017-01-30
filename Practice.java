import javax.swing.JOptionPane;
public class Practice
{
    ProblemGenerator gen;
    /**
     * allows the user to choose which type of problem to practice, and allows them to do as many problems as desired
     */
    public Practice()
    {
        gen = new ProblemGenerator();
        String menuInput = "";
        
        do
        {
            //gives the user a choice between all of the rules to practice from
            String[] menu = {"Power Rule", "Product Rule", "Quotient Rule", "Chain Rule", "Product Rule w/Chain Rule", "Quotient Rule w/Chain Rule"};
            menuInput = (String)JOptionPane.showInputDialog(null,"What type of practice problem would you like?", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            
            boolean key = false;
            
            switch(menuInput)
            {
                case "Power Rule":
                    key = gen.genRandPowerProb(1);
                    break;
                case "Product Rule":
                    key = gen.genRandProdProb(1);
                    break;
                case "Quotient Rule":
                    key = gen.genRandQuoProb(1);
                    break;
                case "Chain Rule":
                    key = gen.genRandChainProb(1);
                    break;
                case "Product Rule w/Chain Rule":
                    key = gen.genRandProdComboProb(1);
                    break;
                case "Quotient Rule w/Chain Rule":
                    key = gen.genRandQuoComboProb(1);
                    break;
                }
                
            String[] repeat = {"Yes", "No"};
            menuInput = (String)JOptionPane.showInputDialog(null,"Would you like another practice problem?", "Menu", JOptionPane.QUESTION_MESSAGE,null,repeat,repeat[0]);
        } while(menuInput.equals("Yes"));
    }
}