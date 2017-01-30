import javax.swing.JOptionPane;    // for JOptionPane (UI)
public class BasicDerivativeTutorial
{
    /**
     * Main method.
     */
    public static void main(String args[])
    {        
        String menuInput = "";
        String input = "";
        
        JOptionPane.showMessageDialog(null, "Welcome to the Basic Derivative Tutorial");
        
        do
        {
            String[] menu = {"Tutorial", "Practice", "Test"};
            menuInput = (String)JOptionPane.showInputDialog(null,"Choose one", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
                
            switch(menuInput)
            {
                case "Tutorial":
                    Tutorial tutorial = new Tutorial();
                    break;
                case "Practice":
                    Practice practice = new Practice();
                    break;
                case "Test":
                    Test test = new Test();
                    break;                    
            }
            
            String[] repeat = {"Yes", "No"};
            menuInput = (String)JOptionPane.showInputDialog(null,"Do you want to take another tutorial, practice, or test?", "Menu", JOptionPane.QUESTION_MESSAGE,null,repeat,repeat[0]);
        }
        while(menuInput.equals("Yes"));
        /* Repeat it until an user does not want to continue the program. */
    }
}
