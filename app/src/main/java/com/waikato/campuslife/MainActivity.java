package com.waikato.campuslife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    static final String EXTRA_TOPIC_INDEX = "topic_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFacilities(View view) {
        openTopic(0, "Facilities");
    }

    public void openEvents(View view) {
        openTopic(1, "Events");
    }

    public void openClubs(View view) {
        openTopic(2, "Clubs");
    }

    public void openSupport(View view) {
        openTopic(3, "Support");
    }

    // Keep the button index aligned with the order of the topic arrays.
    private void openTopic(int index, String topic) {
        Toast.makeText(this, topic + " clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_TOPIC_INDEX, index);
        startActivity(intent);
    }

}
