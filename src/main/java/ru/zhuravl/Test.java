package ru.zhuravl;

import java.util.Arrays;

public class Test {
    void test_1_add() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();
        String data = "WORD";

        linkList.add(data);

        String value = ((LinkList) linkList).getNode(0).getValue();
        String result = (value == fixture.test1_valueEthalon ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 1", "ADD", result);
    }

    void test_2_remove() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test2_data) linkList.add(item);

        linkList.removeHead();
        linkList.removeHead();

        String result = (Arrays.equals(linkList.getListValues(), fixture.test2_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 2", "REMOVE", result);
    }

    void test_3_size() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (int i = 0; i < fixture.test3_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            linkList.add(data);
        }

        String result = (linkList.getSize() == fixture.test3_qty ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 3", "SIZE", result);
    }

    void test_4_addList() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.test4_data1) linkList1.add(item);
        for (String item : fixture.test4_data2) linkList2.add(item);

        linkList1.addList((LinkList) linkList2);

        String result = (Arrays.equals(linkList1.getListValues(), fixture.test4_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-15s %-1s\n", "Test 4", "REMOVE", result);
    }

    void test_5_intersect() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.test5_data1) linkList1.add(item);
        for (String item : fixture.test5_data2) linkList2.add(item);

        InterfaceList linkList3= linkList1.intersect((LinkList) linkList2);
        String result = (Arrays.equals(linkList3.getListValues(), fixture.test5_listEthalon) ? "+" : "-");

        System.out.printf("%-6s %-15s %-1s\n", "Test 5", "INTERSECT", result);
    }
}
