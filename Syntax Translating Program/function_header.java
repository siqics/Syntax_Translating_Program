import java.util.Scanner;


//Siqi Wen CS202 11/29/2021
//This is the function_header class, which is derived from the
//Abstract Base Class: syntax. There are two data members: two
//references to String. There is a default constructor and a
//copy constructor. There is also a function to read in information
//and store them into the data members after invoking the same named
//function in the base class, and there is another function for displaying
//the information, which are the syntax in c++ and the syntax in python.



public class function_header extends syntax
{
    //data members for function_header
    protected String return_type;
    protected String func_name;


    //default constructor
    public function_header()
    {
        this.return_type = null;
        this.func_name = null;
    }


    //copy constructor
    public function_header(function_header a_header)
    {
        super(a_header);
        this.return_type = a_header.return_type;
        this.func_name = a_header.func_name;
    }


    //This function takes a Scanner reference as an argument, passed
    //by value, nothing will be returned. It would invoke the same
    //named member function in the base class by using the "super"
    //keyword. This would read in information and store the
    //information into the data members.
    public void get_info(Scanner input)
    {
        super.get_info(input);

        System.out.print("\nEnter the return type for this function: ");
        return_type = input.nextLine();

        System.out.print("\nEnter the function name for this function: ");
        func_name = input.nextLine();
    }


    //This function takes two String references as arguments, passed by value.
    //Nothing will be returned, this will change the data members to point to
    //the contents of the argument.
    public void change(String r_type, String f_name)
    {
        return_type = r_type;
        func_name = f_name;
    }


    //This function takes no argument and returns nothing. It will
    //display the syntax in both C++ and Python.
    public void display() 
    {
        System.out.println("The name for this object is: " + obj_name + "\n\n");
        System.out.println("\nThe C++ version for this function is:\n\n");
        System.out.println(return_type + " " + func_name + " (" + data_type + " " + variable_name + ")\n\n");

        System.out.println("\n\n\nThe Python version for this function is:\n\n");
        System.out.println("def " + func_name + " (" + variable_name + "):\n\n");
    }
}
