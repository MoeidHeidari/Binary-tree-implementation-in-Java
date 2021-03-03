import java.util.*;
public class BinaryTree
{
    private Node root;



    public BinaryTree(Node root)
    {
        this.setRoot(root);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree()
    {
        this.setRoot(null);
    }

    public void insert(Node newNode)
    {
        if(null == this.root)
        {
            this.root=newNode;
        }
        else if(this.root.getLeft() == null)
        {
            this.root.setLeft(newNode);
        }
        else if(this.root.getRight() == null)
        {
            this.root.setRight(newNode);
        }
        else
        {
            List<Node> siblingNodes=new LinkedList<Node>();
            siblingNodes.add(this.root.getLeft());
            siblingNodes.add(this.root.getRight());
            insert2(siblingNodes,newNode);
        }
    }

    public void insert2(List<Node> siblingNodes,Node newNode)
    {

        List<Node> nextSiblingNodes=new LinkedList<Node>();
        for(Node currentNode: siblingNodes)
        {
            if(currentNode.getLeft()==null)
            {
                currentNode.setLeft(newNode);
                return;
            }
            else if(currentNode.getRight()==null)
            {
                currentNode.setRight(newNode);
                return;
            }
            nextSiblingNodes.add(currentNode.getLeft());
            nextSiblingNodes.add(currentNode.getRight());
        }
        insert2(nextSiblingNodes,newNode);
    }

    public List<Node> bfsTraverse()
    {
        List<Node> bfsList=new LinkedList<Node>();
        Queue<Node> nodeQueue=new LinkedList<Node>();
        nodeQueue.add(this.root);

        while(nodeQueue.size() != 0)
        {
            Node n=nodeQueue.poll();
            bfsList.add(n);
            if(n.getLeft() !=null) nodeQueue.add(n.getLeft());
            if(n.getRight() != null) nodeQueue.add(n.getRight());
        }
        return bfsList;
    }

}
