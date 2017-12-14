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
public class SubClass_CompareItemsInTheRowsOfTheTimetable_in_TeachingOverlapAndHoursTest {
    @Test
    public void inputTestListAndSort() throws Exception {

        ArrayList<ArrayList<String>> testList=new ArrayList<>();
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,11:30,13:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,3,9:00,10:00,7,8,9,10,Severus Snape,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:00,14:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,12:30,14:00,7,8,9,10,Petunia Dursley,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,2,11:30,13:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,2,13:00,14:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,11:30,12:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,9:00,11:00,7,8,9,10,Severus Snape,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:30,15:00,7,8,9,10,Petunia Dursley,12,13,14".split(","))));
        testList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:00,15:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));

        ArrayList<ArrayList<String>> resultList = new SubClass_CompareItemsInTheRowsOfTheTimetable_in_TeachingOverlapAndHours().inputTestListAndSort(testList);
        System.out.println(resultList);

        ArrayList<ArrayList<String>> expectedList=new ArrayList<>();
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,11:30,12:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,11:30,13:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,2,11:30,13:30,7,8,9,10,Albus Dumbledore,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:00,14:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:00,15:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,2,13:00,14:30,7,8,9,10,Minerva McGonagall,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,12:30,14:00,7,8,9,10,Petunia Dursley,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,13:30,15:00,7,8,9,10,Petunia Dursley,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,1,9:00,11:00,7,8,9,10,Severus Snape,12,13,14".split(","))));
        expectedList.add(new ArrayList<String>
                (Arrays.asList("0,1,2,3,3,9:00,10:00,7,8,9,10,Severus Snape,12,13,14".split(","))));
        assertArrayEquals(expectedList.toArray(),resultList.toArray());
    }

}