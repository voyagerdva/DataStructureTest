package ru.zhuravl;

public class TestApplication {
    public static void main(String[] args) throws AssertionError{
        CheckFunctional checkFunctional = new CheckFunctional();
        Test test = new Test();

        System.out.printf("\n======= Testing: ==================\n");
        test.test_1_add();
        test.test_2_remove();
        test.test_3_size();
        test.test_4_addList();
        test.test_5_intersect();

//        System.out.printf("\n======= Check functional: ==================\n");
//        checkFunctional.checkAllMethods();


    }
}
