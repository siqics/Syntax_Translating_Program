import java.util.Scanner;


//Siqi Wen CS202 11/29/2021
//This is the loops class, which is derived from the
//Abstract Base Class: syntax. There are five data mebers:
//three references to String and two integers. There is a
//default constructor and a copy constructor. There is also
//a function to read in information and store them into the
//data members after invoking the same named function in the 
//base class, and there is another function for displaying the 
//information, which are the syntax in c++ and the syntax in 
//python. Besides, there is a function to change the data members
//to the arguemnts, and this function is one of the functions
//involved with function overloading.



public class loops extends syntax
{
    //data members for loops class
    protected String for_or_while;
    protected int initial_value;
    protected int ending_value;
    protected String condi_statement;
    protected String update_statement;
    

    //default constructor
    public loops()
    {
        this.for_or_while = null;
        this.initial_value = 0;
        this.ending_value = 0;
        this.condi_statement = null;
        this.update_statement = null;
    }


    //copy constructor
    public loops(loops a_loop)
    {
        super(a_loop);
        this.for_or_while = a_loop.for_or_while;
        this.initial_value = a_loop.initial_value;
        this.ending_value = a_loop.ending_value;
        this.condi_statement = a_loop.condi_statement;
        this.update_statement = a_loop.update_statement;
    }


    //This function takes three String references and two integers as arguments, nothing will
    //be returned. It would change the data members, to make them point to the arguments, or
    //assign them as the value of the arguments if they're integers.
    //This is one of the functions for function overloading.
    public void change(String which_loop, int a_num, int two_num, String a_condi, String a_state) 
    {
        for_or_while = which_loop;
        initial_value = a_num;
        ending_value = two_num;
        condi_statement = a_condi;
        update_statement = a_state;
    }


    //This function takes a Scanner reference as an argument, passed
    //by value, nothing will be returned. It would invoke the same
    //named member function in the base class by using the "super"
    //keyword. This would read in information and store the
    //information into the data members.
    public void get_info(Scanner input)
    {
        super.get_info(input);
        
        System.out.print("\n\n\nWARNING: You HAVE to enter \"for\" or \"while\"!!!\nIs this a for loop or a while loop? Enter \"for\" or \"while\": ");
        this.for_or_while = input.nextLine();

        System.out.print("\nEnter the initial value for variable: " + variable_name + " : ");
        this.initial_value = input.nextInt();
        input.nextLine();

        System.out.print("\nEnter the conditional statement (for example: i < 10): ");
        this.condi_statement = input.nextLine();

        System.out.print("\nEnter the ending value (the value that appears in the conditional statement): ");
        this.ending_value = input.nextInt();
        input.nextLine();

        System.out.print("\nEnter the statement to update the variable (for example: ++i): ");
        this.update_statement = input.nextLine();
    }

    
    //This function takes no argument and returns nothing. It will
    //display the syntax in both C++ and Python.
    public void display() 
    {
        System.out.println("The name for this object is: " + obj_name + "\n\n");
        System.out.println("\nThe C++ version for this loop is:\n\n");
        if(for_or_while.equals("for"))
        {
            System.out.println("for(" + data_type + " " + variable_name + " = " + initial_value + "; " + condi_statement + "; " + update_statement + ")");
            System.out.println("{\n\tcout << " + variable_name + ";\n}");
        }

        if(for_or_while.equals("while"))
        {
            System.out.println("while(" + condi_statement + ")\n{\n\tcout << " + variable_name + ";\n\t" + update_statement + ";\n}");
        }

        System.out.println("\n\n\nThe Python version for this loop is:\n\n");
        if(for_or_while.equals("for"))
        {
            System.out.println("for " + variable_name + " in range(" + initial_value + ", " + ending_value + "):\n\tprint(" + variable_name + ")");
        }

        if(for_or_while.equals("while"))
        {
            System.out.println(variable_name + " = " + initial_value + "\nwhile " + condi_statement + ":\n\tprint(" + variable_name + ")\n\t" + update_statement);
        }
    }
}
