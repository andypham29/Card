package com.example.andy.yes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Andy on 2017-12-30.
 */

public class DeckFragment extends Fragment {

    private static final String TAG = "DeckFragment";
    private Button btn_deck;
    private TextView deck_display;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.deck_frag,container,false);
        btn_deck = (Button) view.findViewById(R.id.btn_deck);

        btn_deck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Removed from Deck",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
