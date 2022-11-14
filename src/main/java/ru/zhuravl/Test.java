package ru.zhuravl;

public class Test {
    List list = new List();
    LinkedList linkedList = new LinkedList();
    Queue queue = new Queue();

    Fixture fixt = new Fixture();

    void printList() {
        System.out.println("--------------");
        System.out.println("from List: " + list.createNewList((byte) 15));;
        System.out.println("--------------");
    }

    void printLinkedList() {
        linkedList.createNewLinkedList();
    }

    void printQueue() {
        queue.printQueue();
    }

}
