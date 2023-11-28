import java.util.Scanner;


//Siqi Wen CS202 11/29/2021
//This is the Abstract Base Class in the hierarchy. It has three derived classes.
//It has three data members: three references to String. It has a default constructor
//and a copy constructor. It also has a function to read in information and store them
//in the data members, this function will be invoked in the member functions in the derived
//classes. There are two functions: compare and change, which are two of the functions involved
//with function overloading. Besides, there is also an abstract method, which has no body, and
//will be implemented in the derived classes.



public abstract class syntax 
{
    //data members for the syntax information
    protected String obj_name;
    protected String variable_name;
    protected String data_type;


    //default constructor
    public syntax()
    {
        this.obj_name = null;
        this.variable_name = null;
        this.data_type = null;
    }


    //copy constructor
    public syntax(syntax some_syntax) 
    {
        this.obj_name = some_syntax.obj_name;
        this.variable_name = some_syntax.variable_name;
        this.data_type = some_syntax.data_type;
    }


    //This function takes a Scanner reference as an argument, passed
    //by value, nothing will be returned. It would read in information
    //from the user and store the info into the data members.
    public void get_info(Scanner input) 
    {
        System.out.print("\nEnter the name for this object (for example: conditional1 / loop1 / function1): ");
        this.obj_name = input.nextLine();

        System.out.println("\nThe object name you entered WAS: " + obj_name + "\n\n");

        System.out.print("Enter the data type for this variable.");
        System.out.print("\n(When passing by reference, please enter something like: int&): ");
        this.data_type = input.nextLine();

        System.out.print("\nEnter the variable name: ");
        this.variable_name = input.nextLine();
    }


    //This function takes a String reference as an argument, an integer
    //will be returned. It would compare the data member with the argument.
    //1 will be returned if they match, otherwise, 0 will be returned.
    //This is one of the functions for function overloading.
    public int compare(String to_compare) 
    {
        if(this.obj_name.compareTo(to_compare) == 0) 
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }


    //This function takes one String reference as an argument, passed by value.
    //Nothing will be returned, this will change one of the data members to
    //point to the contents of the argument.
    //This is one of the functions for function overloading.
    public void change(String to_change) 
    {
        this.obj_name = to_change;
    }


    //This is an abstract method, it has no body.
    abstract void display();
}
