/**
   A fixed size array that implements ListInterface.
   @author Minwoo Soh
*/
public final class FixedSizeArrayList<T> implements ListInterface<T>
{
  private final T[] stack;

  /** Creates an empt array with fixed capacit of 10. */
  public FixedSizeArrayList()
  {
    
  } // end constructor

  /** Add an entry to the end of the List.
      The list size will be increased by 1.
      Other item positions will be unaffected.
      @param item  The object to be added. */
  public void add(T item);
  {

  } // end add

  /** Add an entry to the specificed position of the list.
      The list size will be increased by 1.
      Other item positions at or below specified position will be effected.
      @param item  The object to be added.
      @param position  The location the item should be placed in the list.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public void add(int position, T item)
  {

  } // end add

  /** Remove an entry at the specified position of the list.
      The list size will be decreased by 1.
      Other item positions at or below specified position will be effected.
      @param position  The location of item to be removed.
      @return  A reference to the removed entry.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T remove(int position)
  {

  } // end remove

  /** Removes all entries from list. */
  public void clear()
  {

  } // end clear

  /** Replaces the entry at the specificed position with a new entry.
      @param position  The location of item to be replaced.
      @param item  The new entry to replace old entry.
      @return  The original entry that was replaced.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T replace(int position, T item)
  {

  } // end replace

  /** Retrieves the entry at the specificed position of the list.
     @param position  The specified location of entry.
     @return  A reference to the indicated entry.
     @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T view(int position)
  {

  } // end view

  /** See whether this list contains a given entry.
      @param item  The object that is the desired entry.
      @return  True if the list contains the item, false if not. */
  public boolean contains(T item)
  {

  } // end contains

  /** Gets the length of the list.
      @return  The integer number of entries currently in the list. */
  public int getLength()
  {

  } // end getLength

  /** Checks whether the list is empty.
      @return  True if the list is empty, false if not. */
  public boolean isEmpty()
  {

  } // end isEmpty

  /** Retrieves all entries in the order in which they occur in the list.
      @return  A newly created array of all entries in the list. */
  public T[] toArray()
  {

  } // end toArray
} // end of FixedSizeArrayList
