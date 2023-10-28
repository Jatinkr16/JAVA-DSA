public class Minimum_distance_between_two_nodes {
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

public static Node lca(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }

        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);

        if(left==null){
            return right;
        }

        if(right==null){
            return left;
        }

        return root;
    }
    
    public static int getDis(Node root, int n){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int leftdis=getDis(root.left, n);
        int rightdis=getDis(root.right, n);

        if(leftdis==-1 && rightdis==-1){
            return 0;
        } else if(leftdis==-1){
            return rightdis+1;
        } else{
            return leftdis+1;
        }

    }

    public static int minDis(Node root, int n1, int n2){

        Node lca=lca(root, n1, n2);
        int dist1=getDis(lca,n1);
        int dist2=getDis(lca,n2);

        return dist1+dist2;

    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(lca(root, 4, 5).data);
       
    }
}
