package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Chris on 1/31/2016.
 */
public class AddEntryTest extends ActivityInstrumentationTestCase2 {
    public AddEntryTest() {
        super(AddEntry.class);
    }

    public void testAddNewEntry() {
        AddEntry addNew = new AddEntry();

        String date = "2010-01-01";
        String station = "Costco";
        double odometer = 24.0;
        String fuelGrade = "high";
        double fuelAmount = 25.0;
        double fuelUnitCost = 25.0;

        addNew.addNewEntry(date, station, odometer, fuelGrade, fuelAmount, fuelUnitCost);
    }

    public void testLoad() {
        AddEntry addNew = new AddEntry();

        addNew.loadFromFile();
    }

    public void testSave() {
        AddEntry addNew = new AddEntry();

        addNew.saveInFile();


    }
}
