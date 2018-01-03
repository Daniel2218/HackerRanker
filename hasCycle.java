boolean hasCycle(Node head) {
  Node current = head;
  Node currentFast = head;

  while(currentFast != null) {
    current = current.next;
    currentFast = currentFast.next.next;

    if(current == currentFast) {
      return true;
    }
  }

  return false;
}
