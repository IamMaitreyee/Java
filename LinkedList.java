import java.util.Scanner;

public class LinkedList
{
    public static Node start=null;
    static Scanner s1 = new Scanner(System.in);
    public static Node createNode()
    {
        return new Node();
    }
                
    //insertion method
    static void insertNode()
    {
        Node temp=createNode();
        System.out.println("enter any elements");
        temp.data=s1.nextInt();
        temp.link=null;
        if(start==null)
        {
            start=temp;
        }
                                    
        else
        {
            Node temp2=start;
            while(temp2.link!=null)
            {
                temp2=temp2.link;
            }
            temp2.link=temp;
        }
    }
    public static void deleteNode()
    {
        if(start==null)
        {
            System.out.println("List is empty");
        }
        else{
            start=start.link;
        }
    }
    public static void PrintList()
    {
        if(start==null){
            System.out.println("List is empty");
        }
        else{
            Node printdata = start;
            while(printdata!=null){
                System.out.println(printdata.data+" ");
                printdata=printdata.link;
            }
        }
    }
    public static int MenuEx()
    {
        int choice;
        System.out.println("1.Add element\n2. Delete\n3. Display\n4. Exit\n");
        System.out.println("Enter your choice");
        choice = s1.nextInt();
        return choice;
    }
                    
    public static void main(String[] args) 
    {
        while (true) {
            switch (MenuEx()) {
                case 1:
                    insertNode();
                    break;
                case 2: deleteNode();
                    break;
                case 3: PrintList();break;
                case 4: System.out.println("Exiting...");return;
            
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
                                
            }
        }
	}

	
}

class Node
{
	int data;
	Node link;
}


