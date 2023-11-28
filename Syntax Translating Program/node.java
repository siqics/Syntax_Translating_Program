//Siqi Wen CS202 12/01/2021
//This is the node class. It has two private data members: a reference
//to syntax and a reference to node. There is a default constructor to
//set the data members to their zero equivalent values. There are also
//another four member functions: return the data members as references
//by value and set the data members to the same as the argument. These
//functions will be called a lot in the member functions in the list
//class to help the list class complete its missions.





public class node 
{
    private syntax ref;        //a syntax reference
    private node next;         //a node reference


    //default constructor
    public node()
    {
        this.ref = null;
        this.next = null;
    }


    //This function takes no argument and returns a syntax reference by value.
    public syntax get_syntax_ref()
    {
        return this.ref;
    }


    //This function takes no argument and returns a node reference by value.
    public node go_next()
    {
        return this.next;
    }


    //This function takes a syntax reference (passed by value) and returns
    //nothing. It would assign the data member to the reference passed in
    //the argument.
    public void setdata(syntax some_ref)
    {
        this.ref = some_ref;
    }


    //This function takes a node reference (passed by value) and returns
    //nothing. It would assign the data member to the reference passed in
    //the argument.
    public void setnext(node connection)
    {
        this.next = connection;
    }
}
