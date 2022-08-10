package com.app.websocket.utils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public static String getDateTimeStringZone() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss Z");
        String formattedString = zonedDateTime.format(formatter);
        return formattedString;
    }

    public static String getDateStringZone() {
        // of(int year, int month, int dayOfMonth, int hour, int minute, int second, int
        // nanoOfSecond, ZoneId zone)
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedString = zonedDateTime.format(formatter);
        return formattedString;
    }

    public static String getDateTimeStringZone(int year, int month, int dayOfMonth, int hour, int minute, int second,
                                               int nanoOfSecond, ZoneId zone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond,
                zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss Z");
        String formattedString = zonedDateTime.format(formatter);
        return formattedString;
    }

    public static String getDayOfWeekString() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));
        String dayOfWeek = zonedDateTime.getDayOfWeek().toString();
        return dayOfWeek;
    }

    public static Integer getCurrentHour() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));
        Integer currentHour = zonedDateTime.getHour();
        return currentHour;
    }

    public static ZonedDateTime getDate() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));
        return zonedDateTime;
    }
}
