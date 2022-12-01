package ru.zhuravl;

import java.util.Arrays;
import ru.zhuravl.InterfaceList;

public class Test {

    public void test_1_single_add() {
        System.out.println("\n---------------------------------------------------------");

        LinkList linkList = new LinkList();


        String data[] = {"11", "22", "33", "44", "55", "66"};

        for (String item: data) {
            linkList.add(item);
        }

        linkList.printList();


//        Fixture fixt = new Fixture();
//
//        if (Arrays.equals(arr, fixt.arrEthalon)) System.out.println("Тест пройден!");
//        else System.out.println("Тест НЕ пройден! :-((( ");
//        assert (Arrays.equals(arr, fixt.arrEthalon));
//        System.out.println(Arrays.toString(arr));

    }

    public void addNodeAndPrint(LinkList linkList, String data){
        System.out.printf("%-40s %-50s\n", data + " - linkList.tail:", ((LinkList) linkList).tail);
        System.out.printf("%-40s %-50s\n", data + " - linkList.head:", ((LinkList) linkList).head);
        System.out.printf("%-40s %-50s\n", data + " - linkList.head.value:", ((LinkList) linkList).head.value);
        System.out.println("-----");
    }

}
