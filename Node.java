public class Node<T,D,Y,J> {
        T title;
        D description;
        Y year;
        J genre;
        Node<T,D,Y,J> next;
        public Node(T title,D description,Y year,J genre){
          this.title=title;
          this.description=description;
          this.year=year;
          this.genre=genre;
          this.next=null;
        }
}
