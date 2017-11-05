public class Demo
{
  public static void main(String[] args)
  {
    System.out.println("TESTING FIXED SIZE ARRAY LIST");
    FixedSizeArrayList list = new FixedSizeArrayList();
    System.out.println("Create new list for FixedSizeArrayList with size of 10");

    System.out.println("Adding items: A, B, C, D, E");
    list.add('A');
    list.add('B');
    list.add('C');
    list.add('D');
    list.add('E');
    System.out.println();

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Adding more");
    System.out.println("Should look like:  First, A, X, B, Y, Z, C, D, E, Last");
    list.add(1, "First"); // First, A, B, C, D, E
    list.add(3, 'X'); // First, A, X, B, C, D, E
    list.add(5, 'Y'); // First, A, X, B, Y, C, D, E
    list.add(6, 'Z'); // First, A, X, B, Y, Z, C, D, E
    list.add(10, "Last"); // First, A, X, B, Y, Z, C, D, E, Last
    System.out.println();

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Replacing items");
    list.replace(2, "Second");
    list.replace(3, "Third");
    list.replace(4, "Fourth");
    list.replace(8, 1);
    list.replace(9, 2);
    System.out.println();

    System.out.println("Testing view and contains");
    System.out.println("Item in position 1: " + list.view(1));
    System.out.println("Item in position 4: " + list.view(4));
    System.out.println("Item in position 8: " + list.view(8));
    System.out.println("The item 'Y' is in the list: " + list.contains('Y'));
    System.out.println("The item 'Last' is in the list: " + list.contains("Last"));
    System.out.println("The item 'A' is in the list: " + list.contains('A'));
    System.out.println();

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Testing error: Adding more than 10.");
    list.add("Test1");
    System.out.println();

    System.out.println("Removing items, should only have: Y, Z, C");
    list.remove(4);
    list.remove(3);
    list.remove(2);
    list.remove(1);
    list.remove(4);
    list.remove(4);
    list.remove(4);
    System.out.println();

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Testing errors: Adding and removing beyond index.");
    list.add(0, "Test1");
    list.replace(5, "Test2");
    list.remove(7);
    System.out.println();

    System.out.println("Clearing list.");
    list.clear();
    System.out.println();

    System.out.println("Checking if list is empty");
    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();
    list.remove(1);
  } // end main

} // end of Demo
