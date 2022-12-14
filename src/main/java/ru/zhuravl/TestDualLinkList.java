package ru.zhuravl;

import java.util.Arrays;

public class TestDualLinkList {
    void test_1_add() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();
        String data = "WORD";

        dualLinkList.add(data);

        String value = ((LinkList) dualLinkList).getNode(0).getValue();
        String result = (value == fixture.test1_valueEthalon ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 1", "add", result);
    }

    void test_2_size() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();

        for (int i = 0; i < fixture.test_size_qty; i++) {
            String data = "0x"+(Integer.toString(i,16)).toUpperCase();
            dualLinkList.add(data);
        }

        String result = (dualLinkList.getSize() == fixture.test_size_qty ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 2", "SIZE", result);
    }

    void test_3_addList() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList1 = new DualLinkList();
        InterfaceDualList dualLinkList2 = new DualLinkList();

        for (String item : fixture.test_addList_data1) dualLinkList1.add(item);
        for (String item : fixture.test_addList_data2) dualLinkList2.add(item);

        dualLinkList1.addList((LinkList) dualLinkList2);

        String result = (Arrays.equals(dualLinkList1.getListValues(), fixture.test_addList_listEthalon) ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 3", "ADD_LIST", result);
    }

    void test_4_intersect() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList1 = new DualLinkList();
        InterfaceDualList dualLinkList2 = new DualLinkList();

        for (String item : fixture.intersect_data1) {
            dualLinkList1.add(item);
        }
        for (String item : fixture.intersect_data2) {
            dualLinkList2.add(item);
        }

        InterfaceDualList dualLinkList3 = (InterfaceDualList) dualLinkList1.intersect((LinkList) dualLinkList2);
        String result = (Arrays.equals(dualLinkList3.getListValues(), fixture.intersect_listEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 4", "INTERSECT", result);
    }

    void test_5_removeHead() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();

        for (String item : fixture.test_removeHead_data) dualLinkList.add(item);

        dualLinkList.removeHead();
        dualLinkList.removeHead();

        String result = (Arrays.equals(dualLinkList.getListValues(), fixture.test_removeHead_listEthalon) ? "YES" : "no");
        System.out.printf("%-6s %-15s %-1s\n", "Test 5", "REMOVE HEAD", result);
    }

    void test_6_removeElement_index_0() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();

        for (String item : fixture.test_removeElement_index_0_data) dualLinkList.add(item);

        dualLinkList.removeElement(0);
        String result = (Arrays.equals(dualLinkList.getListValues(), fixture.test_removeElement_index_0_listEthalon)
                & (dualLinkList.getSize() == fixture.test_removeElement_index_0_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 6", "REMOVE_0", result);

    }
    void test_7_removeElement_index_3() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();

        for (String item : fixture.test_removeElement_index_0_data) dualLinkList.add(item);

        dualLinkList.removeElement(3);
        String result = (Arrays.equals(dualLinkList.getListValues(), fixture.test_removeElement_index_3_listEthalon)
                & (dualLinkList.getSize() == fixture.test_removeElement_index_3_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 7", "REMOVE_3", result);

    }
    void test_8_removeElement_index_6() {
        Fixture fixture = new Fixture();
        InterfaceDualList dualLinkList = new DualLinkList();

        for (String item : fixture.test_removeElement_index_0_data) dualLinkList.add(item);

        dualLinkList.removeElement(6);
        String result = (Arrays.equals(dualLinkList.getListValues(), fixture.test_removeElement_index_6_listEthalon)
                & (dualLinkList.getSize() == fixture.test_removeElement_index_6_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-6s %-15s %-1s\n", "Test 8", "REMOVE_6", result);

    }

}
