package bartkoo98;

import java.util.Arrays;

class OwnContainer{

    private static final int INITIAL_CAPACITY = 10;
    private int capacity = INITIAL_CAPACITY;
    private int elementData[]={};
    private int size = 0;


    public OwnContainer() {
        elementData = new int[INITIAL_CAPACITY];
    }

    public OwnContainer(int _capacity) {
        elementData = new int[_capacity];
    }

    public void set(int index, int value) {
        if ( index <0 || index>= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        elementData[index] = value;
    }

    public void add(int i) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = i;
    }


    public int get(int index) {
        if ( index <0 || index>= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return elementData[index];
    }


    public int[] getElementData() {
        return elementData;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public Object remove(int index) {
        if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        Object removedElement=elementData[index];
        for(int i=index;i<size - 1;i++){
            elementData[i]=elementData[i+1];
        }
        size--;   //reduce size of VectorCustom after removal of element.

        return removedElement;
    }



    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }


    public void display() {
        System.out.print("Displaying list : ");
        for(int i=0;i<size;i++){
            System.out.print(elementData[i]+" ");
        }
    }


}