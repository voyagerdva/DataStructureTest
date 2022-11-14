package ru.zhuravl;

import ru.zhuravl.List;


public class TestApplication {
    public static void main(String[] args) {
        Test test = new Test();
        List list = new List();
        Fixture fixt1 = new Fixture();

        test.printList();

        byte[] arr = list.createNewList((byte) 10);
        System.out.println(arr);



        fixt1.printFix();
        System.out.println("DONE!!!");
    }
}
