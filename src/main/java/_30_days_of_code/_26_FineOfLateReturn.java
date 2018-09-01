package _30_days_of_code;

public class _26_FineOfLateReturn {
    public int fine(String returnDate, String dueDate) {
        YearMonthDay returnDay = new YearMonthDay(returnDate);
        YearMonthDay dueDay = new YearMonthDay(dueDate);
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

        public YearMonthDay(String dmy) {
            String[] splitValue = dmy.split(" ");
            day = Integer.parseInt(splitValue[0]);
            month = Integer.parseInt(splitValue[1]);
            year = Integer.parseInt(splitValue[2]);
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
