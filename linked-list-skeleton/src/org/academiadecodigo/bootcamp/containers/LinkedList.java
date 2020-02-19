package org.academiadecodigo.bootcamp.containers;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Integer>{

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(T data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public T get(int index) {
        Node iterator = head;
        if(index < 0 || index > size()) {
            return null;
        }
        for(int i = 0; i < size(); i++) {
            iterator = iterator.getNext();

            if (i == index) {
                return (T) iterator.getData();
            }
        }
        //throw new UnsupportedOperationException();
        return null;
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(T data) {
        int idx = 0;
        Node iterator = head.getNext();

        for(int i = 0; i < size(); i++){

            if(iterator.getData() != null){
                if(iterator.getData() == data){
                    return idx;
                }
                iterator = iterator.getNext();
                idx++;
            }
        }
        return -1;
        //throw new UnsupportedOperationException();
    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(T data) {
        Node iterator = head.getNext();
        Node previousIterator = head;
        boolean condition = false;

        for(int i = 0; i < size(); i++){
            if(iterator.getData() == null) {
                break;
            }
            if(iterator.getData() == data){
                previousIterator.setNext(iterator.getNext());
                length--;
                condition = true;
                break;
            }
                iterator = iterator.getNext();
                previousIterator = previousIterator.getNext();
        }
        return condition;
        //throw new UnsupportedOperationException();

    }

    @Override
    public Iterator iterator() {
        return new MyCoolIterator();
    }

    private class Node<T> {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private class MyCoolIterator implements Iterator{

        Node itr = head.getNext();

        @Override
        public boolean hasNext() {
            while(itr != null){
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            while(itr.getData() != null){
                T result = (T) itr.getData();
                itr = itr.getNext();
               return result ;
            }
            return null;
        }

        @Override
        public void remove() {

        }
    }

}
