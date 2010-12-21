// BinaryTree.java

import java.util.*;
public class BinaryTree {


    public static void main( String[] args )
    {
        BinaryTree bt = new BinaryTree(); 
        bt.insert( 4 );
        bt.insert( 6 );
        bt.insert( 3 );
        bt.insert( 5 );
        //bt.insert( 8 );
        bt.insert( 7 );
        bt.insert( 2 );
        bt.insert( 1 );
        //bt.printTree();
        //bt.printLevelOrder();
        //bt.printDFS();

        //bt.printPaths();
        //bt.mirror();
        //bt.printLevelOrder();
        String str = bt.isBST() ? "is BST " : "not a BST ";
        System.out.println( str );
    
    }
    // Root node pointer. Will be null for an empty tree.
    private Node root;

    public boolean isBST()
    {
        int max = Integer.MAX_VALUE; 
        int min = Integer.MIN_VALUE; 
        System.out.printf("max %s , min %s\n" , Integer.toBinaryString(1) , Integer.toBinaryString(-1)  );
        //return isBST(root); 
        return true;
    }

    private boolean isBST( Node node ) {
        return true;
    
    }

    public void mirror()
    {
        mirror( root );
    }

    private void mirror( Node node)
    {
        if( node == null ) return ;

        mirror(node.left);
        mirror(node.right);

        Node temp = node.left ;
        node.left = node.right ;
        node.right = temp ;

    }



    public void printPaths()
    {

        int[] path = new int[1000];
        printPaths( root, path , 0) ;
    }

    private void printPaths( Node node , int[] path , int pathLen )
    {
        if( node == null ) return ; 

        path[pathLen] = node.data ;
        pathLen++ ;

        if( node.left == null && node.right == null)
            printArray( path , pathLen);
        else{
            printPaths( node.left , path , pathLen);
            printPaths( node.right, path , pathLen);
        }
    
    }

    private void printArray( int[] path , int len )
    {
        for( int i = 0 ; i< len ; i++)
            System.out.print( " " + path[i] );
        System.out.println();
    }



    public void printDFS() 
    {
        Stack<Node> s = new Stack<Node>();

        if( root == null ) return ;

        s.push(root);
        
        while( !s.isEmpty())
        {
            Node top = s.pop();
            System.out.print("  " + top.data );

            if( top.right != null )
                s.push(top.right );
            if( top.left != null )
                s.push(top.left);
        }
    
        System.out.println();
    }

    public void printLevelOrder()
    {
        printLevelOrder(root);
        System.out.println();
    }

    private void printLevelOrder( Node node)
    {

        if( node == null ) return ;

        LinkedList<Node> queue = new LinkedList<Node>();
        //LinkedList<Node> nextLevel      = new LinkedList<Node>();
        int currentLevel = 0 ;
        int nextLevel = 0 ;

        queue.offer( node);
        currentLevel = 1;

        while( !queue.isEmpty() )
        {
            Node newnode = queue.poll();
            currentLevel--;

            System.out.print(" " + newnode.data );

            if( newnode.left != null )
            {
                queue.offer( newnode.left);
                nextLevel++;
            }

            
            if( newnode.right != null )
            {
                queue.offer( newnode.right );
                nextLevel++;
            }

            if( currentLevel == 0) 
            {
                currentLevel = nextLevel ; 
                System.out.println();
                nextLevel = 0;
            }
        
        }

    
    
    }

    /**
      Prints the node values in the "inorder" order.
      Uses a recursive helper to do the traversal.
      */
    public void printTree() {
        printTree(root);
        System.out.println();
    }

    private void printTree(Node node) {
        if (node == null) return;

        // left, node itself, right
        printTree(node.left);
        System.out.print(node.data + "  ");
        printTree(node.right);
    }



    /*
       --Node--
       The binary tree is built using this nested node class.
       Each node stores one data element, and has left and right
       sub-tree pointer which may be null.
       The node is a "dumb" nested class -- we just use it for
       storage; it does not have any methods.
       */
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    /**
      Creates an empty binary tree -- a null root pointer.
      */
    public void BinaryTree() {
        root = null;
    }


    /**
      Returns true if the given target is in the binary tree.
      Uses a recursive helper.
      */
    public boolean lookup(int data) {
        return(lookup(root, data));
    }


    /**
      Recursive lookup  -- given a node, recur
      down searching for the given data.
      */
    private boolean lookup(Node node, int data) {
        if (node==null) {
            return(false);
        }

        if (data==node.data) {
            return(true);
        }
        else if (data<node.data) {
            return(lookup(node.left, data));
        }
        else {
            return(lookup(node.right, data));
        }
    }


    /**
      Inserts the given data into the binary tree.
      Uses a recursive helper.
      */
    public void insert(int data) {
        root = insert(root, data);
    }


    /**
      Recursive insert -- given a node pointer, recur down and
      insert the given data into the tree. Returns the new
      node pointer (the standard way to communicate
      a changed pointer back to the caller).
      */
    private Node insert(Node node, int data) {
        if (node==null) {
            node = new Node(data);
        }
        else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
        }

        return(node); // in any case, return the new pointer to the caller
    }
}
