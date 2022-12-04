package ru.zhuravl;

import java.util.Arrays;

public class CheckFunctional {
    public void checkAllMethods() {
        System.out.println("\n---------------------------------------------------------");
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

//        String data4[] = {"11", "22", "33", "44", "55", "66", "77", "88", "99", "X", "XI", "XII"};
//        String data5[] = {"55", "33", "11", "99", "X", "XIII"};


        String data3[] = {"44"};

        String data4[] = {"11", "22", "33", "44", "88", "55"};
        String data5[] = {"22", "44", "88"};

        for (String item: data4) {
            linkList1.add(item);
            addNodeAndPrint((LinkList) linkList1, item);
        }
        System.out.println(linkList1.getSize() + "\n======================\n");

        for (String item: data5) {
            linkList2.add(item);
            addNodeAndPrint((LinkList) linkList2, item);
        }
        System.out.println(linkList2.getSize() + "\n======================\n");

//========================================================================================================

        linkList1.printList();
        System.out.println();
        linkList2.printList();
        System.out.println();

        InterfaceList linkList3 = linkList1.intersectList(linkList2);
        System.out.println();



        linkList3.printList();
        System.out.println();
        System.out.println(Arrays.toString(linkList3.getListValues()));


        for (int i = 0; i < linkList3.getSize(); i++) {
            System.out.println(linkList3.getNode(i));
        }


//====================================================================================================
////        linkList1.addList(linkList2);
//        System.out.println(linkList2.getNode(0));
//        System.out.println(linkList2.getNode(1));
//        System.out.println(linkList2.getNode(2));
//        System.out.println();
//
//        linkList1.addList(linkList2);
//        System.out.println();
//        linkList1.printList();
//        System.out.println();
//
//        for (int i = 0; i < linkList1.getSize(); i++) {
//            System.out.println(linkList1.getNode(i));
//
//        }
//
//        System.out.println(Arrays.toString(linkList1.getListValues()));

//===================================================================================================
//        InterfaceList linkList4 = new LinkList();
//        InterfaceList linkList5 = new LinkList();
//
//        for (String item: data3) {
//            linkList4.add(item);
//            addNodeAndPrint(linkList4, item);
//        }
//        System.out.println(linkList4.getSize() + "\n======================\n");
//
//        for (String item: data3) {
//            linkList5.add(item);
//            addNodeAndPrint(linkList5, item);
//        }
//        System.out.println(linkList5.getSize() + "\n======================\n");
//
//        linkList4.addList(linkList5);
//        linkList4.printList();
//
//        System.out.println(linkList4.getNode(0) == linkList4.getNode(1));
//        System.out.println(linkList4.hashCode() == linkList5.hashCode());

//===================================================================================================
//        InterfaceList linkList3 = linkList1.intersectValues(linkList2);
//        System.out.println();
//        System.out.println(linkList3.getSize());
//        System.out.println(Arrays.toString(linkList3.getListValues()));
//        System.out.println(linkList3.getNodeValue(0));
//        System.out.println(linkList3.getNodeValue(1));
//        System.out.println(linkList3.getNodeValue(2));
//        System.out.println(linkList3.getNodeValue(3));
//        System.out.println(linkList3.getNodeValue(4));
//        System.out.println(linkList3.getNode(3).hashCode() == linkList3.getNode(4).hashCode());
//        System.out.println(linkList3.getNode(3).equals(linkList3.getNode(4)));
//        System.out.println("\n\n\n=====================\n\n\n");
    }


    public static void addNodeAndPrint(LinkList linkList, String data1){
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail:", ((LinkList) linkList).getTail());
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail.next:", ((LinkList) linkList).getTail().next);
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head:", ((LinkList) linkList).getHead());
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head.value:", ((LinkList) linkList).getHead().value);
        System.out.println("-----");
    }
}