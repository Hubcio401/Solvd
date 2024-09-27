package com.solvd.resource;

import java.util.Collection;
import java.util.Objects;

public class CustomLinkedList<E> {

    private static class Node<E>{
        E data;
        Node<E> next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;
    private int size;

    public CustomLinkedList(){
        head = null;
        size = 0;
    }

    public boolean add(E e){
        if (head == null) {
            head = new Node<>(e);
        }
        else {
            Node<E> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>(e);
        }
        size++;
        return true;
    }

    public boolean remove(Object o){
        if (head == null) return false;

        if (head.data.equals(o)){
            head = head.next;
            size--;
            return true;
        }
        Node<E> current = head;
        while (current.next != null && !current.next.data.equals(o)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(Object o){
        Node<E> current = head;
        while (current != null){
            if (current.data.equals(o)){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public boolean containsAll(Collection<?> c){
        for (Object o : c){
            if (!contains(o)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 1;
        Node<E> current = head;
        while (current != null){
            hash = 22 * hash;
            if (current.data == null){
                hash += 0;
            }
            else {
                current.data.hashCode();
            }
        }
        return hash;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLinkedList<?> that = (CustomLinkedList<?>) o;
        return size == that.size && Objects.equals(head, that.head);
    }

    public boolean addAll(Collection <? extends E> c){
        boolean modified = false;
        for (E e : c) {
            if (add(e)){
                modified = true;
            }
        }
        return modified;
    }

    public boolean removeAll(Collection<?> c){
        boolean modified = false;
        for (Object o : c){
            while (remove(o)){
                modified = true;
            }
        }
        return modified;
    }

}
