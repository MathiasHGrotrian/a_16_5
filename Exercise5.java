package Chapter16;


public class Exercise5
{

    /*
             Write a method called countDuplicates that returns the number of duplicates in
              a sorted list. The list will be in sorted order, so all of the duplicates will
               be grouped together. For example, if a variable list stores the values
            [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40],thecalloflist.countDuplicates()
            should return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate
            of 15, 2 duplicates of 23, and 1 duplicate of 40.
     */


    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,1);
        addNodeToList(1,1);
        addNodeToList(2,3);
        addNodeToList(3,4);

        addNodeToList(4,5);
        addNodeToList(5,6);

        System.out.println(countDuplicates());

    }

    public static int countDuplicates()
    {
        int countDuplicates = 0;
        for(ListNode current = front; current != null; current = current.next)
        {
            if(current.next != null)
            {
                if(current.data == current.next.data)
                {
                    countDuplicates++;
                }
            }
        }

        return countDuplicates;
    }


    public static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
