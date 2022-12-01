package ru.zhuravl;

import java.util.Arrays;
import ru.zhuravl.InterfaceList;

public class Test {
    public void test_1_single_add() {
        System.out.println("\n---------------------------------------------------------");

        LinkList linkList = new LinkList();


        String data[] = {"11", "22", "33", "44", "55", "66", "77", "88"};

        for (String item: data) {
            linkList.add(item);
            addNodeAndPrint(linkList, item);
        }
        linkList.size();
        linkList.printList();
        linkList.size();
        linkList.removeHead();
        linkList.size();
        linkList.removeHead();
        linkList.size();
        linkList.removeHead();
        linkList.size();
        linkList.get(2);
        linkList.get(0);
        linkList.get(6);
        linkList.get(8);
        linkList.get(16);
        linkList.get(5);
        linkList.get(4);

    }


    public static void addNodeAndPrint(LinkList linkList, String data){
        System.out.printf("%-25s %-35s\n", data + " - linkList.tail:", ((LinkList) linkList).tail);
        System.out.printf("%-25s %-35s\n", data + " - linkList.tail.next:", ((LinkList) linkList).tail.next);
        System.out.printf("%-25s %-35s\n", data + " - linkList.head:", ((LinkList) linkList).head);
        System.out.printf("%-25s %-35s\n", data + " - linkList.head.value:", ((LinkList) linkList).head.value);
        System.out.println("-----");
    }
}













//        Fixture fixt = new Fixture();
//
//        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
//        else System.out.println("Тест НЕ пройден! :-((( ");
//        assert (Arrays.equals(arr, fixt.arrEthalon));
//        System.out.println(Arrays.toString(arr));
