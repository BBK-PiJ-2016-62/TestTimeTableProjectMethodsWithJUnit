import java.util.ArrayList;

/**
 * Project: Time Table Project
 * (The JUnit tests part)
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public class SplittingWeekdays_of_TeachingOverelapAndHours {

    /**
     * This method is for splitting an arraylist with item(5) of it in the form of "Mon/Wed/Fri" to three lines with
     * item(5) of them "Monday", "Wednesday" and "Friday" respectively, or in the form "Tue-Thu" to three lines with
     * item(5) of them "Tuesday", "Wednesday" and "Thursday" respectively.
     * @param arrayList
     * @return
     */

    public ArrayList<ArrayList<String>> splittingWeekdays(ArrayList<String> arrayList) {

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        if (arrayList.get(5).trim().matches("[[A-Za-z]{3}/]+[A-Za-z]{3}")) {

            String[] weekdays = arrayList.get(5).trim().split("/");
            for (String s : weekdays) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                if (s.trim().toLowerCase().equals("mon")) {
                    arrayList2.set(5, "Monday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("tue")) {
                    arrayList2.set(5, "Tuesday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("wed")) {
                    arrayList2.set(5, "Wednesday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("thu")) {
                    arrayList2.set(5, "Thursday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("fri")) {
                    arrayList2.set(5, "Friday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("sat")) {
                    arrayList2.set(5, "Saturday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("sun")) {
                    arrayList2.set(5, "Sunday");
                    arrayLists.add(arrayList2);
                }
            }
        }
        if (arrayList.get(5).trim().matches("[a-zA-Z]{3}\\s*-\\s*[a-zA-Z]{3}")) {

            String[] weekdays = arrayList.get(5).trim().split("-");

            String s1 = weekdays[0].trim().toLowerCase();
            String s2 = weekdays[1].trim().toLowerCase();
            switch (s1) {
                case "mon":
                    ArrayList<String> arrayList21 = new ArrayList<>(arrayList);
                    arrayList21.set(5, "Monday");
                    arrayLists.add(arrayList21);
                    if (s2.equals("mon")) break;
                case "tue":
                    ArrayList<String> arrayList22 = new ArrayList<>(arrayList);
                    arrayList22.set(5, "Tuesday");
                    arrayLists.add(arrayList22);
                    if (s2.equals("tue")) break;
                case "wed":
                    ArrayList<String> arrayList23 = new ArrayList<>(arrayList);
                    arrayList23.set(5, "Wednesday");
                    arrayLists.add(arrayList23);
                    if (s2.equals("wed")) break;
                case "thu":
                    ArrayList<String> arrayList24 = new ArrayList<>(arrayList);
                    arrayList24.set(5, "Thursday");
                    arrayLists.add(arrayList24);
                    if (s2.equals("thu")) break;
                case "fri":
                    ArrayList<String> arrayList25 = new ArrayList<>(arrayList);
                    arrayList25.set(5, "Friday");
                    arrayLists.add(arrayList25);
                    if (s2.equals("fri")) break;
                case "sat":
                    ArrayList<String> arrayList26 = new ArrayList<>(arrayList);
                    arrayList26.set(5, "Saturday");
                    arrayLists.add(arrayList26);
                    if (s2.equals("sat")) break;
                case "sun":
                    ArrayList<String> arrayList27 = new ArrayList<>(arrayList);
                    arrayList27.set(5, "Sunday");
                    arrayLists.add(arrayList27);
                    if (s2.equals("sun")) break;
            }
        }
        return arrayLists;
    }
}
