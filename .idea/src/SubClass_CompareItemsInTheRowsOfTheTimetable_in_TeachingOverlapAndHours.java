import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Project: Time Table Project
 * (The JUnit tests part)
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public class SubClass_CompareItemsInTheRowsOfTheTimetable_in_TeachingOverlapAndHours implements Comparator<ArrayList<String>> {

    /**
     * This method compare and sort input arraylist (Format: ArrayList<ArrayList<String>>) according to
     * multiple conditions of each member (Format: ArrayList<String>) of the aforesaid arraylist:
     * first: item index 11 (String), second: item index 4 (paste to int), third: item index 5
     * (paste to double) and forth: item index 6 (paste to double).
     * @param testList
     * @return
     */
    public ArrayList<ArrayList<String>> inputTestListAndSort (ArrayList<ArrayList<String>> testList){
        ArrayList<ArrayList<String>> testList1=new ArrayList<>(testList);
        Collections.sort(testList1, new SubClass_CompareItemsInTheRowsOfTheTimetable_in_TeachingOverlapAndHours());
        return testList1;
    }

    public int compare(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {

        int result = arrayList1.get(11).trim().compareTo(arrayList2.get(11).trim());
        if (result != 0) return result;
        if (Integer.parseInt(arrayList1.get(4).trim()) > Integer.parseInt(arrayList2.get(4).trim())) return 1;
        else if (Integer.parseInt(arrayList1.get(4).trim()) < Integer.parseInt(arrayList2.get(4).trim())) return -1;
        result = arrayList1.get(5).trim().compareTo(arrayList2.get(5).trim());
        if (result != 0) return result;
        if (Double.parseDouble(arrayList1.get(6).trim().replace(":", ""))
                > Double.parseDouble(arrayList2.get(6).trim().replace(":", ""))) return 1;
        else if (Double.parseDouble(arrayList1.get(6).trim().replace(":", ""))
                < Double.parseDouble(arrayList2.get(6).trim().replace(":", ""))) return -1;
        return 1;
    }
}

//Collections.sort(fifthList, new CompareItemsInTheRowsOfTheTimetableImpl());
