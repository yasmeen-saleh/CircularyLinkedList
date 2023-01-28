public class CircularlyTest {
    public static void main(String[] args) {
      CircularlyLinkedList<Integer> list = new CircularlyLinkedList();
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
      CircularlyLinkedList<Integer> list1 = new CircularlyLinkedList();
        list1.addFirst(5);
        list1.addLast(6);
        list1.addLast(7);

        System.out.println("2-size:");
        System.out.println("The actual size: "+list.size());
        System.out.println("The expected size: "+list.countSize());

        System.out.println("\n3-equals:");
        System.out.println( "The expected: false \n"+"The actual: "+list.equals(list1));
        list1.addLast(8);
        System.out.println( "The expected: true \n"+"The actual: "+list.equals(list1));

        System.out.println("\n4-comparing:");
        System.out.println("The actual result: "+list1.equals(list1,list));
        System.out.println("The expected result: "+"true");

        System.out.println("\n5-Splitting:");
        list.splitting();

        CircularlyLinkedList<Integer> list2 = new CircularlyLinkedList();
            System.out.println("\n6-clone");
            System.out.println("The main list");
            list.print();
            System.out.println("The cloned list");
            list.clone(list2);
            list2.print();



    }
}
