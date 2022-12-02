package ru.zhuravl;

public class CheckFunctional {
    public void checkAllMethods() {
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
        linkList.getNode(2);
        linkList.getNode(0);
        linkList.getNode(6);
        linkList.getNode(8);
        linkList.getNode(16);
        linkList.getNode(5);
        linkList.getNode(4);

    }


    public static void addNodeAndPrint(LinkList linkList, String data){
        System.out.printf("%-25s %-35s\n", data + " - linkList.tail:", ((LinkList) linkList).tail);
        System.out.printf("%-25s %-35s\n", data + " - linkList.tail.next:", ((LinkList) linkList).tail.next);
        System.out.printf("%-25s %-35s\n", data + " - linkList.head:", ((LinkList) linkList).head);
        System.out.printf("%-25s %-35s\n", data + " - linkList.head.value:", ((LinkList) linkList).head.value);
        System.out.println("-----");
    }
}













//        Fixture fixture = new Fixture();
//
//        if (Arrays.equals(arr, fixture.arrEthalon)) System.out.println("Тест пройден!");
//        else System.out.println("Тест НЕ пройден! :-((( ");
//        assert (Arrays.equals(arr, fixture.arrEthalon));
//        System.out.println(Arrays.toString(arr));

