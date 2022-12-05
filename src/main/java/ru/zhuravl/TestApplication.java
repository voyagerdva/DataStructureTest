package ru.zhuravl;

public class TestApplication {
    public static void main(String[] args) throws AssertionError{
        CheckFunctional checkFunctional = new CheckFunctional();
        Test test = new Test();

        System.out.printf("\n======= Testing: ==================\n");
        test.test_1_add();
        test.test_2_size();
        test.test_3_addList();
        test.test_4_intersect();
        test.test_5_removeHead();
        test.test_6_removeElement_index_0();
        test.test_7_removeElement_index_3();
        test.test_8_removeElement_index_6();

        System.out.printf("\n======= Check functional: ==================\n");
        checkFunctional.checkAllMethods();


    }
}
