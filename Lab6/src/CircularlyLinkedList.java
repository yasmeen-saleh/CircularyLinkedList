public class CircularlyLinkedList<E> {
        private Node<E>tail=null;
        private int size=0;

        public CircularlyLinkedList() {
        }

        public boolean isEmpty()
        {return size==0;
        }

        public int size()
        {return size;
        }

        public E first()
        {if (isEmpty())return  null;
            return tail.next.element;
        }

        public E last()
        {if (isEmpty())return  null;
            return tail.element;
        }

    public Node<E> firstNode()
    {if (isEmpty())return  null;
        return tail.next;
    }

    public Node<E> lastNode()
    {if (isEmpty())return  null;
        return tail;
    }

    public void addFirstOriginal(E ele)
        {if(size==0){
            tail=new Node<>(ele,null);
            tail.next=tail;
        }else
        {Node<E> x= new Node<>(ele,tail.next);
            tail.next= x;
        }
            size++;
        }

    public void addFirst(E ele)//Q1
    {Node<E> x;
        if(size==0){
        tail=new Node<>(ele,null);
        tail.next=tail;
    }else
    { x= new Node<>(ele,tail.next);
        tail.next= x;
    }

        size++;
    }
        public void addLast(E ele)
        {
            addFirst(ele);
            tail=tail.next;
        }

        public E removeFirst()
        {
            if (isEmpty())return  null;
            Node<E>x=tail.next;
            if (x==tail)
                tail=null;
            else
                tail.next=x.next;
            size--;
            return x.element;
        }

        public void rotate()//done
        {
            if (tail!= null)
                tail=tail.next;
        }

    public int countSize(){//Q2
        Node<E> i;
        int listSize=0;
        if(!isEmpty()) {
            i = tail.next;
            listSize=1;
            while(i.next!=tail.next){
                i=i.next;
                listSize++;
            }}
        return listSize;
    }

    public boolean equals (CircularlyLinkedList list){//done
        if(isEmpty()||list.isEmpty())return false;
        if(size!=list.size)return false;
        Node<E> i= list.tail.next;
        Node <E> j = tail.next;
        while(i.next!=tail.next&&j.next!=tail.next){
            if(i.element!=j.element)
                return false;
            else
            {i= i.next;
                j=j.next;
                }
        }
        return true;
    }

    public void print(){
       Node<E> p = new Node<E>();
        p=tail.next;
        System.out.println(p.getElement());
        while (p.next!= tail.next)
        {p = p.getNext();
            System.out.println(p.getElement());
            }
                 }

    public void clone(CircularlyLinkedList clone){//done
            if(!isEmpty()){
                Node<E> i =tail.next;
            clone.addFirst(i.getElement());
            while (i.next!=tail.next)
            {i=i.next;
                clone.addLast(i.getElement());
            }}
        }

//        public boolean comparison(CircularlyLinkedList m, CircularlyLinkedList l){
//            Node<E> a = m.tail.getNext();
//            Node<E> b = l.tail.getNext();
//            boolean state= false;
//            while (a.getNext()!=m.tail.getNext()){
//                while (b.getNext()!=l.tail.getNext()){
//                    if(a.getElement()==b.getElement())
//                        state = true;
//                        b=b.getNext();}
//                a=a.getNext();
//            }
//            return state;
//        }
//public boolean comparison(CircularlyLinkedList m, CircularlyLinkedList l){
//Node<E> list1=m.tail.next;
//Node<E> list2 = l.tail.next;
//if(!m.isEmpty()&&!l.isEmpty()){
//    while(list1.next!=m.tail.next){
//        if (list1.element!=list2.element){
//            while(list2.next!=l.tail.next){
//            list2=list2.next;}
//        }
//    }
//}
//return false;
//}
    public boolean equals(CircularlyLinkedList list1, CircularlyLinkedList list2){
        if(list1.size != list2.size)
            return false;
        Node head1 = list1.tail.next;
        Node head2 = list2.tail.next;
        int count1 = 0;
        while(count1 < list1.size){
            count1++;
            int count2 = 0;
            Node tra1 = head1;
            Node tra2 = head2;
            while(count2 < list1.size){
                if(tra1.element != tra2.element)
                    break;
                else{
                    tra1 = tra1.next;
                    tra2 = tra2.next;
                }
                count2++;
            }
            if(count2 == list1.size)
                return true;
            head1 = head1.next;
        }
        return false;
    }

    public void splitting(){
            if(!isEmpty()){
            CircularlyLinkedList newList = new CircularlyLinkedList();
        for (int i = 0; i < (size+1)/2; i++) {
            newList.addFirst(removeFirst());
        }
        System.out.println("The first list:"); newList.print();
        System.out.println("The second list:");print(); }
    }

        private static class Node<E>
        {
            E element;
            Node<E>next;

            public Node(E element, Node<E> next) {
                this.element = element;
                this.next = next;
            }

            public Node() {
            }

            public E getElement() {
                return element;
            }

            public void setElement(E element) {
                this.element = element;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }
    }


