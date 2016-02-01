package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Chris on 1/31/2016.
 */
public class LogEntryTest extends ActivityInstrumentationTestCase2 {
    public LogEntryTest() {
        super(LogEntry.class);
    }

    public void testSetAll() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        testing.setAll(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
    }

    public void testGetDate() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getDate(), "2010-01-01");
    }

    public void testGetStation() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getStation(), "Costco");
    }

    public void testGetOdometer() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getOdometer(), 24.0);
    }

    public void testGetFuelGrade() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getFuelGrade(), "high");
    }

    public void testGetFuelAmount() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getFuelAmount(), 20.0);
    }

    public void testGetFuelUnitCost() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getFuelUnitCost(), 25.0);
    }

    public void testGetFuelCost() {
        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 20.0;
        double fuelUnitCost = 25.0;
        double fuelTotalCost = 5.0;

        LogEntry testing = new LogEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost, fuelTotalCost);
        assertEquals(testing.getFuelCost(), 5.0);
    }
}
