import java.util.ArrayList;
import java.util.Collections;

/**
 * Project: Time Table Project
 * (The JUnit tests part)
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public class CombinTheFirstFewItems_of_InputAndTidyUpTimeTable {

    /**
     * This method is for combining the first few items of an arrayList which are ended
     * with a comma until reaching an item in the pattern of "[a-zA-Z]{2}[0-9]{4}" (That
     * is, the pattern of a module number such as CN7021). It is for solving the problem
     * of inputting data from the .csv format timetable file with the first item of a row
     * of it itself consists of commas.
     * @param stringArrayList
     * @return
     */
    public ArrayList<String> combinTheFirstFewItems (ArrayList<String> stringArrayList){

        ArrayList<Integer> tempToBeDeletedItemIndex = new ArrayList<>();
        String s=stringArrayList.get(0);
        for (int i = 1; i < 5; i++) {
            if (stringArrayList.get(i).matches("\\s*[a-zA-Z]{2}[0-9]{4}\\s*")) {
                System.out.println(stringArrayList.get(i));  //this line added temp at testing
                break;
            } else {
                String s1 = stringArrayList.get(i);
                s = s+","+s1;
                tempToBeDeletedItemIndex.add(i);
            }
        }
        //removing items in reverse order so that rank of items not yet considered would not be dis
        Collections.reverse(tempToBeDeletedItemIndex);
        System.out.println(tempToBeDeletedItemIndex); //this line added to see the reversed list
        for (int i : tempToBeDeletedItemIndex) stringArrayList.remove(i);
        stringArrayList.set(0, s);
        return stringArrayList;

    }
}
