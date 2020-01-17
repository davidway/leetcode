public class LeetCode1302 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        // [1,2,3,4,5,null,6,7,null,null,null,null,8]
       Node node =  root.createNode(root.root,1);
        node = root.createNode(node,2);
        node =  root.createNode(node,3);
        node =  root.createNode(node,4);
        node =  root.createNode(node,5);
        node =  root.createNode(node,0);
        node = root.createNode(node,6);
        node = root.createNode(node,7);
        node = root.createNode(node,0);
        node = root.createNode(node,0);
        node = root.createNode(node,0);
        node = root.createNode(node,0);
        node = root.createNode(node,8);
        root.travel(node,0);
        //int result = deepestLeavesSum(root);
        //System.out.format("result=%s,result==15 is %s", result, result == 15);
    }

    private static int deepestLeavesSum(TreeNode root) {
        return 0;
    }

}

class TreeNode {
    Node root;
    int level=0;
    public void travel(Node root,int level){
        while ( root!=null){
            do{
                System.out.print(" - ");
                level--;
            }while (level>0);
            System.out.println(root.data);
            travel(root.left,level+1);
            travel(root.right,level+1);
        }
    }
    public Node createNode(Node node, int data) {
        if (node == null) {
            Node tempNode = new Node();
            tempNode.data=data;

            if ( node==null){
                node = tempNode;
            }
            if ( node.left==null){
                node.left = tempNode;
            }else if ( node.right==null){
                node.right=tempNode;
            }

        } else if (node.left == null) {
            node =createNode(node.left, data);

        } else if (node.right == null) {
            node =createNode(node.right, data);

        }
        return node;
    }
}

class Node {
    Node left;
    Node right;
    int data;

}