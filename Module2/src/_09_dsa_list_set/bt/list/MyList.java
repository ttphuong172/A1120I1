package _09_dsa_list_set.bt.list;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int size() {
        return this.size;
    }

    public boolean add(E element) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity>=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else
        {
            throw new IllegalArgumentException();
        }
    }
    public void clear(){
        this.size=0;
        for(int i =0;i<elements.length;i++){
            elements[i]=null;
        }
    }
    public  E get (int index){
        return (E) elements[index];
    }

    public void remove(int index){
        if (index<elements.length){
            for(int i=index;i<elements.length-1;i++){
                elements[i]=elements[i+1];
            }
            size--;
        }
    }
}
