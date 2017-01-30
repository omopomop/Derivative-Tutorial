import javax.swing.JOptionPane;
/**
 * This class has all the lesson methods.
 */
public class Explanation
{
    public Explanation()
    {

    }
    /**
     * This is lesson on power rule
     */
    public void powerRuleTutorial()
    {
        JOptionPane.showMessageDialog(null, "\nPOWER RULE\n" +
                                      "Now the simplified version of solving a derivative is using the power rule." +
                                      "This shortcut is very simple and saves a lot of time" +
                                      "To solve f'(x), first multiply the whole function by the exponent, then subtract the exponent by one.\n" +
                                      "Ex )Find  the derivative of 3x^3 if x = 2\n" +
                                      "Multiply the function by the exponent, which is 3, and then subtract 1 from the exponent." + 
                                      "Simplification:\n9x^2 " +
                                      "Plug in x\nAns: 36\n" +
                                      "Now you try.\n");
    }
    /**
     * This is the lesson on product rule.
     */
    public void productRuleTutorial()
    {
        JOptionPane.showMessageDialog(null, "\nPRODUCT RULE\n" +
                                      "When there are two functions multiplied together, additional steps are needed to solve the problem." + 
                                      "The general formula for product rule of f(x)g(x) is f'(x)g(x)+f(x)g'(x)\n" +
                                      "You take the derivative of the first function and multiply that to the underived second function.\n" +
                                      "Add that to the derivative of second function times the underived first function.\n" + 
                                      "Ex) Find the derivative of (x^2+3)(2x+1) if x = 2\n" + 
                                      "f'(x): 2x\ng'(x): 2\nUsing f'(x)g(x)+f(x)g'(x), we get 2x(2x+1)+2(x^2+3).\n" +
                                      "Simplification:\n4x^2+2x+2x^2+6\n6x^2+2x+6 " +
                                      "Plug in x\nAns: 34\n" +
                                      "Now you try.\n");
    }
    /**
     * This is the lesson on quotient rule
     */
    public void quotientRuleTutorial()
    {
        JOptionPane.showMessageDialog(null, "\nQUOTIENT RULE\n" +
                                      "When one function is divided by another, different steps are needed to solve the problem." +
                                      "The general formula for quotient rule of f(x)/g(x)is (g(x)f'(x)-f(x)g'(x))/g(x)^2\n" +
                                      "You take the derivative of the bottom function and multiply that to the underived top function.\n" + 
                                      "Subtract that to the derivative of top function times the underived bottom function. Divide the whole thing by the square of the underived bottom function.\n" +
                                      "\nEx) Find the derivative of (x^2+3)/(2x) if x = 2\n" + 
                                      "f'(x): 2x\ng'(x): 2\nUsing (g(x)f'(x)-f(x)g'(x))/g(x)^2, we get (2x(2x)-2(x^2+3))/(2x)^2.\n" +
                                      "Simplification:\n(4x^2-2x^2-6)/4x^2\n2(2x^2-x^2-3)/2(2x^2)\n(x^2-3)/(2x^2) " + 
                                      "Plug in x\nAns: 1/8\n" +
                                      "Now you try.\n");
    }
    /**
     * This is the lesson on chain rule.
     */
    public void chainRuleTutorial()
    {
        JOptionPane.showMessageDialog(null, "\nCHAIN RULE\n" +
                                     "When one function is inside another, different steps are needed to solve the problem." +
                                     "The general formula for the chain rule of f(g(x))is f'(g(x))(g'(x))\n" + 
                                     "You take the derivative of the outer function and keep the inside function underived.\n" +
                                     "Multiply that by the derivative of the inner function.\n" +
                                     "Q) Find the derivative of (2x+2)^2 if x = 2\n" +
                                     "f'(x): 2(g(x))\ng'(x): 2\nUsing f'(g(x))(g'(x)), we get 2(2x+2)(2).\n" +
                                     "Simplification:\n4(2x+2) or 8x+8 " +
                                     "Plug in x\nAns: 24\n" +
                                     "Now you try.\n");
    }
}