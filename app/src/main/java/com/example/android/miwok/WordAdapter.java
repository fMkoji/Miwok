package com.example.android.miwok;

//import android.app.Activity;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
public class WordAdapter extends android.widget.ArrayAdapter<Word> {
    public WordAdapter(android.app.Activity context, java.util.ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }


    @android.support.annotation.NonNull
    @Override
    public android.view.View getView(int position, @android.support.annotation.NonNull android.view.View convertView, @android.support.annotation.NonNull android.view.ViewGroup parent) {
        android.view.View listItemView = convertView;
        if (listItemView == null) {
            listItemView = android.view.LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        android.widget.TextView miwokTextView = (android.widget.TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        android.widget.TextView defaultTextView = (android.widget.TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }

}


