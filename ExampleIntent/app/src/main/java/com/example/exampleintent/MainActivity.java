package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declare all the  view here
    EditText name,num,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize all the view here
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        link = findViewById(R.id.link);

    }

    public void next(View view) {
        //work with explicit intent
        String n = name.getText().toString();
        //intent is class name and needs an object
        //Intent obj = new Intent(present class, next class)
        //startActivity(obj)
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void Dail(View view) {
        //work with implicit intent
        String n = num.getText().toString();
        //URI (unified resource identifier
        Uri uri = Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https://+n");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }
}