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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){       //空树
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>(); //最终返回列表

        LinkedList<TreeNode> node_queue = new LinkedList<TreeNode>();  // 节队列，里面存放每一行的node
        node_queue.addLast(root);
        node_queue.addLast(null);  //用null来标记这一行已结束

        LinkedList<Integer> level_list = new LinkedList<>();  // level链表,用来储存单一行的节点

        boolean is_from_left = true;  //是否是从左往右的顺序

        while(node_queue.size()>0){     //当node队列不为空时
            TreeNode curr_node = node_queue.pollFirst();    //从队列中pollFirst
            if(curr_node != null){    //当前node不为null时
                if(is_from_left){
                    level_list.addLast(curr_node.val); //将当前node的值从后往前加入level链表
                }
                else{
                    level_list.addFirst(curr_node.val); //将当前node的值从前往后加入level链表
                }
                if(curr_node.left != null){
                    node_queue.addLast(curr_node.left);   //将当前node的左子节加入node队列，准备下一行
                }
                if(curr_node.right != null){
                    node_queue.addLast(curr_node.right);  //将当前node的右子节加入node队列，准备下一行
                }
            }
            else{
                res.add(level_list);  //如果遇到null node,则当前行以结束，res加入当前level
                level_list = new LinkedList<Integer>(); 

                if(node_queue.size() > 0){
                    node_queue.addLast(null);
                }
                is_from_left = !is_from_left;
            }
        }
        return res;
    }
}