package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Chris on 1/31/2016.
 */
public class AddEntryTest extends ActivityInstrumentationTestCase2 {
    public AddEntryTest() {
        super(AddEntry.class);
    }

    //test if class successfully initializes
    public void testCreate() {
        AddEntry tester = new AddEntry();
        assertNotNull(tester);
    }

    //Can't test loadFromFile since it is private, also returns null exception if you make it public and try to test
    //Can't test saveInFile since it is private, also returns null exception if you make it public and try to test

}
