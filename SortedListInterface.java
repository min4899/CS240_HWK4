/**
   An interface for the ADT SORTED LIST.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public interface SortedListInterface<T extends Comparable<? super T>>
{
  /** Add an entry to the List. Then sorts the list.
      The list size will be increased by 1.
      Other item positions at or below specified position will be effected.
      @param item  The object to be added. */
  public void add(T item);

  /** Remove an entry at the specified position of the list.
      The list size will be decreased by 1.
      Other item positions at or below specified position will be effected.
      @param position  The location of item to be removed.
      @return  A reference to the removed entry.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T remove(int position);

  /** Remove a specified entry from the list.
      The list size will be decreased by 1.
      Other item positions at or below specified position will be effected.
      @param item  The requested item to be removed.
      @return  A reference to the removed entry.
      @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T remove(T item);

  /** Searches list for the requested item and returns its position.
      @param item  The requested item to get position for.
      @return  The position of the item, negative number is returned if nothing is found. */
  public int getPosition(T item);

  /** Removes all entries from list. */
  public void clear();

  /** Retrieves the entry at the specificed position of the list.
     @param position  The specified location of entry.
     @return  A reference to the indicated entry.
     @throws  IndexOutOfBoundException if either position < 1 or position > getLength() + 1. */
  public T view(int position);

  /** See whether this list contains a given entry.
      @param item  The object that is the desired entry.
      @return  True if the list contains the item, false if not. */
  public boolean contains(T item);

  /** Gets the length of the list.
      @return  The integer number of entries currently in the list. */
  public int getLength();

  /** Checks whether the list is empty.
      @return  True if the list is empty, false if not. */
  public boolean isEmpty();

  /** Retrieves all entries in the order in which they occur in the list.
      @return  A newly created array of all entries in the list. */
  public T[] toArray();
} // end of SortedListInterface
