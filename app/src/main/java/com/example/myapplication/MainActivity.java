package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume () {
        super.onResume(); //este codigo se ejecuta ante de todos.

        // en este punto la aplicacion ya cargo
        // this en un activity: contexto o escencia de una pantalla
        // this es de tipo contexto

        Toast.makeText(this,
                "aplicacion iniciada",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onStop() {
        super.onStop();
        Toast.makeText(this,
                "aplicacion estpeada",
                Toast.LENGTH_SHORT).show();
    }
}
