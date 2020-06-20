package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int number;

    public void guess(View view){

        EditText guessEditText= (EditText) findViewById(R.id.editText3);

        int guessint= Integer.parseInt(guessEditText.getText().toString());

        if(guessint>number){

            Toast.makeText(this, "Guess lower!", Toast.LENGTH_SHORT).show();
        } else if(guessint < number) {

            Toast.makeText(this, "Guess higher!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "You are right! Try again", Toast.LENGTH_SHORT).show();

            Random rand= new Random();

            number =rand.nextInt(50)+1;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand= new Random();
        number =rand.nextInt(50)+1;

    }
}
