package ru.zhuravl;

import ru.zhuravl.List;

public class Test {
    List list = new List();
    Fixture fixt = new Fixture();

    void printList() {
        System.out.println("--------------");
        System.out.println("from List: " + list.createNewList((byte) 15));;
        System.out.println("--------------");
    }

}
