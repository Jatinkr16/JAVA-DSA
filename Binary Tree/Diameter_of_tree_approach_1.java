public class Diameter_of_tree_approach_1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

       return Math.max(lh,rh) + 1;


    }

    public static int diameter(Node root){ // between two leaf
        if(root==null){
            return 0;
        }

        int ldiamtr=diameter(root.left);
        int lheight=height(root.left);
        int rdiamtr=diameter(root.right);
        int rheight=height(root.right);

        int self=lheight+rheight+1;

        return Math.max(self,Math.max(ldiamtr,rdiamtr));
    }
    public static void main(String args[]){
         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
        /// root.left.left=new Node(4);
         root.left.right=new Node(5);
        // root.right.left=new Node(6);
        // root.right.right=new Node(7);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        root.left.right.right.right.right=new Node(8);
        root.left.right.right.right.right.right=new Node(13);
         root.left.right.left=new Node(9);
          root.left.right.left.left=new Node(10);
           root.left.right.left.left.left=new Node(11);
            root.left.right.left.left.left.left=new Node(12);


         System.out.println(diameter(root));
    }
}
