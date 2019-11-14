package com.shadyboshra2012.android.udacityquizappproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Define submit variable and set its click event.
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            // Define score variable to count the score
            // of correct answers.
            int correctAnswers = 0;
            // Define all answers variables
            // Question 1
            CheckBox question1CheckBoxSwift = findViewById(R.id.question_1_check_box_swift);
            CheckBox question1CheckBoxJava = findViewById(R.id.question_1_check_box_java);
            CheckBox question1CheckBoxKotlin = findViewById(R.id.question_1_check_box_kotlin);
            CheckBox question1CheckBoxCSharp = findViewById(R.id.question_1_check_box_c_sharp);
            // Question 2
            RadioButton question2RadioBtnBoolean = findViewById(R.id.question_2_radio_btn_boolean);
            /* Unused variables
            RadioButton question2RadioBtnInt = findViewById(R.id.question_2_radio_btn_int);
            RadioButton question2RadioBtnDouble = findViewById(R.id.question_2_radio_btn_double);
            RadioButton question2RadioBtnString = findViewById(R.id.question_2_radio_btn_string);*/
            // Question 3
            EditText question3EditText = findViewById(R.id.question_3_edit_text);
            // Question 4
            CheckBox question4CheckBoxChocolate = findViewById(R.id.question_4_check_box_chocolate);
            CheckBox question4CheckBoxKitkat = findViewById(R.id.question_4_check_box_kitkat);
            CheckBox question4CheckBoxCupcake = findViewById(R.id.question_4_check_box_cupcake);
            CheckBox question4CheckBoxLollipop = findViewById(R.id.question_4_check_box_lollipop);
            // Question 5
            EditText question5EditText = findViewById(R.id.question_5_edit_text);
            // Check answers..
            // Answer 1
            if (!question1CheckBoxSwift.isChecked() && question1CheckBoxJava.isChecked()
                    && question1CheckBoxKotlin.isChecked() && !question1CheckBoxCSharp.isChecked())
                correctAnswers++;
            // Answer 2
            if (question2RadioBtnBoolean.isChecked())
                correctAnswers++;
            // Answer 3
            if (question3EditText.getText().toString().toLowerCase().equals("string"))
                correctAnswers++;
            // Answer 4
            if (!question4CheckBoxChocolate.isChecked() && question4CheckBoxKitkat.isChecked()
                    && question4CheckBoxCupcake.isChecked() && question4CheckBoxLollipop.isChecked())
                correctAnswers++;
            // Answer 5
            if (question5EditText.getText().toString().equals("2008"))
                correctAnswers++;
            // Show result in Toast
            Toast.makeText(this, "Your result is " + correctAnswers + "/5.", Toast.LENGTH_LONG).show();
        });
    }
}
