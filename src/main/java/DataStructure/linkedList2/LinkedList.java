package DataStructure.linkedList2;

public class LinkedList {
    private Node first;
    private Node last;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    @Override
    public String toString() {
        return "[" + first + "]";

    }

    public void addFirst(int x) {
        if (first == null && last == null) {
            Node newFirst = new Node();
            newFirst.setValue(x);
            first = newFirst;
            last = first;
        } else {
            Node newFirst = new Node();
            newFirst.setValue(x);
            newFirst.setNext(first);
            first = newFirst;
        }
    }

    public void addLast(int x) {
        if (first == null && last == null) {
            Node newLast = new Node();
            newLast.setValue(x);
            last = newLast;
            first = last;
        } else {
            Node newLast = new Node();
            newLast.setValue(x);
            last.setNext(newLast);
            last = newLast;
        }
    }

    public void deleteFirst() {
        if (first != null && last != null) {
            Node currentSecond = first.getNext();
            first.setNext(null);
            first = currentSecond;
        }
    }

    public void deleteLast() {
        if (first != null && last != null) {
            Node currentNode = first;
            while (currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            last = currentNode;
        }
    }

    public int indexOf(int x) {
        if (first != null && last != null) {
            int index = 0;
            Node currentNode = first;
            while (currentNode.getValue() != x) {
                currentNode = currentNode.getNext();
                if (currentNode.getNext() == null) return -1;
                index++;
            }
            return index;
        }
        return -1;
    }

    public boolean contains(int x) {
        if (first != null && last != null) {
            Node currentNode = first;
            while (currentNode.getNext() != null) {
                int value = currentNode.getValue();
                if (value == x) return true;
                currentNode = currentNode.getNext();
            }
            if (currentNode.getValue() == x) return true;
        }
        return false;
    }

    public int getSize() {
        int size = 0;
        if (first != null && last != null) {
            Node currentNode = first;
            while (currentNode.getNext() != null) {
                Node next = currentNode.getNext();
                currentNode=next;
                size++;
            }
            return ++size;
        }
        return size;
    }

    public void reverse() {
        if (first != null) {
            Node previousNode=null;
            Node currentNode = first;
            while(currentNode!=null){
                Node next = currentNode.getNext();
                currentNode.setNext(previousNode);
                previousNode = currentNode;
                currentNode=next;
            }
            Node temp;
            temp=first;
            first=last;
            last=temp;
        }
    }
    public int getKthNodeFromTheEnd(int k){
        Node a=first;
        Node b=first;
        for(int i=0;i<k-1;i++){
            b=b.getNext();
        }
        while(b!=last){
            a=a.getNext();
            b=b.getNext();
        }
        return a.getValue();

    }
}
