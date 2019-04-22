package Practice1.HomeWork_6.LinkList;

public class Node {
    private String name;
    private int id;

    public Node(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){

        return "Node{" + "name= " + name + '\'' + ", id= " + id + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Node node=(Node) obj;
        if(this.name==node.getName() && this.id==node.getId()){
            return true;
        }
        return false;
    }
}


