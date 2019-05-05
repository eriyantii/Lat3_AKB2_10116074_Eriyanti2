package com.example.lat3_akb2_10116074_eriyanti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// nama eriyanti
// nim 10116074
//waktu pengerjaan tanggal 3 mei 2019 jam 14.21

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread() {
            public void run(){
                try {
                sleep (3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            startActivity(new Intent(MainActivity.this,WelcomeActivity.class));
            finish();
        }}
    };thread.start();
        }

}