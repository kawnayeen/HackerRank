package algorithm.implementation;


/**
 * kawnayeen
 * 12/9/18
 */
public class _34_LibraryFine {

    int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        YearMonthDay returnDay = new YearMonthDay(d1, m1, y1);
        YearMonthDay dueDay = new YearMonthDay(d2, m2, y2);
        if (dueDay.isEarlierOrEqual(returnDay))
            return 0;
        if (!dueDay.isSameYear(returnDay))
            return 10000;
        if (!dueDay.isSameMonth(returnDay)) {
            return dueDay.getMonthDifference(returnDay) * 500;
        }
        return dueDay.getDayDifference(returnDay) * 15;
    }

    private class YearMonthDay {
        int day;
        int month;
        int year;

        public YearMonthDay(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public boolean isSameYear(YearMonthDay anotherDate) {
            return year == anotherDate.year;
        }

        public boolean isSameMonth(YearMonthDay anotherDate) {
            return month == anotherDate.month;
        }

        public boolean isSameDay(YearMonthDay anotherDate) {
            return day == anotherDate.day;
        }

        public int getMonthDifference(YearMonthDay anotherDate) {
            return anotherDate.month - month;
        }

        public int getDayDifference(YearMonthDay anotherDate) {
            return anotherDate.day - day;
        }

        public boolean isEarlierOrEqual(YearMonthDay anotherDate) {
            if (anotherDate.year < year)
                return true;
            if (isSameYear(anotherDate) && anotherDate.month < month)
                return true;
            if (isSameMonth(anotherDate) && isSameYear(anotherDate) && anotherDate.day <= day)
                return true;
            return false;
        }
    }
}
