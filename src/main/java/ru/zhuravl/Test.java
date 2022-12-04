package ru.zhuravl;

import java.util.Arrays;

public class Test {
    public void test_1_add() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();
        String data = "WORD";

        linkList.add(data);

        String value = linkList.getNodeValue(0);
        String result = (value == fixture.test1_valueEthalon ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s\n", "Test 1", "ADD", result);
    }

    public void test_2_remove() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();

        for (String item : fixture.test2_data) linkList.add(item);

        linkList.removeHead();
        linkList.removeHead();

        String result = (Arrays.equals(linkList.getList(), fixture.test2_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s\n", "Test 2", "REMOVE", result);
    }

    public void test_3_size() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();

        for (int i = 0; i < fixture.test3_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            linkList.add(data);
        }

        String result = (linkList.getSize() == fixture.test3_qty ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s\n", "Test 3", "SIZE", result);
    }

    public void test_4_addList() {
        Fixture fixture = new Fixture();
        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();

        for (String item : fixture.test4_data1) linkList1.add(item);
        for (String item : fixture.test4_data2) linkList2.add(item);

        linkList1.addList(linkList2);

        String result = (Arrays.equals(linkList1.getList(), fixture.test4_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s\n", "Test 4", "REMOVE", result);
        System.out.println();


    }
}
