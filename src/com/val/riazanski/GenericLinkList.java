package com.val.riazanski;

import java.util.Iterator;
import java.util.NoSuchElementException;

class GenericLinkList<Stamp> implements Iterable<Stamp> {
//    fields
    private Node<Stamp> head;
    private Node<Stamp> tail;
    private int n;

    //    internal class
    private static class Node<Stamp> {
        private Stamp stamp;
        private Node<Stamp> next;
    }
    public GenericLinkList() {
        head = null;
        tail = null;
        n = 0;
    }
//    methods
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return n;
    }
    public Stamp peek() {
        if ((isEmpty())) throw new NoSuchElementException("GenericLinkList is empty");
        return head.stamp;
    }
    public void add(Stamp st) {
        Node<Stamp> exTail = tail;
        tail = new Node<Stamp>();
        tail.stamp = st;
        tail.next = null;
        if (isEmpty()) {
            head = tail;
        } else {
            exTail.next = tail;
            n++;
        }
    }
    public void removeFirst() {
        if (isEmpty()) throw  new NoSuchElementException("List is empty");
        head = head.next;
        n--;
        if (isEmpty()) tail = null;
    }
 
    public Iterator<Stamp> iterator()  {
        return new LinkedIterator(head);
    }
    private class LinkedIterator implements Iterator<Stamp> {
        private Node<Stamp> current;

        public LinkedIterator(Node<Stamp> head) {
            current = head;
        }

        public boolean hasNext()  {
            return current != null;
        }
        public Stamp next() {
            if (!hasNext()) throw new NoSuchElementException();
            Stamp stamp = current.stamp;
            current = current.next;
            return stamp;
        }
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Stamp stamp : this) {
            s.append(stamp);
            s.append(" -> ");
        }
        return s.toString();
    }


}
