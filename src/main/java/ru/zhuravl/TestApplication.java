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

//        System.out.printf("\n======= Check functional LinkList: ==================\n");
//        CheckFunctionalList checkFunctionalList = new CheckFunctionalList();
//
//        checkFunctionalList.checkAllMethods();
//
//        System.out.printf("\n======= Check functional DualLinkList: ==================\n");
//        CheckFunctionalDualList checkFunctionalDualList = new CheckFunctionalDualList();
//        checkFunctionalDualList.checkAllMethods();

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



    }
}
