import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdIn;
import edu.prince.cs.algs4.StdOut;


public class Deque<Item> implements Iterable<Item> {

    private Node first = null;
    private Node last = null;
    private int size = 0; 


    private class Node {
        private Item item;
        private Node next;
        private Node prev;
    }

    //construct an empty queue
    public Deque(){
    }

    //is the deque empty?
    public boolean isEmpty(){
        return(size == 0);
    }

    //return the number of items on the deque
    public int size(){
        return size;
    }

    //add the item to the front
    public void addFirst(Item item){

    }

    //add the item to the back
    public void addLast(Item item){

    }

    //remove and return the item from the front
    public Item removeFirst(){
        Item item = first.item;
        return item;
    }
    
    //remove and return the item from the back
    public Item removeLast(){
        Item item = last.item;
        return item;
    }

    //return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
        return null;
    }

    private class DequeIterator implements Iterator<Item>{

    }

    public static void main(String[] args){
        
    }
}