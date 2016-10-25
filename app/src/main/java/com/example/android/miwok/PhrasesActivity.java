package com.example.android.miwok;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList <Word> phrases = new ArrayList<>();
        phrases.add((new Word("sdfsdf","sdfsdf",R.drawable.family_younger_sister)));
        phrases.add((new Word("sdfsdf","sdfsdf")));
        phrases.add((new Word("sdfsdf","sdfsdf")));
        phrases.add((new Word("sdfsdf","sdfsdf")));
        phrases.add((new Word("sdfsdf","sdfsdf")));

        WordAdapter smth = new WordAdapter(this, phrases);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(smth);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
