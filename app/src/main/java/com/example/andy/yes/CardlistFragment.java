package com.example.andy.yes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Andy on 2017-12-30.
 */

public class CardlistFragment extends Fragment {

    private static final String TAG = "CardlistFragment";
    private Button btn_cardlist,btn_card;

    static LinkedList<Card> d1 = new LinkedList<>();
    static String[] typeRNG = {"rock", "paper", "scissor"};
    static String[] effectRNG = {"none", "special"};
    static String[] raretyRNG = {"common","uncommon","rare","very rare"};

    public static int random(String[] a) {
        int length = a.length;
        Random random = new Random();
        int rng = random.nextInt(length);

        return rng;
    }
    public static void addCard() {
        String a = typeRNG[random(typeRNG)];
        String b = effectRNG[random(effectRNG)];
        String c = raretyRNG[random(raretyRNG)];

        Card c1 = new Card(a,b,c);
        d1.add(c1);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cardlist_frag,container,false);
        btn_cardlist = (Button) view.findViewById(R.id.btn_cardlist);

        btn_cardlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Added to Deck",Toast.LENGTH_SHORT).show();
            }
        });
        btn_card.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                addCard();
            }
        });
        return view;
    }
}
