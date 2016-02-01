package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by hegberg on 2/1/16.
 */
public class EditEntryTest extends ActivityInstrumentationTestCase2{
    public EditEntryTest() {
        super(EditEntry.class);
    }

    //test if class successfully initializes
    public void testCreate() {
        EditEntry tester = new EditEntry();
        assertNotNull(tester);
    }

    //Can't test loadFromFile since it is private, also returns null exception if you make it public and try to test
    //Can't test saveInFile since it is private, also returns null exception if you make it public and try to test
}
