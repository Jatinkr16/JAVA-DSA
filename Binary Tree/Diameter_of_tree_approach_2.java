public class Diameter_of_tree_approach_2 {
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

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0, 0);
        }

        Info leftdiam=diameter(root.left);
        Info rightdiam=diameter(root.right);

        int diam=Math.max(Math.max(leftdiam.diam,rightdiam.diam),leftdiam.ht+rightdiam.ht+1 );
        int ht=Math.max(leftdiam.ht,rightdiam.ht)+1;

        return new Info(diam, ht);
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


        System.out.println(diameter(root).diam);
   }
}


