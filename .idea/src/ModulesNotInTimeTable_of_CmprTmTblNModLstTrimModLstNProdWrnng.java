import java.util.ArrayList;

/**
 * Project: Time Table Project
 * (The JUnit tests part)
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public class ModulesNotInTimeTable_of_CmprTmTblNModLstTrimModLstNProdWrnng {

    /**
     * This method is for comparing two arraylists (format: ArrayList<ArrayList<String>>) and picking up those items at
     * index 0 of the arraylists of the first arraylist which are not the same as any of the items at index 1 of the
     * arrayLists of the second arraylist and return an arraylist (format: ArrayList<String>) of such items.
     * @param modStudNumList
     * @param firstList
     * @return
     */

    public ArrayList<String> modulesNotInTimeTable
            (ArrayList<ArrayList<String>> modStudNumList, ArrayList<ArrayList<String>> firstList){
        ArrayList<String> modulesListed= new ArrayList<>();
        ArrayList<String> modulesInTimeTable= new ArrayList<>();
        ArrayList<String> modulesNotInTimeTable= new ArrayList<>();
        abc:
        for (ArrayList<String> m:modStudNumList) {
            modulesListed.add(m.get(0));
            for (ArrayList<String> f : firstList) {
                if(f.size()>=2) {
                    if (m.get(0).trim().toLowerCase().equals(f.get(1).trim().toLowerCase())){
                        modulesInTimeTable.add(m.get(0));
                        continue abc;
                    }
                }
            }
        }
        modulesNotInTimeTable= new ArrayList<>(modulesListed);
        abc:
        for(int i=modulesListed.size()-1; i>=0; i--){
            for(String str:modulesInTimeTable){
                if(modulesListed.get(i).equals(str)){
                    modulesNotInTimeTable.remove(i);
                    continue abc;
                }
            }
        }
        return modulesNotInTimeTable;
    }
}
