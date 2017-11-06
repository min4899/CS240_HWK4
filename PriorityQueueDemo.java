public class PriorityQueueDemo
{
  public static void main(String[] args)
  {
    System.out.println("TESTING LINKED PRIORITY QUEUE");
    LinkedPriorityQueue queue = new LinkedPriorityQueue();
    System.out.println("Create new queue for LinkedPriorityQueue");

    System.out.println("Adding items");
    queue.add('a');
    queue.add('b');
    queue.add('c');
    queue.add('d');
    System.out.println("Added 4 items");
    System.out.println(queue.toString());

    System.out.println("Deleting first 2 entries");
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());
    System.out.println("First Entry: " + queue.peek());
    System.out.println(queue.toString());

    System.out.println("Adding 8 more items");
    queue.add('y');
    queue.add('m');
    queue.add('g');
    queue.add('z');
    queue.add('i');
    queue.add('x');
    queue.add('z');
    queue.add('m');
    System.out.println(queue.toString());

    System.out.println("Clearing queue");
    queue.clear();
    System.out.println("First Entry: " + queue.peek());
    System.out.println(queue.toString());

    System.out.println("Adding 1 item");
    queue.add('B');
    System.out.println("First Entry: " + queue.peek());
    System.out.println(queue.toString());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removing from empty list, result is: " + queue.remove());

    System.out.println("Adding: M, I, N, W, O, O");
    queue.add('M');
    queue.add('I');
    queue.add('N');
    queue.add('W');
    queue.add('O');
    queue.add('O');
    System.out.println(queue.toString());
/*
    System.out.println("Adding b");
    queue.add('b');
    System.out.println(queue.toString());

    System.out.println("Adding z");
    queue.add('z');
    System.out.println(queue.toString());

    System.out.println("Adding a");
    queue.add('a');
    System.out.println(queue.toString());

    System.out.println("Adding c");
    queue.add('c');
    System.out.println(queue.toString());

    System.out.println("Adding x");
    queue.add('x');
    System.out.println(queue.toString());

    System.out.println("Adding y");
    queue.add('y');
    System.out.println(queue.toString());

    System.out.println("Adding d");
    queue.add('d');
    System.out.println(queue.toString());

    System.out.println("Adding x");
    queue.add('x');
    System.out.println(queue.toString());

    System.out.println("Adding c");
    queue.add('c');
    System.out.println(queue.toString());
*/
/*
    //number
    System.out.println("Adding 2");
    queue.add(2);
    System.out.println(queue.toString());

    System.out.println("Adding 10");
    queue.add(10);
    System.out.println(queue.toString());

    System.out.println("Adding 1");
    queue.add(1);
    System.out.println(queue.toString());

    System.out.println("Adding 4");
    queue.add(4);
    System.out.println(queue.toString());

    System.out.println("Adding 8");
    queue.add(8);
    System.out.println(queue.toString());

    System.out.println("Adding 6");
    queue.add(6);
    System.out.println(queue.toString());

    System.out.println("Adding 3");
    queue.add(3);
    System.out.println(queue.toString());

    System.out.println("Adding 8");
    queue.add(8);
    System.out.println(queue.toString());

    System.out.println("Adding 4");
    queue.add(4);
    System.out.println(queue.toString());
*/
  } // end main
} // end of PriorityQueueDemo
