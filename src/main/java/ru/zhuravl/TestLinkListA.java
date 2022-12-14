package ru.zhuravl;

import java.util.Arrays;
import java.util.Objects;

public class TestLinkListA {
    private void fillList(String[] fixtureData, InterfaceListA linkList) {
        for (String item : fixtureData) {
            ObjectA objectA = new ObjectA(item);
            linkList.add(objectA);
        }
    }

    void test_add() {
        Fixture fixture = new Fixture();
        LinkListA linkListA = new LinkListA();
        String data = "WORD";

        ObjectA objectA = new ObjectA(data);
        linkListA.add(objectA);

        String value = linkListA.getNode(0).getName();
        String result = (Objects.equals(value, fixture.test1_valueEthalon) ? "YES" : "no");
        System.out.printf("%-4s %-15s %-1s\n", "Test ", "add", result);
    }

    void test_size() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA = new LinkListA();

        fillList(fixture.test_size_data, linkListA);

        String result = (linkListA.getSize() == fixture.test_size_qty ? "YES" : "no");
        System.out.printf("%-4s %-15s %-1s\n", "Test ", "SIZE", result);
    }

    void test_addList() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA1 = new LinkListA();
        LinkListA linkListA2 = new LinkListA();

        fillList(fixture.test_addList_data1, linkListA1);
        fillList(fixture.test_addList_data2, linkListA2);

        linkListA1.addList(linkListA2);

        String result = (Arrays.equals(linkListA1.getListValuesNames(), fixture.test_addList_listEthalon) ? "YES" : "no");
        System.out.printf("%-4s %-15s %-1s\n", "Test ", "ADD_LIST", result);
    }

    void test_intersect() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA1 = new LinkListA();
        LinkListA linkListA2 = new LinkListA();

        fillList(fixture.intersect_data1, linkListA1);
        fillList(fixture.intersect_data2, linkListA2);

        InterfaceListA linkListA3= linkListA1.intersect(linkListA2);
        String result = (Arrays.equals(linkListA3.getListValuesNames(), fixture.intersect_listEthalon) ? "YES" : "no");

        System.out.printf("%-4s %-15s %-1s\n", "Test ", "INTERSECT", result);
    }

    void test_removeHead() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA = new LinkListA();

        fillList(fixture.test_removeHead_data, linkListA);
        linkListA.removeHead();
        linkListA.removeHead();

        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeHead_listEthalon) ? "YES" : "no");
        System.out.printf("%-4s %-15s %-1s\n", "Test ", "REMOVE HEAD", result);
    }

    void test_removeElement_index_0() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA = new LinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);


        linkListA.removeElement(0);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_0_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_0_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-4s %-15s %-1s\n", "Test ", "REMOVE_0", result);
    }

    void test_removeElement_index_3() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA = new LinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);

        linkListA.removeElement(3);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_3_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_3_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-4s %-15s %-1s\n", "Test ", "REMOVE_3", result);
    }

    void test_removeElement_index_6() {
        Fixture fixture = new Fixture();
        InterfaceListA linkListA = new LinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);

        linkListA.removeElement(6);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_6_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_6_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-4s %-15s %-1s\n", "Test ", "REMOVE_6", result);

    }
}
