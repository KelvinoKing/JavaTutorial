/**
 * (Implement Comparable) Implement a new class that implements ­Comparator
 * of GregorianCalendar class to be able sort the calendar in increasing
 * order based on day, month, and year, in that order. Write a method to dis-
 * play the GregorianCalendar instance in “dd-MMM-yyyy” format using
 * SimpleDateFormat class. Write a test program with 10 ­GregorianCalendar
 * instances and display the results after the sort
 */

import java.text.SimpleDateFormat;
import java.util.*;


public class ImplementComparable {
    public static void main(String[] args){
        List<GregorianCalendar> list = new ArrayList<>();
        list.add(new GregorianCalendar(2019, 1, 1));
        list.add(new GregorianCalendar(2018, 1, 1));
        list.add(new GregorianCalendar(2019, 5, 10));
        list.add(new GregorianCalendar(2017, 1, 1));
        list.add(new GregorianCalendar(2019, 1, 13));
        list.add(new GregorianCalendar(2016, 1, 1));
        list.add(new GregorianCalendar(2012, 10, 30));
        list.add(new GregorianCalendar(2015, 1, 1));
        list.add(new GregorianCalendar(2019, 12, 12));
        list.add(new GregorianCalendar(2014, 1, 1));

        Collections.sort(list, new ImplementComparable().new GeorgianComparator());

        displayDates(list);
    }

    public static void displayDates(List<GregorianCalendar> list){
        for (GregorianCalendar date : list){
            System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(date.getTime()));
        }
    }

    public class GeorgianComparator implements Comparator<GregorianCalendar> {
        @Override
        public int compare(GregorianCalendar o1, GregorianCalendar o2) {
            if (o1.get(GregorianCalendar.YEAR) > o2.get(GregorianCalendar.YEAR))
                return 1;
            else if (o1.get(GregorianCalendar.YEAR) < o2.get(GregorianCalendar.YEAR))
                return -1;
            else {
                if (o1.get(GregorianCalendar.MONTH) > o2.get(GregorianCalendar.MONTH))
                    return 1;
                else if (o1.get(GregorianCalendar.MONTH) < o2.get(GregorianCalendar.MONTH))
                    return -1;
                else {
                    if (o1.get(GregorianCalendar.DAY_OF_MONTH) > o2.get(GregorianCalendar.DAY_OF_MONTH))
                        return 1;
                    else if (o1.get(GregorianCalendar.DAY_OF_MONTH) < o2.get(GregorianCalendar.DAY_OF_MONTH))
                        return -1;
                    else
                        return 0;
                }
            }
        }
    }
}