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
        System.out.println(linkList1.size() + "\n======================\n");

        for (String item: data2) {
            linkList2.add(item);
            addNodeAndPrint(linkList2, item);
        }
        System.out.println(linkList2.size() + "\n======================\n");

        System.out.println();

        linkList1.addList(linkList2);
        System.out.println();
        linkList1.printList();
        System.out.println();

        for (int i = 0; i < linkList1.size(); i++) {
            System.out.println(linkList1.getNode(i));

        }
    }


    public static void addNodeAndPrint(LinkList linkList, String data){
        System.out.printf("%-25s %-35s\n", data + " - linkList.head:", ((LinkList) linkList).head);
        System.out.printf("%-25s %-35s\n", data + " - linkList.head.value:", ((LinkList) linkList).head.value);
//        System.out.printf("%-25s %-35s\n", data + " - linkList.tail:", ((LinkList) linkList).tail);
//        System.out.printf("%-25s %-35s\n", data + " - linkList.tail.next:", ((LinkList) linkList).tail.next);
        System.out.println("-----");
    }
}