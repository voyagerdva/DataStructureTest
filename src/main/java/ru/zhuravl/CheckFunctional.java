package ru.zhuravl;

import java.util.Arrays;

public class CheckFunctional {
    public void checkAllMethods() {
        System.out.println("\n\n========== Check addFront() method(): ");
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        String data1[] = {"00", "11", "22", "33", "44", "55", "66"};
        String data2[] = {"22", "44", "77"};

        for (String item: data1) {
            linkList1.addFront(item);
            addNodeAndPrint((LinkList) linkList1, item);
        }
        System.out.println(linkList1.getSize() + "\n-----------------------\n");

        for (String item: data2) {
            linkList2.addFront(item);
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
        InterfaceList linkList4 = new LinkList();
        InterfaceList linkList5 = new LinkList();

//        String data1[] = {"11", "22", "33", "44", "55", "66"};
//        String data2[] = {"44", "22", "X"};

        for (String item: data1) linkList4.addFront(item);
        linkList4.printList();
        System.out.println("________________________ " + linkList4.getSize());

        for (String item: data2) linkList5.addFront(item);
        linkList5.printList();
        System.out.println("________________________ " + linkList5.getSize());

        InterfaceList linkList3 = linkList4.intersect((LinkList) linkList5);

        System.out.printf("%s %s \n", "size linkList3: ", linkList3.getSize());
        System.out.println(Arrays.toString(linkList3.getListValues()));
        linkList3.printList();

//=========================================================================================================

        System.out.println("\n\n========== Check getNodeValue method(): ");


        System.out.println(((LinkList) linkList5).getNode(0).getValue());
        System.out.println(linkList5.getElement(0));
        System.out.println(((LinkList) linkList5).getNode(1).getValue());
        System.out.println(linkList5.getElement(1));
        System.out.println(((LinkList) linkList5).getNode(2).getValue());
        System.out.println(linkList5.getElement(2));
        System.out.println(((LinkList) linkList5).getNode(3).getValue());
        System.out.println(linkList5.getElement(3));
        System.out.println(((LinkList) linkList5).getNode(4).getValue());
        System.out.println(linkList5.getElement(4));

//=========================================================================================================
        System.out.println("\n\n========== Check removeElement method(): ");

        InterfaceList linkList6 = new LinkList();

        for (String item: data1)
            linkList6.addFront(item);
        linkList6.printList();
        System.out.println("\n" + linkList6.getSize() + "\n-----------------------\n");

        linkList6.removeElement(4);
        linkList6.printList();
        System.out.println("\n" + linkList6.getSize() + "\n-----------------------\n");
        System.out.println();

    }







    public static void addNodeAndPrint(InterfaceList linkList, String data1){
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail:", ((LinkList) linkList).getTail());

        LinkList ref1 = ((LinkList) linkList);
        LinkList.Node ref2 = (LinkList.Node) ref1.getTail();
        LinkList.Node ref3 = (LinkList.Node) ref2.next;
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail:", ref3);

        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head:", ((LinkList) linkList).getHead());

        LinkList.Node ref4 = (LinkList.Node) ref1.getHead();
        String ref5 = ref4.value;
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head.value:", ref5);
        System.out.println("-----");
    }
}



