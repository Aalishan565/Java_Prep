package tree;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

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

    private static Map<Integer, List<Integer>> mapVerticalDistance = null;
    public static TreeMap<Integer, Integer> ht = new TreeMap<>();
    ;
    private static List<Integer> list;

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
        //  binaryTree.verticalOrderOfBTree(binaryTree.root);
        // binaryTree.diameterOfTree(binaryTree.root);
        //  System.out.println(binaryTree.minimumDepth(binaryTree.root));
        // System.out.println(binaryTree.diameterOfTree(binaryTree.root));
        binaryTree.bottomView(binaryTree.root);
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

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }

    public int diameterOfTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lHeight = height(node.left);
        int RHeight = height(node.right);
        int leftDia = diameterOfTree(node.left);
        int rightDia = diameterOfTree(node.right);
        return Math.max(lHeight + RHeight + 1, Math.max(leftDia, rightDia));
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

    public void verticalOrderOfBTree(TreeNode root) {
        if (null == mapVerticalDistance) {
            mapVerticalDistance = new TreeMap<>();
        } else {
            mapVerticalDistance.clear();
        }
        verticalOrder(root, 0);
        mapVerticalDistance.forEach((k, v) -> System.out.println("Nodes at distance " + k + " = " + v));
    }

    private void verticalOrder(TreeNode root, int distance) {
        if (root == null) {
            return;
        }
        List<Integer> list;
        if (mapVerticalDistance.containsKey(distance)) {
            list = mapVerticalDistance.get(distance);
        } else {
            list = new ArrayList<>();
        }
        list.add(root.data);
        mapVerticalDistance.put(distance, list);
        verticalOrder(root.left, distance - 1);
        verticalOrder(root.right, distance + 1);

    }

    public void topView(TreeNode root, int level) {
        if (root == null)
            return;
        // create a queue for level order traversal
        Queue<BinaryTree.QueuePack> queue = new LinkedList<>();
        // add root with level 0 (create a queue item pack)
        queue.add(new QueuePack(level, root));
        while (!queue.isEmpty()) {
            QueuePack q = queue.remove();
            // take out the items from the package
            TreeNode tnode = q.tnode;
            int lvl = q.level;

            // check if this is the first node you are visiting at the level
            if (ht.containsKey(lvl)) {

            } else {// print it, its the first element at his level
                System.out.print(tnode.data + "   ");
                ht.put(lvl, tnode.data);
            }

            // add the left and right children of visiting nodes to the queue
            if (tnode.left != null) {
                queue.add(new QueuePack(lvl - 1, tnode.left));
            }
            if (tnode.right != null) {
                queue.add(new QueuePack(lvl + 1, tnode.right));
            }
        }

    }

    public void bottomView(TreeNode node) {

        if (null == mapVerticalDistance) {
            mapVerticalDistance = new TreeMap<>();
        } else {
            mapVerticalDistance.clear();
        }
        verticalOrder(node, 0);
        mapVerticalDistance.forEach((k, v) -> System.out.println("Nodes at distance " + k + " = " + v.get(v.size()-1)));


    }

    static class QueuePack {
        int level;
        TreeNode tnode;

        public QueuePack(int level, TreeNode tnode) {
            this.level = level;
            this.tnode = tnode;
        }
    }
}
