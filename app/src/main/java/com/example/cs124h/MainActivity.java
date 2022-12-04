package com.example.cs124h;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Main screen
public class MainActivity extends AppCompatActivity {
    private String name;
    private int age;
    private String gender;
    private int timeIndoors;
    private int productiveHours;
    private int physicalActivityHours;

    private EditText nameInput;
    private EditText ageInput;
    private EditText genderInput;
    private EditText timeIndoorsInput;
    private EditText productiveHoursInput;
    private EditText physicalActivityHoursInput;

    private Button submitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput = (EditText) findViewById(R.id.nameInput);
        ageInput = (EditText) findViewById(R.id.ageInput);
        genderInput = (EditText) findViewById(R.id.genderInput);
        timeIndoorsInput = (EditText) findViewById(R.id.timeIndoorsInput);
        productiveHoursInput = (EditText) findViewById(R.id.productiveHoursInput);
        physicalActivityHoursInput = (EditText) findViewById(R.id.physicalActivityHoursInput);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                age = Integer.valueOf(ageInput.getText().toString());
                gender = genderInput.getText().toString();
                timeIndoors = Integer.valueOf(timeIndoorsInput.getText().toString());
                productiveHours = Integer.valueOf(productiveHoursInput.getText().toString());
                physicalActivityHours = Integer.valueOf(physicalActivityHoursInput.getText().toString());
            }
        });
    }


}