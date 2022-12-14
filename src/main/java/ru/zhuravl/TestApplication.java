package ru.zhuravl;

public class TestApplication {
    public static void main(String[] args) throws AssertionError{
        TestLinkList testLinkList = new TestLinkList();

        System.out.printf("\n======= Testing: ==================\n");
        testLinkList.test_1_add();
        testLinkList.test_2_size();
        testLinkList.test_3_addList();
        testLinkList.test_4_intersect();
        testLinkList.test_5_removeHead();
        testLinkList.test_6_removeElement_index_0();
        testLinkList.test_7_removeElement_index_3();
        testLinkList.test_8_removeElement_index_6();

        TestDualLinkList testDualLinkList = new TestDualLinkList();
        System.out.printf("\n======= Testing DualLinkList: ==================\n");
        testDualLinkList.test_1_add();
        testDualLinkList.test_2_size();
        testDualLinkList.test_3_addList();
        testDualLinkList.test_4_intersect();
        testDualLinkList.test_5_removeHead();
        testDualLinkList.test_6_removeElement_index_0();
        testDualLinkList.test_7_removeElement_index_3();
        testDualLinkList.test_8_removeElement_index_6();

        TestLinkListA testLinkListA = new TestLinkListA();
        System.out.printf("\n======= Testing LinkListA: ==================\n");
        System.out.printf("%-2s ", 1); testLinkListA.test_add();
        System.out.printf("%-2s ", 2); testLinkListA.test_size();
        System.out.printf("%-2s ", 3); testLinkListA.test_addList();
        System.out.printf("%-2s ", 4); testLinkListA.test_intersect();
        System.out.printf("%-2s ", 5); testLinkListA.test_removeHead();
        System.out.printf("%-2s ", 6); testLinkListA.test_removeElement_index_0();
        System.out.printf("%-2s ", 7); testLinkListA.test_removeElement_index_3();
        System.out.printf("%-2s ", 8); testLinkListA.test_removeElement_index_6();

        TestDualLinkListA testDualLinkListA = new TestDualLinkListA();
        System.out.printf("\n======= Testing LinkListA: ==================\n");
        System.out.printf("%-2s ", 1); testDualLinkListA.test_DualA_add();
        System.out.printf("%-2s ", 2); testDualLinkListA.test_DualA_size();
        System.out.printf("%-2s ", 3); testDualLinkListA.test_DualA_addList();
        System.out.printf("%-2s ", 4); testDualLinkListA.test_DualA_intersect();
        System.out.printf("%-2s ", 5); testDualLinkListA.test_DualA_removeHead();
        System.out.printf("%-2s ", 6); testDualLinkListA.test_DualA_removeElement_index_0();
        System.out.printf("%-2s ", 7); testDualLinkListA.test_DualA_removeElement_index_3();
        System.out.printf("%-2s ", 8); testDualLinkListA.test_DualA_removeElement_index_6();
    }
}
