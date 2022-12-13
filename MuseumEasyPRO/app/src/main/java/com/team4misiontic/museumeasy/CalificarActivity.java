package com.team4misiontic.museumeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalificarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar);
    }
    public void regresarCalificar(View view){
        Intent regHome = new Intent(CalificarActivity.this, MenuActivity.class);
        startActivity(regHome);
    }
}