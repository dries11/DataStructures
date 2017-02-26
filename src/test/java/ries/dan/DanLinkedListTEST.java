package ries.dan;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by danries on 2/26/17.
 */
public class DanLinkedListTEST {

    private DanLinkedList<Integer> danLinkedList;
    private DanLinkedList<Integer> sortTestList;
    private DanLinkedList<Integer> slicedList;

    @Before public void initialize(){
        danLinkedList = new DanLinkedList<>();
        sortTestList = new DanLinkedList<>();
        slicedList = new DanLinkedList<>();
        sortTestList.add(1);
        sortTestList.add(2);
        sortTestList.add(3);
    }

    @Test
    void addTest(){
        danLinkedList.add(3);
        int expected = 1;
        int actual = danLinkedList.size();
        assertTrue(actual == expected);
    }

    @Test
    void removeTestTrue(){
        danLinkedList.add(1);
        int expected = 1;
        int acutal = danLinkedList.remove(0);
        assertTrue(expected==acutal);
    }

    @Test
    void removeTestFalse(){
         assertNull(danLinkedList.remove(0));
    }

    @Test
    void containsTestTrue(){
        danLinkedList.add(52);
        assertTrue(danLinkedList.contains(52));
    }

    @Test
    void containsTestFalse(){
        danLinkedList.add(1);
        assertFalse(danLinkedList.contains(15));
    }

    @Test
    void findTestTrue(){
        danLinkedList.add(1);
        assertTrue(0 == danLinkedList.find(1));
    }

    @Test
    void findTestFalse(){
        assertTrue(-1 == danLinkedList.find(300));
    }

    @Test
    void sizeTest(){
        danLinkedList.add(1);
        assertTrue(1 == danLinkedList.size());
    }

    @Test
    void getTestHasNode(){
        danLinkedList.add(1);
        assertTrue(1 == danLinkedList.get(0));
    }

    @Test
    void getTestNoNode(){
        assertNull(danLinkedList.get(0));
    }

    @Test
    void copyTest(){
        danLinkedList.add(1);
        danLinkedList.add(2);
        DanLinkedList<Integer> copyOf = new DanLinkedList<>();
        assertTrue(danLinkedList.equals(copyOf));
    }

    @Test
    void sortTest(){
        danLinkedList.add(3);
        danLinkedList.add(1);
        danLinkedList.add(2);
        danLinkedList.sort();
        assertTrue(danLinkedList.equals(sortTestList));
    }

    @Test
    void reverseTest(){
        assertTrue(sortTestList.get(0) == 3 && sortTestList.get(2) == 1);
    }

    @Test
    void slice(){
        int expected = 3;
        assertTrue();
    }

}
