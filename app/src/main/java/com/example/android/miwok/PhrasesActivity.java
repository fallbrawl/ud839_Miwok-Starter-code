package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

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
}
