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
public class ModulesNotInTimeTable_of_CmprTmTblNModLstTrimModLstNProdWrnngTest {
    @Test
    public void modulesNotInTimeTable() throws Exception {

        ArrayList<ArrayList<String>> testList1=new ArrayList<>();
        testList1.add(new ArrayList<String>(Arrays.asList("CN6234,38,abc d".split(","))));
        testList1.add(new ArrayList<String>(Arrays.asList("FN5678,95,362,24 j".split(","))));
        testList1.add(new ArrayList<String>(Arrays.asList("FN4321,58".split(","))));
        testList1.add(new ArrayList<String>(Arrays.asList("CN7468,19,r/t,Kkk,ZZz".split(","))));
        testList1.add(new ArrayList<String>(Arrays.asList("CN4712,87".split(","))));
        testList1.add(new ArrayList<String>(Arrays.asList("MK6221,105,123 d".split(","))));
        ArrayList<ArrayList<String>> testList2=new ArrayList<>();
        testList2.add(new ArrayList<String>(Arrays.asList("ABC,FN4321,teh de,Iu".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("E3J,CN4675,ert".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("MKs Rt,SK7032".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("OY,cN4712".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("98T,FN4321,lop 34".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("Bcc ER,FN5678,S78 32,67 54,33 Tt".split(","))));
        testList2.add(new ArrayList<String>(Arrays.asList("J67,St5467,lop 34".split(","))));
        ArrayList<String> actualList=new ModulesNotInTimeTable_of_CmprTmTblNModLstTrimModLstNProdWrnng().
                modulesNotInTimeTable(testList1,testList2);
        ArrayList<String> expectedList=new ArrayList<String>(Arrays.asList("CN6234,CN7468,MK6221".split(",")));
        System.out.println(actualList);
        assertArrayEquals(actualList.toArray(),expectedList.toArray());
    }

}