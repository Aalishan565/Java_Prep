package tree;

import java.util.LinkedList;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        java.util.Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }

    public void bsf(TreeNode root) {
        if (root == null) {
            return;
        }
        java.util.Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

    }

    public void dfs(TreeNode node) {
        if (root == null) {
            return;
        }
        System.out.println(node.data);
        if (node.left != null) {
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }

    public void createStaticTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;

    }

    public TreeNode addNode(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }
        if (node.data > data) {
            node.left = addNode(node.left, data);
        } else if (node.data < data) {
            node.right = addNode(node.right, data);
        }
        return node;
    }

    public int sumOfTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.data + sumOfTree(node.left) + sumOfTree(node.right);
    }

    public int numberOfNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + numberOfNodes(node.left) + numberOfNodes(node.right);
    }

    public boolean searchData(TreeNode node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        } else if (node.data < key) {
            return searchData(node.right, key);
        } else if (node.data > key) {
            return searchData(node.left, key);
        }
        return false;
    }

    public TreeNode mirrorImage(TreeNode node) {
        if (node==null){
            return null;
        }
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        if (node.left!=null){
            mirrorImage(node.left);
        }
        if (node.right!=null){
            mirrorImage(node.right);
        }
        return node;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        // binaryTree.createTree();
       /* binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);*/
        binaryTree.root = binaryTree.addNode(binaryTree.root, 20);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 16);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 30);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 40);
        //binaryTree.inOrder(binaryTree.root);
        // System.out.println(binaryTree.searchData(binaryTree.root, 29));
        // System.out.println(binaryTree.sumOfTree(binaryTree.root));
        //binaryTree.height(binaryTree.root);
       TreeNode node=binaryTree.mirrorImage(binaryTree.root);
        binaryTree.preOrder(node);
        //System.out.println(binaryTree.numberOfNodes(binaryTree.root));


    }
}
