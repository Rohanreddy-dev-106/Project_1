public class Node<T,D,Y,J> {
        T title;
        D decreption;
        Y year;
        J joner;
        Node next;
        public Node(T title,D decreption,Y year,J joner){
          this.title=title;
          this.decreption=decreption;
          this.year=year;
          this.joner=joner;
          this.next=null;
        }
}
