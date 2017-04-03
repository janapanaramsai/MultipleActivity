package com.example.ramsa.multipleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    public void toMainActivity(View view){
        Intent Intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(Intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Toast.makeText(this,intent.getStringExtra("name"), Toast.LENGTH_SHORT).show();

    }
}
