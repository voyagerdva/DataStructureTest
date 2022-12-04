package ru.zhuravl;

public class CheckFunctional {
    public void checkAllMethods() {
        System.out.println("\n---------------------------------------------------------");
        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();

        String data1[] = {"11", "22", "33", "44"};
        String data2[] = {"55", "66", "77"};

        for (String item: data1) {
            linkList1.add(item);
            addNodeAndPrint(linkList1, item);
        }
        System.out.println(linkList1.getSize() + "\n======================\n");

        for (String item: data2) {
            linkList2.add(item);
            addNodeAndPrint(linkList2, item);
        }
        System.out.println(linkList2.getSize() + "\n======================\n");

//        linkList1.addList(linkList2);
        System.out.println();

        linkList1.addList(linkList2);
        System.out.println();
        linkList1.printList();
        System.out.println();

        for (int i = 0; i < linkList1.getSize(); i++) {
            System.out.println(linkList1.getNode(i));

        }
    }


    public static void addNodeAndPrint(LinkList linkList, String data1){
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail:", ((LinkList) linkList).getTail());
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.tail.next:", ((LinkList) linkList).getTail().next);
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head:", ((LinkList) linkList).getHead());
        System.out.printf("%-25s %-35s\n", data1 + " - linkList.head.value:", ((LinkList) linkList).getHead().value);
        System.out.println("-----");
    }
}