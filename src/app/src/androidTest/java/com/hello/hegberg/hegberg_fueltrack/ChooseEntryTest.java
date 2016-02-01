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

    public void testAddButtons() {
        ChooseEntry tester = new ChooseEntry();
        int number = 4;
        RadioButton[] radioGrouper = new RadioButton[number];
        //tester.radioGroup = radioGrouper;
        tester.addButtons(number);
    }

    public void testOnStart() {
        ChooseEntry tester = new ChooseEntry();
        testOnStart();
    }
}
