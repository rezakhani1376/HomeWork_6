package Practice1.HomeWork_6.LinkList;

public class Main {
    public static void main(String[] args) {
        Node node1=new Node("s1",1);
        Node node2=new Node("s2",2);
        Node node3=new Node("s3",7);
        Node node4=new Node("s4",8);
        Node node5=new Node("s5",9);
        Node node6=new Node("s6",10);
        Node node7=new Node("s7",11);
        Node node8=new Node("s8",12);
        Node node9=new Node("s9",13);
        LinkedList list = new LinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        list.add(node7);
        list.add(node8);
        list.add(node9);
        list.showList();
        list.remove(new Node("s3",3));
        System.out.println();
        System.out.println();
        list.showList();
        if(list.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List is not empty");
        }
        list.add(4,new Node("s17",17));
        list.showList();
    }
}
