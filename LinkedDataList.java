/**
   A linked data array that implements ListInterface.
   @author Minwoo Soh
*/
public final class LinkedDataList<T> implements ListInterface<T>
{
  private Node firstNode;
  private int numberOfEntries;

  /** Creates an empty LinkedDataList object with no nodes. */
  public LinkedDataList()
  {
    firstNode = null;
    numberOfEntries = 0;
  } // end constructor

  /** Add an entry to the end of the List.
      The list size will be increased by 1.
      Other item positions will be unaffected.
      @param item  The object to be added. */
  public void add(T item)
  {
    Node newNode = new Node(item);

    if(isEmpty())
    {
      firstNode = newNode;
    }
    else
    {
      Node lastNode = getNodeAt(numberOfEntries);
      lastNode.next = newNode;
    } // end if
    numberOfEntries++;
  } // end add

  /** Add an entry to the specificed position of the list.
      The list size will be increased by 1.
      Other item positions at or below specified position will be effected.
      @param item  The object to be added.
      @param position  The location the item should be placed in the list. Can choose between 1 - 10.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public void add(int position, T item)
  {
    try
    {
      if ( (position >= 1) && (position <= numberOfEntries) )
      {
        Node newNode = new Node(item);
        if(position == 1) // If new entry is placed at front.
        {
          newNode.next = firstNode;
          firstNode = newNode;
        }
        else // If position > 1.
        {
          Node before = getNodeAt(position - 1);
          Node after = before.next;
          newNode.next = after;
          before.next = newNode;
        } // end if
      }
      else
      {
        throw new IndexOutOfBoundsException("Given position of add's new entry is out of bounds.");
      } // end if
    } // end try
    catch(IndexOutOfBoundsException e)
    {
      System.out.println(e.getMessage());
    } // end catch
  }

  /** Remove an entry at the specified position of the list.
      The list size will be decreased by 1.
      Other item positions at or below specified position will be effected.
      @param position  The location of item to be removed.
      @return  A reference to the removed entry.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T remove(int position)
  {
    T result = null;
    try
    {

    } // end try
    catch(IndexOutOfBoundsException e)
    {
      System.out.println(e.getMessage());
    } // end catch
  } // end remove

  /** Removes all entries from list. */
  public void clear()
  {
    firstNode = null;
    numberOfEntries = 0;
  } // end clear

  /** Replaces the entry at the specificed position with a new entry.
      @param position  The location of item to be replaced.
      @param item  The new entry to replace old entry.
      @return  The original entry that was replaced.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T replace(int position, T item)
  {

  }

  /** Retrieves the entry at the specificed position of the list.
     @param position  The specified location of entry.
     @return  A reference to the indicated entry.
     @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T view(int position)
  {

  }

  /** See whether this list contains a given entry.
      @param item  The object that is the desired entry.
      @return  True if the list contains the item, false if not. */
  public boolean contains(T item)
  {

  }

  /** Gets the length of the list.
      @return  The integer number of entries currently in the list. */
  public int getLength()
  {
    return numberOfEntries;
  } // end getLength

  /** Checks whether the list is empty.
      @return  True if the list is empty, false if not. */
  public boolean isEmpty()
  {
    return numberOfEntries == 0;
  } // end isEmpty

  /** Retrieves all entries in the order in which they occur in the list.
      @return  A newly created array of all entries in the list. */
  public T[] toArray()
  {

  }

  private Node getNodeAt(int position)
  {
    Node currentNode = firstNode;

    for(int i = 1; i < position; i++)
    {
      currentNode = currentNode.next;
    } // end for

    return currentNode;
  }

  /** Private inner class Node */
  private class Node
  {
    private T data;
    private Node next; // Link to next node.
    /** Creates a node that points to null.
        @param dataPortion  The data that will be stored in the node. */
    private Node(T dataPortion)
    {
      this(dataPortion, null);
    } // end constructor

    /** Creates a node that points to another node.
        @param dataPortion  The data that will be stored in the node.
        @param nextNode  The next node that will be referenced. */
    private Node(T dataPortion, Node nextNode)
    {
      data = dataPortion;
      next = nextNode;
    } // end constructor
  } // end of Node
} // end of LinkedDataList
