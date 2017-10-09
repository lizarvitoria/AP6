package com.example.dm2.ap6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton btnToggle1, btnToggle2, btn2, btn4;
    private Button btn1, btn3;
    private Switch btnSwitch1, btnSwitch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToggle1 = (ToggleButton)findViewById(R.id.btnToggle1);
        btnToggle2 = (ToggleButton)findViewById(R.id.btnToggle2);
        btnSwitch1 = (Switch)findViewById(R.id.btnSwitch1);
        btnSwitch2 = (Switch)findViewById(R.id.btnSwitch2);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (ToggleButton)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (ToggleButton)findViewById(R.id.btn4);
    }

    public void activar(View v){
        btn2.setChecked(btnSwitch2.isChecked());
        btn4.setChecked(btnToggle2.isChecked());
    }


    public void encender(View v){
        if(btnSwitch1.isChecked())
            btn1.setVisibility(View.INVISIBLE);
        else
            btn1.setVisibility(View.VISIBLE);

        if(btnToggle1.isChecked())
            btn3.setVisibility(View.INVISIBLE);
        else
            btn3.setVisibility(View.VISIBLE);

    }
}
