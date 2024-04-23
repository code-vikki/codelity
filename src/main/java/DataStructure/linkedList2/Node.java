package DataStructure.linkedList2;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node next;

    @Override
    public String toString() {
        if (next != null) {
            return value + "," + next;
        }
        return value+"";
    }
}
