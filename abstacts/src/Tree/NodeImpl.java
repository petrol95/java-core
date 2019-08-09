package Tree;

import java.util.Objects;

public class NodeImpl implements Node {
    private Person data;
    private Node leftChild;
    private Node rightChild;

    public NodeImpl(int id, String name, int age) {
        data = new Person(id, name, age);
    }

    @Override
    public int getKey() {
        return data.getId();
    }

    @Override
    public Node getLeftChild() {
        return leftChild;
    }

    @Override
    public void setLeftChild(Node node) {
        leftChild = node;
    }

    @Override
    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public void setRightChild(Node node) {
        rightChild = node;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public boolean isLeftChild(Node parent) {
        if (this.getKey() < parent.getKey())
            return true;
        else
            return false;
    }

}
