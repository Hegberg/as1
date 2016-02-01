package com.hello.hegberg.hegberg_fueltrack;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.RadioButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Chris on 1/31/2016.
 */
public class ChooseEntryTest extends ActivityInstrumentationTestCase2 {
    public ChooseEntryTest() {
        super(ChooseEntry.class);
    }

    //test if class successfully initializes
    public void testCreate() {
        ChooseEntry tester = new ChooseEntry();
        assertNotNull(tester);
    }


    public void testAddButtons() {
        ChooseEntry tester = new ChooseEntry();
        int number = 4;

        //fails do to null pointer exceptions, even though function works properly
        tester.addButtons(number);
    }


    //Can't test loadFromFile since it is private, also returns null exception if you make it public and try to test

}
