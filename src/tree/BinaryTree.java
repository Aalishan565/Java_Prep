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

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        // binaryTree.createTree();
       /* binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);*/
        binaryTree.root = binaryTree.addNode(binaryTree.root, 8);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 3);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 10);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 1);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 6);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 14);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 4);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 7);
        binaryTree.root = binaryTree.addNode(binaryTree.root, 13);
        //binaryTree.inOrder(binaryTree.root);
        // System.out.println(binaryTree.searchData(binaryTree.root, 29));
        // System.out.println(binaryTree.sumOfTree(binaryTree.root));
        //binaryTree.height(binaryTree.root);
        // TreeNode node = binaryTree.mirrorImage(binaryTree.root);
        // binaryTree.preOrder(node);
        //System.out.println(binaryTree.numberOfNodes(binaryTree.root));
        // System.out.println(binaryTree.maxElement(binaryTree.root));
        //  binaryTree.deleteNode(binaryTree.root, 3);
        // binaryTree.levelOrder(binaryTree.root);
        System.out.println(binaryTree.minimumDepth(binaryTree.root));


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

    public TreeNode deleteNode(TreeNode node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.data) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.data) {
            node.right = deleteNode(node.right, value);
        } else {

            if (node.left == null || node.right == null) {
                TreeNode temp = null;
                temp = node.left == null ? node.right : node.left;
                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }

            } else {
                TreeNode successor = getSuccessor(node);
                node.data = successor.data;
                node.right = deleteNode(node.right, successor.data);
                return node;
            }

        }
        return node;
    }

    private TreeNode getSuccessor(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp = node.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
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

    public int maxElement(TreeNode node) {
        int max = 0;
        if (node != null) {
            int leftMax = maxElement(node.left);
            int rightMax = maxElement(node.right);
            if (leftMax > rightMax) {
                max = leftMax;
            } else {
                max = rightMax;
            }
            if (node.data > max) {
                max = node.data;
            }
        }
        return max;
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

    public TreeNode mirrorImage(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        if (node.left != null) {
            mirrorImage(node.left);
        }
        if (node.right != null) {
            mirrorImage(node.right);
        }
        return node;
    }

    public int minimumDepth(TreeNode root) {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;

        // Base case : Leaf Node. This accounts for height = 1.
        if (root.left == null && root.right == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minimumDepth(root.right) + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minimumDepth(root.left) + 1;

        return Math.min(minimumDepth(root.left), minimumDepth(root.right)) + 1;
    }

    public boolean areIdenticalTrees(TreeNode root1, TreeNode root2) {
        //Checks if both the trees are empty
        if (root1 == null && root2 == null)
            return true;

        //Trees are not identical if root of only one tree is null thus, return false
        if (root1 == null || root2 == null)
            return false;

        //If both trees are not empty, check whether the data of the nodes is equal
        //Repeat the steps for left subtree and right subtree
        if (root1 != null && root2 != null) {
            return ((root1.data == root2.data) &&
                    (areIdenticalTrees(root1.left, root2.left)) &&
                    (areIdenticalTrees(root1.right, root2.right)));
        }
        return false;
    }

}
