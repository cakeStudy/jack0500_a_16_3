
public class a_16_3
{
    /*Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
    otherwise. An empty list is considered to be sorted.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,1);
        addNodeToList(1,2);
        addNodeToList(2,2);
        addNodeToList(3,3);
        addNodeToList(4,5);
        addNodeToList(5,8);

        System.out.println(isSorted());
    }

    public boolean isSorted()
    {
        boolean isSorted = true;

        //the for-loop checks if the current number is bigger than the next number, if true then return false!
        for (ListNode current = front; current != null; current = current.next)
        {
            //I need to use double if because it will fail if i don´t first check if the current.next != null
            if (current.next != null)
            {
                if (current.data > current.next.data)
                {
                    isSorted = false;
                }
            }
        }
        return isSorted;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
