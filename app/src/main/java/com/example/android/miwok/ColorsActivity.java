package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One","Один",R.mipmap.ic_launcher));
//        words.add(new Word("two","два"));
//        words.add(new Word("three","три"));
//        words.add(new Word("four","четыре"));
//        words.add(new Word("five","пять"));
//        words.add(new Word("six","шесть"));
//        words.add(new Word("seven","семь"));
//        words.add(new Word("eight","восемь"));
//        words.add(new Word("nine","девять"));
//        words.add(new Word("ten","десять"));
//        words.add(new Word("One","Один"));
//        words.add(new Word("two","два"));
//        words.add(new Word("three","три"));
//        words.add(new Word("four","четыре"));
//        words.add(new Word("five","пять"));
//        words.add(new Word("six","шесть"));
//        words.add(new Word("seven","семь"));
//        words.add(new Word("eight","восемь"));
//        words.add(new Word("nine","девять"));
//        words.add(new Word("ten","десять"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list1);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
