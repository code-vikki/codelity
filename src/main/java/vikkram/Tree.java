package vikkram;

public class Tree {

    Node root;

    public void setRoot(Node root) {
        this.root = root;
    }


    public void insert(int value) {
        if (root == null) {
            setRoot(new Node(value));
            return;
        }

        Node currentNode = root;

        while (currentNode.leftChild != null && currentNode.rightChild != null) {
            if (currentNode.value > value) {
                currentNode = currentNode.leftChild;
            } else if (currentNode.value < value) {
                currentNode = currentNode.rightChild;
            } else {
                return;
            }
        }
        if (currentNode.value > value) {
            currentNode.leftChild = new Node(value);
        } else if (currentNode.value < value) {
            currentNode.rightChild = new Node(value);
        } else {
            return;
        }
    }

    public boolean find(int value) {

        Node currentNode = root;

        while (currentNode.leftChild != null || currentNode.rightChild != null) {
            if (currentNode.value > value) {
                currentNode = currentNode.leftChild;
            } else if (currentNode.value < value) {
                currentNode = currentNode.rightChild;
            } else {
                return true;
            }
        }

        return currentNode.value==value;
    }


    private class Node {

        public Node(int value) {
            this.value = value;
        }


        int value;
        Node leftChild;
        Node rightChild;
    }

}

