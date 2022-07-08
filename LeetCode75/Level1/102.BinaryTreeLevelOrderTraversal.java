/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> temp = new ArrayList();
        List<TreeNode> nodeList = new ArrayList();
        if(root == null)
            return list;
        addList(nodeList,root);
        temp.add(root.val);
        list.add(temp);
        levelOrder(nodeList,list);
        return list;
    }
    
    
    public void levelOrder(List<TreeNode> nodeList, List<List<Integer>> list) {
        List<Integer> temp = new ArrayList();
        List<TreeNode> newNodeList = new ArrayList();
        if(nodeList.isEmpty())
            return;
        for(TreeNode x : nodeList){
            temp.add(x.val);
            addList(newNodeList,x);
        }
        nodeList.clear();
        list.add(temp);
        levelOrder(newNodeList,list);
    }
    
    
    public void addList (List<TreeNode> nodeList, TreeNode root){
        if(root.left != null){
            nodeList.add(root.left);
        }
        if(root.right != null){
            nodeList.add(root.right);
        }
    }
    
}102. Binary Tree Level Order Traversal
