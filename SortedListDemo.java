public class SortedListDemo
{
  public static void main(String[] args)
  {
    System.out.println("TESTING LINKED DATA SORTED LIST");
    LinkedSortedList list = new LinkedSortedList();
    System.out.println("Create new list for LinkedSortedList");

    System.out.println("Adding items: Morgan, Brian, Gino, Patrick, Shaan, Nick, Daniel, Min, Shaan, Nick");
    list.add("Morgan");
    list.add("Brian");
    list.add("Gino");
    list.add("Patrick");
    list.add("Shaan");
    list.add("Nick");
    list.add("Daniel");
    list.add("Min");
    list.add("Shaan");
    list.add("Nick");
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

    System.out.println("Removing extras");
    list.remove(6);
    list.remove("Shaan");

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Entry at position 4: " + list.view(4));
    System.out.println("Entry at position 7: " + list.view(7));
    System.out.println();
    System.out.println("Is Woo in the list?: " + list.contains("Woo"));
    System.out.println("Is Gino in the list?: " + list.contains("Gino"));
    System.out.println();
    System.out.println("Attemping to remove outside index");
    list.remove(9);
    System.out.println();

    System.out.println("Testing inherited methods that were not required.");
    list.add(1, "LMAO");
    list.replace(3, "ZZZZZ");
    list.replace("Min", "Where?");

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Clearing list");
    list.clear();
    System.out.println("Checking if anything is in the list");
    list.remove(1);
    list.remove("Anything");
    list.view(4);

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Adding new items: Hyun, Dalee, Min, Alex, Grace, Rosanne");
    list.add("Hyun");
    list.add("Dalee");
    list.add("Min");
    list.add("Alex");
    list.add("Grace");
    list.add("Rosanne");

    //print out
    System.out.println("The list contains " + list.getLength() +
                       " items, as follows: ");

    for(int index = 0; index < list.toArray().length; index++)
    {
      System.out.print(list.toArray()[index] + " ");
    }
    System.out.println();
    System.out.println();
  } // end main
} // end SortedListDemo
