public class Main
{
    public static void main(String[] args)
    {
        Node root=new Node(6);
        BinaryTree bnt=new BinaryTree(root);
        Node n1=new Node(3);
        Node n2=new Node(9);
        Node n3=new Node(1);
        Node n4=new Node(5);
        Node n5=new Node(7);
        Node n6=new Node(11);
        bnt.insert(n1);
        bnt.insert(n2);
        bnt.insert(n3);
        bnt.insert(n4);
        bnt.insert(n5);
        bnt.insert(n6);
        for(Node item: bnt.bfsTraverse())
        {
            System.out.print(item.getValue());
        }







    }
}
