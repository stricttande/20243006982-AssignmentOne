package com.waikato.campuslife;

import android.app.Activity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
    @SuppressLint("DiscouragedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // The same index selects matching titles, descriptions, and image names.
        int index = getIntent().getIntExtra(MainActivity.EXTRA_TOPIC_INDEX, 0);
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] content = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);
        int imageId = getResources().getIdentifier(imageNames[index].trim(), "drawable", getPackageName());

        ((TextView) findViewById(R.id.detail_banner_title)).setText(titles[index].trim());
        ((TextView) findViewById(R.id.detail_title)).setText(titles[index].trim());
        ((TextView) findViewById(R.id.detail_content)).setText(content[index].trim());
        ((ImageView) findViewById(R.id.detail_image)).setImageResource(imageId);
    }
}
