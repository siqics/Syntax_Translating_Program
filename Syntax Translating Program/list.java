//Siqi Wen CS202 12/01/2021
//This is a list class. It has one data member called head, which
//is a reference to node. In this class, there are many member functions
//that can complete a lot of different tasks, for example: add a node
//to the LLL; remove a node in the LLL; display all elements in the LLL
//and so on. Also, there are private recursive functions that will be called
//in the public member functions in order to help with completing the tasks.






public class list
{
    private node head;            //data member


    //default constructor
    public list()
    {
        this.head = null;
    }


    //This function takes a syntax reference by value and return a
    //node reference by value. It would call a recursive function
    //to add a node at the end of a linear linked list.
    public node add(syntax syn_ref)
    {
        return add_recursion(this.head, syn_ref);
    }


    //This function take a node reference and a syntax reference as 
    //arguments, both passed by values, and a node reference will be
    //returned by value. It's a recursive function and it will add a
    //node at the end of a linear linked list.
    private node add_recursion(node head, syntax syn_ref)
    {
        if(head == null)
        {
            head = new node();
            head.setdata(syn_ref);
            return head;
        }
        head.setnext(add_recursion(head.go_next(), syn_ref));
        return head;
    }


    //This function takes a node reference and a String reference, both
    //passed by value, a boolean value will be returned. It will call a
    //recursive function to check if there's a match with the argument
    //a_name, true will be returned if there is, otherwise, false will
    //be returned.
    public boolean retrieve_one(node a_head, String a_name)
    {
        head = a_head;
        boolean match = false;

        if(head == null)
        {
            System.out.println("Empty LLL...No objects can be retrieved...\n\n");
            return false;
        }
        return retrieve_recursive(head, a_name, match);
    }


    //This function takes a node reference, a String reference and a boolean as
    //arguments, a boolean value will be returned. It is a recursive function, it
    //would check if there is a matching obj_name with the argument a_name, if there
    //is, the argument match will be set to true and be returned, if not, match will
    //be returned as false.
    private boolean retrieve_recursive(node $head, String a_name, boolean match)
    {
        if($head == null)
        {
            return match;
        }
        if($head.get_syntax_ref().compare(a_name) == 1)
        {
            match = true;
            return match;
        }
        return retrieve_recursive($head.go_next(), a_name, match);
    }


    //This function takes a node reference and a String reference as arguments,
    //both passed by values, a node reference will be returned by value. It will
    //call a recursive to remove a node with the matching obj_name.
    public node remove_one_obj(node a_head, String to_compare)
    {
        head = a_head;
        return remove_recursive_func(head, to_compare);
    }


    //This function is a recursive function, it takes a node reference and a String
    //reference as arguments, and it will return a node reference by value. This
    //function will traverse through the LLL and find the matching obj_name, when
    //it is found, we will delete the corresponding node and connect the list up as
    //unwinding the stack.
    private node remove_recursive_func(node $head, String to_compare)
    {
        if($head.get_syntax_ref().compare(to_compare) == 1)
        {
            $head = $head.go_next();
            return $head;
        }
        $head.setnext(remove_recursive_func($head.go_next(), to_compare));
        return $head;
    }


    //This function take a node reference and two String references as arguments,
    //nothing will be returned. It will call another recursive function to change
    //the object name in the LLL.
    public void change_the_name(node a_head, String to_compare, String new_name)
    {
        head = a_head;
        change_name_recursive(head, to_compare, new_name);
    }


    //This function takes a node reference and two String references as arguments,
    //nothing will be returned. This is a recursive function, it would find the
    //match first, then reset the data member: obj_name to the new_name.
    private void change_name_recursive(node $head, String to_compare, String new_name)
    {
        if($head.get_syntax_ref().compare(to_compare) == 1)
        {
            $head.get_syntax_ref().change(new_name);
            System.out.println("\n\n\nWe changed the old name: " + to_compare + " to the new name: " + new_name + "\n\n\n");
            return;
        }
        change_name_recursive($head.go_next(), to_compare, new_name);
    }


    //This function takes a node reference as an argument, nothing
    //will be returned. It would call a recursive function to display
    //all elements in the LLL.
    public void display_all(node a_head)
    {
        head = a_head;

        if(head == null)
        {
            System.out.println("Empty LLL...No objects can be displayed...\n\n");
        }
        else
            display_recursion(head);
    }


    //This function takes a node reference as an argument, passed by value.
    //Nothing will be returned. It's a recursive function and it would traverse
    //over the whole LLL and display every element in the LLL.
    private void display_recursion(node $head)
    {
        if($head == null)
        {
            return;
        }
        System.out.println("\n\n\n");
        $head.get_syntax_ref().display();
        display_recursion($head.go_next());
    }
}
