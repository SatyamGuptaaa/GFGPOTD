class Count {
  int count = 0;
}
class Solution {
  Node root;
  Count ct = new Count();
  boolean countSingleRec(Node node, Count c) {
    if (node == null)
      return true;

    boolean left = countSingleRec(node.left, c);
    boolean right = countSingleRec(node.right, c);

    if (left == false || right == false)
      return false;

    if (node.left != null && node.data != node.left.data)
      return false;

    if (node.right != null && node.data != node.right.data)
      return false;

    c.count++;
    return true;
  }
  int singlevalued() {
    return singlevalued(root);
  }

  public int singlevalued(Node root) {
    countSingleRec(root, ct);
    return ct.count;
  }
}
