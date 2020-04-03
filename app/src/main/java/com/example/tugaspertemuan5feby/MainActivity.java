package com.example.tugaspertemuan5feby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private String packageContent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        Button btnPesanActivity = findViewById(R.id.btn_move_pesan);
        btnPesanActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
            break;

        }
        switch (v.getId()){
            case R.id.btn_move_pesan:
                Intent moveIntent1 = new Intent(MainActivity.this, PesanActivity.class);
                startActivity(moveIntent1);
                break;
        }
    }

}
