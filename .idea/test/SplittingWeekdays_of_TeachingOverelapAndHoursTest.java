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
public class SplittingWeekdays_of_TeachingOverelapAndHoursTest {
    @Test
    public void splittingWeekdays() throws Exception {

        ArrayList<String> testList1 = new ArrayList<>(Arrays.asList("apple,banana,mango,orange,papaya,Mon/tue/FRI".split(",")));
        ArrayList<ArrayList<String>> expectedList1=new ArrayList<>();
        expectedList1.add(new ArrayList<String>(Arrays.asList("apple,banana,mango,orange,papaya,Monday".split(","))));
        expectedList1.add(new ArrayList<String>(Arrays.asList("apple,banana,mango,orange,papaya,Tuesday".split(","))));
        expectedList1.add(new ArrayList<String>(Arrays.asList("apple,banana,mango,orange,papaya,Friday".split(","))));

        ArrayList<ArrayList<String>> actualList1=new SplittingWeekdays_of_TeachingOverelapAndHours().
                splittingWeekdays(testList1);
        System.out.println(actualList1);
        assertArrayEquals(expectedList1.toArray(),actualList1.toArray());

        ArrayList<String> testList2 = new ArrayList<>(Arrays.asList("cat,dog,donkey,horse,rabbit,Tue-thu".split(",")));
        ArrayList<ArrayList<String>> expectedList2=new ArrayList<>();
        expectedList2.add(new ArrayList<String>(Arrays.asList("cat,dog,donkey,horse,rabbit,Tuesday".split(","))));
        expectedList2.add(new ArrayList<String>(Arrays.asList("cat,dog,donkey,horse,rabbit,Wednesday".split(","))));
        expectedList2.add(new ArrayList<String>(Arrays.asList("cat,dog,donkey,horse,rabbit,Thursday".split(","))));

        ArrayList<ArrayList<String>> actualList2=new SplittingWeekdays_of_TeachingOverelapAndHours().
                splittingWeekdays(testList2);
        System.out.println(actualList2);
        assertArrayEquals(expectedList2.toArray(),actualList2.toArray());

    }

}