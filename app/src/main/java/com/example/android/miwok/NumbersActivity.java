package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of numbers
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "satu"));
        words.add(new Word("two", "dua"));
        words.add(new Word("three", "tiga"));
        words.add(new Word("four", "empat"));
        words.add(new Word("five", "lima"));
        words.add(new Word("six", "enam"));
        words.add(new Word("seven", "tujuh"));
        words.add(new Word("eight", "lapan"));
        words.add(new Word("nine", "sembilan"));
        words.add(new Word("ten", "sepuluh"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
