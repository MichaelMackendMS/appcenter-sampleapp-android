package com.example.appcenter.sampleapp_android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.After;
import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        reportHelper.label("Testing useAppContext...");

        Context appContext = InstrumentationRegistry.getTargetContext();
        android.util.Log.d("message: ", "Checking use app context!");

        assertEquals("com.example.appcenter.sampleapp_android", appContext.getPackageName());
    }

    @After
    public void TearDown(){
        reportHelper.label("Stopping App");
    }
}
