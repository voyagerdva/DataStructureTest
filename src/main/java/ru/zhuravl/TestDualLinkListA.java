package ru.zhuravl;

import java.util.Arrays;
import java.util.Objects;

public class TestDualLinkListA {
    private void fillList(String[] fixtureData, InterfaceDualListA linkList) {
        for (String item : fixtureData) {
            ObjectA objectA = new ObjectA(item);
            linkList.add(objectA);
        }
    }

    void test_DualA_add() {
        Fixture fixture = new Fixture();
        DualLinkListA linkListA = new DualLinkListA();
        String data = "WORD";

        ObjectA objectA = new ObjectA(data);
        linkListA.add(objectA);

        String value = linkListA.getNode(0).getName();
        String result = (Objects.equals(value, fixture.test1_valueEthalon) ? "YES" : "no");
        System.out.printf("%-15s %-1s\n", "add", result);
    }

    void test_DualA_size() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA = new DualLinkListA();

        fillList(fixture.test_size_data, linkListA);

        String result = (linkListA.getSize() == fixture.test_size_qty ? "YES" : "no");
        System.out.printf("%-15s %-1s\n", "SIZE", result);
    }

    void test_DualA_addList() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA1 = new DualLinkListA();
        DualLinkListA linkListA2 = new DualLinkListA();

        fillList(fixture.test_addList_data1, linkListA1);
        fillList(fixture.test_addList_data2, linkListA2);

        linkListA1.addList(linkListA2);

        String result = (Arrays.equals(linkListA1.getListValuesNames(), fixture.test_addList_listEthalon) ? "YES" : "no");
        System.out.printf("%-15s %-1s\n", "ADD_LIST", result);
    }

    void test_DualA_intersect() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA1 = new DualLinkListA();
        DualLinkListA linkListA2 = new DualLinkListA();

        fillList(fixture.intersect_data1, linkListA1);
        fillList(fixture.intersect_data2, linkListA2);

        InterfaceDualListA linkListA3= linkListA1.intersect(linkListA2);
        String result = (Arrays.equals(linkListA3.getListValuesNames(), fixture.intersect_listEthalon) ? "YES" : "no");

        System.out.printf("%-15s %-1s\n", "INTERSECT", result);
    }

    void test_DualA_removeHead() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA = new DualLinkListA();

        fillList(fixture.test_removeHead_data, linkListA);
        linkListA.removeHead();
        linkListA.removeHead();

        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeHead_listEthalon) ? "YES" : "no");
        System.out.printf("%-15s %-1s\n", "REMOVE HEAD", result);
    }

    void test_DualA_removeElement_index_0() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA = new DualLinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);


        linkListA.removeElement(0);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_0_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_0_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-15s %-1s\n", "REMOVE_0", result);
    }

    void test_DualA_removeElement_index_3() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA = new DualLinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);

        linkListA.removeElement(3);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_3_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_3_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-15s %-1s\n", "REMOVE_3", result);
    }

    void test_DualA_removeElement_index_6() {
        Fixture fixture = new Fixture();
        InterfaceDualListA linkListA = new DualLinkListA();

        fillList(fixture.test_removeElement_index_0_data, linkListA);

        linkListA.removeElement(6);
        String result = (Arrays.equals(linkListA.getListValuesNames(), fixture.test_removeElement_index_6_listEthalon)
                & (linkListA.getSize() == fixture.test_removeElement_index_6_sizeEthalon) ? "YES" : "no");

        System.out.printf("%-15s %-1s\n", "REMOVE_6", result);

    }
}
