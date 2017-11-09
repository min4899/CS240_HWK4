/**
   A linked data list that inherits LinkedDataList and implements SortedListInterface.
   @author Minwoo Soh
*/
public final class LinkedSortedList<T extends Comparable<T>> extends LinkedDataList<T> implements SortedListInterface<T>
{
  /** Creates an empty LinkedSortedList object with no nodes. */
  public LinkedSortedList()
  {
    super();
  } // end constructor

  /** Add an entry to the List. Then sorts the list.
      The list size will be increased by 1.
      Other item positions at or below specified position will be effected.
      @param item  The object to be added. */
  public void add(T item)
  {
    int newPosition = Math.abs(getPosition(item));
    super.add(newPosition, item);
  } // end add

  /** Remove an entry at the specified position of the list.
      The list size will be decreased by 1.
      Other item positions at or below specified position will be effected.
      @param position  The location of item to be removed.
      @return  A reference to the removed entry.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T remove(T item)
  {
    T result = null;
    int position = getPosition(item);
    if(isEmpty())
    {
      System.out.println("List is currently empty. No entries to remove.");
    }
    else if(position > 0)
    {
      result = super.remove(position);
    }
    else
    {
      System.out.println("Item not found.");
    } // end if
    return result;
  } // end remove

  /** Searches list for the requested item and returns its position.
      @param item  The requested item to get position for.
      @return  The position of the item, negative number is returned if nothing is found. */
  public int getPosition(T item)
  {
    int position = 1;
    int length = getLength();
    while( (position <= length) && (item.compareTo(view(position)) > 0) )
    {
      position++;
    } // end while
    if( (position > length) || (item.compareTo(view(position)) != 0) )
    {
      position = -position; // entry is not in list.
    } // end if
    return position;
  } // end getPosition

  // In case user attempts to use other inherited methods from LinkedDataList
  // that were not required by the SortedListInterface.
  public void add(int position, T item)
  {
    System.out.println("Cannot insert item in certain positions of the list." +
                       "\nAdded item to SortedList using normal add method.");
    add(item);
  }

  public T replace(T itemToRemove, T item)
  {
    // Removes specified item and add new item.
    T result = remove(itemToRemove);
    add(item);
    return result;
  } // end replace

  public T replace(int position, T item)
  {
    // Removes item at position and add new item.
    T result = remove(position);
    add(item);
    return result;
  } // end replace


  // Rest of methods required by SortedListInterface is inherited from LinkedDataList.


  /** Private inner class Node */
  private class Node<T extends Comparable<T>> implements Comparable<Node<T>>
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
        @param nextNode  The previous node that will be referenced. */
    private Node(T dataPortion, Node nextNode)
    {
      data = dataPortion;
      next = nextNode;
    } // end constructor

    /** Compares two datas to see which has priority.
        @param other  The node that will be compared with another.
        @return  0 if equal, less than 0 if other is greater, greater than 0 if other is lower.*/
    public int compareTo(Node<T> other)
    {
      return data.compareTo(other.data);
    } // end compareTo
  } // end of Node
} // end of LinkedSortedList
