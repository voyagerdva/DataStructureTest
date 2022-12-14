package ru.zhuravl;

import java.util.Arrays;

public class TestLinkList {
    void test_1_add() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();
        String data = "WORD";

        linkList.add(data);

        String value = ((LinkList) linkList).getNode(0).getValue();
        String result = (value == fixture.test1_valueEthalon ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 1", "add", result);
    }

    void test_2_size() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (int i = 0; i < fixture.test_size_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            linkList.add(data);
        }

        String result = (linkList.getSize() == fixture.test_size_qty ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 2", "SIZE", result);
    }

    void test_3_addList() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.test_addList_data1) linkList1.add(item);
        for (String item : fixture.test_addList_data2) linkList2.add(item);

        linkList1.addList((LinkList) linkList2);

        String result = (Arrays.equals(linkList1.getListValues(), fixture.test_addList_listEthalon) ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 3", "ADD_LIST", result);
    }

    void test_4_intersect() {
        Fixture fixture = new Fixture();
        InterfaceList linkList1 = new LinkList();
        InterfaceList linkList2 = new LinkList();

        for (String item : fixture.intersect_data1) linkList1.add(item);
        for (String item : fixture.intersect_data2) linkList2.add(item);

        InterfaceList linkList3= linkList1.intersect((LinkList) linkList2);
        String result = (Arrays.equals(linkList3.getListValues(), fixture.intersect_listEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 4", "INTERSECT", result);
    }

    void test_5_removeHead() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test_removeHead_data) linkList.add(item);

        linkList.removeHead();
        linkList.removeHead();

        String result = (Arrays.equals(linkList.getListValues(), fixture.test_removeHead_listEthalon) ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 5", "REMOVE HEAD", result);
    }

    void test_6_removeElement_index_0() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test_removeElement_index_0_data) linkList.add(item);

        linkList.removeElement(0);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test_removeElement_index_0_listEthalon)
                & (linkList.getSize() == fixture.test_removeElement_index_0_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 6", "REMOVE_0", result);

    }
    void test_7_removeElement_index_3() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test_removeElement_index_0_data) linkList.add(item);

        linkList.removeElement(3);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test_removeElement_index_3_listEthalon)
                & (linkList.getSize() == fixture.test_removeElement_index_3_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 7", "REMOVE_3", result);

    }
    void test_8_removeElement_index_6() {
        Fixture fixture = new Fixture();
        InterfaceList linkList = new LinkList();

        for (String item : fixture.test_removeElement_index_0_data) linkList.add(item);

        linkList.removeElement(6);
        String result = (Arrays.equals(linkList.getListValues(), fixture.test_removeElement_index_6_listEthalon)
                & (linkList.getSize() == fixture.test_removeElement_index_6_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 8", "REMOVE_6", result);

    }
}
