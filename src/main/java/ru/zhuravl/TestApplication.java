package ru.zhuravl;

import ru.zhuravl.List;
import ru.zhuravl.LinkedList;

public class TestApplication {
    public static void main(String[] args) {
        Test test = new Test();
        Fixture fixture = new Fixture();

        fixture.printFix();

        test.printList();
        test.printLinkedList();
        test.printQueue();

        System.out.println("DONE!!!");
        
    }
}
