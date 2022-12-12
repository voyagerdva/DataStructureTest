package ru.zhuravl;

public class Fixture {
    String test1_valueEthalon = "WORD";
    String[] test_removeHead_data = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
    String[] test_removeHead_listEthalon = {"ONE", "TWO", "THREE"};

    String[] test_size_data = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
    int test_size_qty = 5;

    String[] test_addList_data1 = {"11", "22", "33", "44"};
    String[] test_addList_data2 = {"55", "66", "77"};
    String[] test_addList_listEthalon = {"11", "22", "33", "44", "55", "66", "77"};

    String[] intersect_data1 = {"11", "22", "33", "44", "55", "66", "77", "88", "99", "X", "XI", "XII"};
    String[] intersect_data2 = {"44", "22", "11", "X", "XII"};
    String[] intersect_listEthalon = {"11", "22", "44", "X", "XII"};

    String[] test_removeElement_index_0_data = {"00", "11", "22", "33", "44", "55", "66"};
    String[] test_removeElement_index_0_listEthalon = {"11", "22", "33", "44", "55", "66"};
    int test_removeElement_index_0_sizeEthalon = 6;
    String[] test_removeElement_index_3_listEthalon = {"00", "11", "22", "44", "55", "66"};
    int test_removeElement_index_3_sizeEthalon = 6;
    String[] test_removeElement_index_6_listEthalon = {"00", "11", "22", "33", "44", "55"};
    int test_removeElement_index_6_sizeEthalon = 6;




}
