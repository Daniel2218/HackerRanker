public class BinarySearchTree {
  Node root;

  public BinarySearchTree() { }

  public void add(int value) {
    this.root = add(value, root);
  }

  public Node add(int value, Node current) {
      if(current == null) {
        current = new Node(value);
      } else if(value > current.value) {
        current.right = add(value, current.right);
      } else {
        current.left = add(value, current.left);
      }

      return current;
  }

  public void inOrder() {
    inOrder(this.root);
  }

  public void inOrder(Node tree) {
    if(tree != null) {
      System.out.println(tree.value);
      inOrder(tree.left);
      inOrder(tree.right);
    }
  }

  class Node {
    Node left, right;
    int value;

    public Node(int value) {
      this.value = value;
    }
  }

  public static void main(String args[]) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.add(5);
    tree.add(4);
    tree.add(6);
    tree.add(2);

    tree.inOrder();
  }
}
