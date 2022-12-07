package ru.zhuravl;

import java.util.Arrays;

public class Test {
    void test_1_add() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();
        String data = "WORD";

        linkList.addFront(data);

        String value = ((LinkList) linkList).getNode(0).getValue();
        String result = (value == fixture.test1_valueEthalon ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 1", "addFront", result);
    }

    void test_2_size() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (int i = 0; i < fixture.test3_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            linkList.addFront(data);
        }

        String result = (linkList.getSize() == fixture.test3_qty ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 2", "SIZE", result);
    }

    void test_3_addList() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.test4_data1) linkList1.addFront(item);
        for (String item : fixture.test4_data2) linkList2.addFront(item);

        linkList1.addList((LinkList) linkList2);

        String result = (Arrays.equals(linkList1.getListValues(), fixture.test4_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 3", "ADD_LIST", result);
    }

    void test_4_intersect() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.test5_data1) linkList1.addFront(item);
        for (String item : fixture.test5_data2) linkList2.addFront(item);

        InterfaceList linkList3= linkList1.intersect((LinkList) linkList2);
        String result = (Arrays.equals(linkList3.getListValues(), fixture.test5_listEthalon) ? "+" : "-");

        System.out.printf("%-6s %-15s %-1s\n", "Test 4", "INTERSECT", result);
    }

    void test_5_removeHead() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test2_data) linkList.addFront(item);

        linkList.removeHead();
        linkList.removeHead();

        String result = (Arrays.equals(linkList.getListValues(), fixture.test2_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 5", "REMOVE HEAD", result);
    }

    void test_6_removeElement_index_0() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test6_data) linkList.addFront(item);

        linkList.removeElement(0);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test6_listEthalon)
                & (linkList.getSize() == fixture.test6_sizeEthalon) ? "+" : "-");

        System.out.printf("%-6s %-15s %-1s\n", "Test 6", "REMOVE_0", result);

    }
    void test_7_removeElement_index_3() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test6_data) linkList.addFront(item);

        linkList.removeElement(3);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test7_listEthalon)
                & (linkList.getSize() == fixture.test7_sizeEthalon) ? "+" : "-");

        System.out.printf("%-6s %-15s %-1s\n", "Test 7", "REMOVE_3", result);

    }
    void test_8_removeElement_index_6() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test6_data) linkList.addFront(item);

        linkList.removeElement(6);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test8_listEthalon)
                & (linkList.getSize() == fixture.test8_sizeEthalon) ? "+" : "-");

        System.out.printf("%-6s %-15s %-1s\n", "Test 8", "REMOVE_6", result);

    }
}
