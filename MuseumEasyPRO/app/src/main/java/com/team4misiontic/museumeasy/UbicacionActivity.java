package com.team4misiontic.museumeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;

public class UbicacionActivity extends AppCompatActivity {
    private Location punto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
    }

    public void regresarUbicacion(View view){
        Intent back = new Intent(UbicacionActivity.this, MenuActivity.class);
        startActivity(back);
    }

    public void miUbicacion(View view){
        Intent intent = new Intent(UbicacionActivity.this, MapsActivity.class);
        intent.putExtra("punto", punto);
        startActivity(intent);
    }

    public void tipoTransporte(View view){
        Intent intent = new Intent(UbicacionActivity.this, TipoTransporteActivity.class);
        startActivity(intent);
    }
}