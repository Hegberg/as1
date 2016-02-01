package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by hegberg on 2/1/16.
 */
public class ViewEntryTest extends ActivityInstrumentationTestCase2 {
    public ViewEntryTest() {
        super(ViewEntry.class);
    }

    //test if class successfully initializes
    public void testCreate() {
        ViewEntry tester = new ViewEntry();
        assertNotNull(tester);
    }

    //Can't test loadFromFile since it is private, also returns null exception if you make it public and try to test
}
