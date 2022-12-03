package ru.zhuravl;

import java.util.Arrays;

public class Test {
    public void test_1_add() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();
        String data = "WORD";

        linkList.add(data);

        String value = linkList.getNode(0);
        String result = (value == fixture.test1_valueEthalon ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s", "Test 1", "ADD", result);
        System.out.println();
    }

    public void test_2_remove() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();

        for (String item : fixture.test2_data) linkList.add(item);

        linkList.removeHead();
        linkList.removeHead();

        String[] list = linkList.getList();
        String result = (Arrays.equals(list, fixture.test2_listEthalon) ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s", "Test 2", "REMOVE", result);
        System.out.println();
    }

    public void test_3_size() {
        Fixture fixture = new Fixture();
        LinkList linkList = new LinkList();

        for (int i = 0; i < fixture.test3_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            linkList.add(data);
        }

        String result = (linkList.size == fixture.test3_qty ? "+" : "-");
        System.out.printf("%-6s %-10s %-1s", "Test 3", "SIZE", result);
    }
}
