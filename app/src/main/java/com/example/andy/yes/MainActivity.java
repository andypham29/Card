package com.example.andy.yes;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;




    public void init(){
        final Button card_list = (Button) findViewById(R.id.card_list);
        final Button solo = (Button) findViewById(R.id.solo);
        final Button shop = (Button) findViewById(R.id.shop);
        final Button challenge = (Button) findViewById(R.id.challenge);
        final Button account = (Button) findViewById(R.id.account);
        final Button war = (Button) findViewById(R.id.war);

        solo.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent solo_page = new Intent(MainActivity.this, Solo.class);
                startActivity(solo_page);
            }
        });
        challenge.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent challenge_page = new Intent(MainActivity.this, Challenge.class);
                startActivity(challenge_page);
            }
        });
        shop.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent shop_page = new Intent(MainActivity.this, Shop.class);
                startActivity(shop_page);
            }
        });
        card_list.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent cardlist_page = new Intent(MainActivity.this, Card_list.class);
                startActivity(cardlist_page);
            }
        });
        war.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent war = new Intent(MainActivity.this, Bataille.class);
                startActivity(war);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);

         init();
    }
    public void ShowPopup(View v){
        TextView txtclose;
        myDialog.setContentView(R.layout.setting_popup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
}
