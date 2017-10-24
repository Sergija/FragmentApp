package com.app.smm.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mArriba;
    Button mAbaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArriba = (Button) findViewById(R.id.btn_arriba);
        mAbaj = (Button) findViewById(R.id.btn_abaj);

        //
        FragmentManager fm =getSupportFragmentManager();
        Fragment fraq1 = new Fragment1();
        //Fragment fraq2 = new Fragment2();
        Fragment fraq3 = new Fragment3();
        //Fragment fraq4 = new Fragment4();

        //pdem fer servir add ?  replace ?
        //pdriams hacer cmmi  añadir replace, en ese cas añadims replace
        fm.beginTransaction().replace(R.id.contenedor_superior, fraq1).replace(R.id.contenedor_inferior, fraq3).commit();

        mArriba.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                FragmentManager fm =getSupportFragmentManager();
                Fragment fraq2 = new Fragment2();
                fm.beginTransaction().replace(R.id.contenedor_superior, fraq2).commit();

            }
        });

        mAbaj.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                FragmentManager fm =getSupportFragmentManager();
                Fragment fraq4 = new Fragment4();
                fm.beginTransaction().replace(R.id.contenedor_inferior, fraq4).commit();

            }
        });
    }
}
