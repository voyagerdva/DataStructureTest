package ru.zhuravl;

import java.util.Arrays;

public class CheckFunctional {
    public void checkAllMethods() {
        System.out.println("\n\n========== Check add() method(): ");
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        String data1[] = {"11", "22", "33", "44", "55", "66", "77", "88", "99", "X", "XI", "XII"};
        String data2[] = {"44", "33", "22", "11", "X", "XIII"};

        for (String item: data1) {
            linkList1.add(item);
            addNodeAndPrint((LinkList) linkList1, item);
        }
        System.out.println(linkList1.getSize() + "\n-----------------------\n");

        for (String item: data2) {
            linkList2.add(item);
            addNodeAndPrint((LinkList) linkList2, item);
        }
        System.out.println(linkList2.getSize() + "\n-----------------------\n");

//===================================================================================================
        System.out.println("\n\n========== Check addList() method(): ");


        linkList1.addList((LinkList) linkList2);

        for (int i = 0; i < linkList1.getSize(); i++) {
            System.out.printf("%s \n", ((LinkList) linkList1).getNode(i));
        }

        System.out.println(Arrays.toString(linkList1.getListValues()));
        linkList1.printList();

//========================================================================================================
        System.out.println("\n\n========== Check intersect() method(): ");

        InterfaceList linkList3 = linkList1.intersect((LinkList) linkList2);

        System.out.printf("%s %s \n", "size linkList3: ", linkList3.getSize());
        System.out.println(Arrays.toString(linkList3.getListValues()));
        linkList3.printList();


    }


    public static void addNodeAndPrint(LinkList linkList, String data1){
        System.out.printf("%-30s %-35s\n", data1 + " - linkList.tail:", ((LinkList) linkList).getTail());
        System.out.printf("%-30s %-35s\n", data1 + " - linkList.tail.next:", ((LinkList) linkList).getTail().next);
        System.out.printf("%-30s %-35s\n", data1 + " - linkList.head:", ((LinkList) linkList).getHead());
        System.out.printf("%-30s %-35s\n", data1 + " - linkList.head.value:", ((LinkList) linkList).getHead().value);
        System.out.println("-----");
    }
}