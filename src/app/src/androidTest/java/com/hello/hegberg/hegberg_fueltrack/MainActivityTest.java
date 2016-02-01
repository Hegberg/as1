package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Chris on 1/31/2016.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    //test if class successfully initializes
    public void testCreate() {
        MainActivity tester = new MainActivity();
        assertNotNull(tester);
    }

}
