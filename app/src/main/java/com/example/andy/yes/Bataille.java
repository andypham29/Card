package com.example.andy.yes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bataille extends AppCompatActivity implements Animation.AnimationListener,View.OnClickListener{

    ImageView one, two, three;
    List<String> cards = new ArrayList<>();
    Button btnNewGame;

    boolean oneBackShow = true, twoBackShow = true, threeBackShow = true;

    Animation toMiddle, fromMiddle;

    int flagCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bataille);

        one = (ImageView)findViewById(R.id.one);
        two = (ImageView)findViewById(R.id.two);
        three = (ImageView)findViewById(R.id.three);

        btnNewGame = (Button)findViewById(R.id.btnNewGame);
        toMiddle.setAnimationListener(this);
        fromMiddle.setAnimationListener(this);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);

        btnNewGame.setOnClickListener(this);

        setUp();


    }

    private void setUp() {
        cards.clear();
        cards.add("a");
        cards.add("k");
        cards.add("k");

        Collections.shuffle(cards);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnNewGame){ newGame();}

        else {

            v.clearAnimation();
            v.setAnimation(toMiddle);
            v.setAnimation(fromMiddle);

            if (v.getId() == R.id.one) {
                flagCard = 0;
            }
            else if (v.getId() == R.id.two) {
                flagCard = 1;
            }
            else if (v.getId() == R.id.three) {
                flagCard = 2;
            }
        }
    }

    private void newGame() {
        Collections.shuffle(cards);

        Animation anim_one = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_one);
        Animation anim_two = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_two);

        one.startAnimation(anim_one);
        two.startAnimation(anim_two);
        three.startAnimation(anim_two);

        one.setImageResource(R.drawable.bg01);
        two.setImageResource(R.drawable.bg01);
        three.setImageResource(R.drawable.bg01);

        oneBackShow = twoBackShow = threeBackShow = true;
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if(flagCard == 0){
            if(animation == toMiddle){
                showCard(oneBackShow, (ImageView)findViewById(R.id.one), flagCard);
            }else{
                ((ImageView)findViewById(R.id.one)).setImageResource(R.drawable.bg01);
            }
            findViewById(R.id.one).clearAnimation();
            findViewById(R.id.one).setAnimation(fromMiddle);
            findViewById(R.id.one).startAnimation(fromMiddle);
        }else{
            oneBackShow = !oneBackShow;
        }
        if(flagCard == 1){
            if(animation == toMiddle){
                showCard(oneBackShow, (ImageView)findViewById(R.id.two), flagCard);
            }else{
                ((ImageView)findViewById(R.id.two)).setImageResource(R.drawable.bg01);
            }
            findViewById(R.id.two).clearAnimation();
            findViewById(R.id.two).setAnimation(fromMiddle);
            findViewById(R.id.two).startAnimation(fromMiddle);
        }else{
            twoBackShow = !twoBackShow;
        }
        if(flagCard == 2){
            if(animation == toMiddle){
                showCard(oneBackShow, (ImageView)findViewById(R.id.three), flagCard);
            }else{
                ((ImageView)findViewById(R.id.three)).setImageResource(R.drawable.bg01);
            }
            findViewById(R.id.three).clearAnimation();
            findViewById(R.id.three).setAnimation(fromMiddle);
            findViewById(R.id.three).startAnimation(fromMiddle);
        }else{
            threeBackShow = !threeBackShow;
        }
    }

    private void showCard(boolean isBackShow, ImageView imgView, int index) {
        if(isBackShow){
            if(index == 0){
                if(cards.get(0).equals("a")){
                    imgView.setImageResource(R.drawable.dia01);
                }
                else if(cards.get(0).equals("k")){
                    imgView.setImageResource(R.drawable.spad13);
                }
            }
            if(index == 1){
                if(cards.get(1).equals("a")){
                    imgView.setImageResource(R.drawable.dia01);
                }
                else if(cards.get(1).equals("k")){
                    imgView.setImageResource(R.drawable.spad13);
                }
            }
            if(index == 2){
                if(cards.get(2).equals("a")){
                    imgView.setImageResource(R.drawable.dia01);
                }
                else if(cards.get(2).equals("k")){
                    imgView.setImageResource(R.drawable.spad13);
                }
            }
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
