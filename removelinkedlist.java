import java.util.LinkedList;

public class RemoveLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Grape");

        System.out.println("Linked list before removing: "+linkedList);

        linkedList.clear();

        System.out.println("Linked list after removing all elements: "+linkedList);
    }
}
