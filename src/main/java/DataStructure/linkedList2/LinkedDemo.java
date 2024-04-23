package DataStructure.linkedList2;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println(linkedList);
        linkedList.addLast(8);
        linkedList.addFirst(6);
        linkedList.addFirst(5);
        System.out.println(linkedList.getKthNodeFromTheEnd(3));
//        System.out.println(indexOfValue);
//        System.out.println(linkedList.contains(5)

    }
}
