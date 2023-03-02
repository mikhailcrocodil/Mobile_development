package ru.mirea.martynovmv.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView8);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button28);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.checkBox3);
        checkBox.setChecked(true);
    }
}