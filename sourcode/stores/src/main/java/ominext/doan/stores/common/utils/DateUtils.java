package ominext.doan.stores.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static Date getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
}
