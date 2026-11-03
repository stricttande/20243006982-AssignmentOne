package com.waikato.campuslife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFacilities(View view) {
        showClicked("Facilities");
    }

    public void openEvents(View view) {
        showClicked("Events");
    }

    public void openClubs(View view) {
        showClicked("Clubs");
    }

    public void openSupport(View view) {
        showClicked("Support");
    }

    private void showClicked(String topic) {
        Toast.makeText(this, topic + " clicked", Toast.LENGTH_SHORT).show();
    }

}
