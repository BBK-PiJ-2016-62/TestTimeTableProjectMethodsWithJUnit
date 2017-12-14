import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Project: Time Table Project
 * (The JUnit tests part)
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public class CombinTheFirstFewItems_of_InputAndTidyUpTimeTableTest {

    /**
     *For usage of the method, please see the statement on top of the method
     * itself which is located at src
     */
    @Test
    public void combinTheFirstFewItems() throws Exception {

        CombinTheFirstFewItems_of_InputAndTidyUpTimeTable tttpm = new CombinTheFirstFewItems_of_InputAndTidyUpTimeTable();
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(("apple,banana,mango,orange,CN7021" +
                ",Advanced Software Engineering").split(",")));
        ArrayList<String> actualResultList = new ArrayList<>(Arrays.asList("apple,banana,mango,orange/CN7021/Advanced Software Engineering".split("/")));
        ArrayList<String> resultList=new ArrayList<>(new CombinTheFirstFewItems_of_InputAndTidyUpTimeTable().combinTheFirstFewItems(testList));
        System.out.println(testList);
        System.out.println(actualResultList);
        System.out.println(resultList);
        assertArrayEquals(actualResultList.toArray(),resultList.toArray());
    }

}