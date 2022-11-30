package ru.zhuravl;

import java.util.Arrays;
import ru.zhuravl.InterfaceList;

public class Test {

    public void test_1_single_add() {
        InterfaceList list = new LinkList();

        list.add("1111");
        System.out.println("ADDED SECOND NODE - 1111");
        System.out.printf("1111 - list.tail: %40s \n", ((LinkList) list).tail);
        System.out.printf("1111 - list.currentNode value: %20s \n", ((LinkList) list).currentNode.value);
        System.out.printf("1111 - list.currentNode: %20s \n", ((LinkList) list).currentNode);
        System.out.printf("1111 - list.currentNode position: %20s \n", ((LinkList) list).currentNode.position);
        System.out.printf("1111 - list.currentNode previous: %20s \n", ((LinkList) list).currentNode.previous);
        System.out.println();

        list.add("2222");
        System.out.println("ADDED SECOND NODE - 2222");
        System.out.printf("2222 - list.tail: %40s \n", ((LinkList) list).tail);
        System.out.printf("2222 - list.currentNode value: %20s \n", ((LinkList) list).currentNode.value);
        System.out.printf("2222 - list.currentNode: %20s \n", ((LinkList) list).currentNode);
        System.out.printf("2222 - list.currentNode previous: %20s \n", ((LinkList) list).currentNode.previous);
        System.out.printf("2222 - list.currentNode position: %20s \n", ((LinkList) list).currentNode.position);
        System.out.println();

        list.add("3333");
        System.out.println("ADDED SECOND NODE - 3333");
        System.out.printf("3333 - list.tail: %40s \n", ((LinkList) list).tail);
        System.out.printf("3333 - list.currentNode value: %20s \n", ((LinkList) list).currentNode.value);
        System.out.printf("3333 - list.currentNode: %20s \n", ((LinkList) list).currentNode);
        System.out.printf("3333 - list.currentNode position: %20s \n", ((LinkList) list).currentNode.position);
        System.out.printf("3333 - list.currentNode previous: %20s \n", ((LinkList) list).currentNode.previous);





//        Fixture fixt = new Fixture();
//
//        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
//        else System.out.println("Тест НЕ пройден! :-((( ");
//        assert (Arrays.equals(arr, fixt.arrEthalon));
//        System.out.println(Arrays.toString(arr));

    }


}
