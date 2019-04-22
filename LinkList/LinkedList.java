package Practice1.HomeWork_6.LinkList;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {
    ArrayList<Node> myList = new ArrayList<>();


    public boolean remove(Node aNode) {
        for (int i = 0; i < getSize(); i++) {
            if (myList.get(i).equals(aNode)) {
                return myList.remove(aNode);
            }
        }
        return false;
    }

    public void add(Node aNode) {
        if (!isEmpty()) {
            myList.add(aNode);
            return;
        }
        myList.add(aNode);
    }

    public void add(int index, Node aNode) {
        if (index > myList.size() - 1) {
            System.out.println("index not valid");
            return;
        }
        if (isEmpty()) {
            add(aNode);
            return;
        }

        myList.add(index, aNode);
    }


    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public int getSize() {
        return myList.size();
    }

    public void showList() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
