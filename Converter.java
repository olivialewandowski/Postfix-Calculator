package 

public class Converter extends ArrayStack
{
    //declaring the variables
    String infix, postfix;

    //constructor to accept the string infix expression
    public Converter (String infix)
    {
        this.infix = infix;
    }

    //need to convert the infix String into a character array so that the parse method from Parser Helper can accept it as a parameter
    public static char[] convertToCharArray(String infix) 
    {
        return infix.toCharArray();
    }

    //method to convert the infix expression to the postfix expression
    public String toPostFix (String infix)
    {
        char[] infixArray = convertToCharArray(infix);
        parsedInfix = parse(infixArray);


        return postfix;
    }
}
