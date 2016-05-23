package com.census.demo.usabilitytestforbuttons;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// http://stackoverflow.com/questions/10266595/how-to-make-a-round-button

// http://stackoverflow.com/questions/6173400/how-to-programmatically-hide-a-button-in-android-sdk

// http://stackoverflow.com/questions/14376807/how-to-read-write-string-from-a-file-in-android
// Also see previous usability test for file writing function

// http://www.tutorialspoint.com/android/android_sqlite_database.htm
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
