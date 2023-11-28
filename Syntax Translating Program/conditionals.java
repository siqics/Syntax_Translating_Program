import java.util.Scanner;


//Siqi Wen CS202 11/29/2021
//This is the conditionals class, which is derived from the
//Abstract Base Class: syntax. There are three data members:
//three references to String. There is a default constructor
//and a copy constructor. There is also a function to read in 
//information and store them into the data members after invoking
//the same named function in the base class, and there is another
//function for displaying the information, which are the syntax in
//c++ and the syntax in python. Besides, there is a function to compare
//the arguments with the data members, and this function is one of the
//functions involved with function overloading.



public class conditionals extends syntax
{
    //data members for conditionals class
    protected String expression;    //the if conditional expression
    protected String statement1;    //the if statement
    protected String statement2;    //the else statement


    //default constructor
    public conditionals()
    {
        this.expression = null;
        this.statement1 = null;
        this.statement2 = null;
    }


    //copy constructor
    public conditionals(conditionals a_condition)
    {
        super(a_condition);
        this.expression = a_condition.expression;
        this.statement1 = a_condition.statement1;
        this.statement2 = a_condition.statement2;
    }


    //This function takes a Scanner reference as an argument, passed
    //by value, nothing will be returned. It would invoke the same
    //named member function in the base class by using the "super"
    //keyword. This would read in information and store the
    //information into the data members.
    public void get_info(Scanner input)
    {
        super.get_info(input);
        
        System.out.print("\nEnter the conditional expression(after if): ");
        this.expression = input.nextLine();

        System.out.print("\nEnter the statement you want to display below if\n(for example: this is an if statement): ");
        this.statement1 = input.nextLine();

        System.out.print("\nEnter the statement you want to display below else\n(for example: this is an else statement): ");
        this.statement2 = input.nextLine();
    }


    //This function takes three String references as arguments, an integer
    //will be returned. It would compare the data members with the arguments.
    //1 will be returned if they all match, otherwise, 0 will be returned.
    //This is one of the functions for function overloading.
    public int compare(String compare_express, String compare_state1, String compare_state2) 
    {
        if(compare_express.compareTo(expression) == 0 && compare_state1.compareTo(statement1) == 0 && compare_state2.compareTo(statement2) == 0) 
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }


    //This function takes no argument and returns nothing. It will
    //display the syntax in both C++ and Python.
    public void display() 
    {
        System.out.println("The name for this object is: " + obj_name + "\n\n");
        System.out.println("\nThe C++ version for this conditional is:\n\n");
        System.out.println("if (" + expression + ")");
        System.out.println("{\n" + "\t" + "cout << \"" + statement1 + "\";\n}");
        System.out.println("else\n{\n\tcout << \"" + statement2 + "\";\n}");

        if(expression.contains("&&"))
        {
            expression = expression.replace("&&", "and");
        }

        if(expression.contains("||"))
        {
            expression = expression.replace("||", "or");
        }

        System.out.println("\n\n\nThe Python version for this conditional is:\n\n");
        System.out.println("if " + expression + ":\n");
        System.out.println("\tprint(\'" + statement1 + "\')\n");
        System.out.println("else:\n\tprint(\'" + statement2 + "\')");
    }
}
