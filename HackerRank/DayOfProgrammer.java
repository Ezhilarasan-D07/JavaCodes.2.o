
/*

    From 1700 to 1917, Russia's official calendar was the Julian calendar; 
    since 1919 they used the Gregorian calendar system. The transition from 
    the Julian to Gregorian calendar system occurred in 1918, when the 
    next day after January 31st was February 14th. This means that in 1918, 
    February 14th was the 32nd day of the year in Russia.
    In both calendar systems, February is the only month with a variable 
    amount of days; it has 29 days during a leap year, and 28 days during all other years. 
    In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, 
    leap years are either of the following:

    Divisible by 400.
    Divisible by 4 and not divisible by 100.

    -> Input : 2016 output : 12.09.2016
    -> Input : 2017 output : 13.09.2017
    -> Input : 1800 output : 12.09.1800

*/

public class DayOfProgrammer {
    static String findDayOfProgrammer (int year)    {
        // transition year.
        if (year == 1918) 
            return "26.08." + year;
        // Julian calendar, leap years are divisible by 4.
        else if (year < 1918 && year % 4 == 0)  
            return "12.09." + year; 
        // the Gregorian calendar : Divisible by 400, Divisible by 4 and not divisible by 100.
        else if ((year > 1918) && (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
            return "12.09." + year;
        // non leap year.
        return "13.09." + year;
    }

    public static void main (String ... varChar)  {
        System.out.println(findDayOfProgrammer(2016));
        System.out.println(findDayOfProgrammer(2017));
        System.out.println(findDayOfProgrammer(1800));
    }
}
