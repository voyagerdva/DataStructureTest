package ru.zhuravl;

public class TestApplication {
    public static void main(String[] args) throws AssertionError{
        CheckFunctional checkFunctional = new CheckFunctional();
        Test test = new Test();

//        checkFunctional.checkAllMethods();
        System.out.printf("\n======= Testing: ==================\n");
        test.test_1_add();
        test.test_2_remove();
        test.test_3_size();

    }
}
