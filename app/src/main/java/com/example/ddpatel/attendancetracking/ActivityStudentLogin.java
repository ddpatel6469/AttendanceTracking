package com.example.ddpatel.attendancetracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Patterns;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;


public class ActivityStudentLogin extends Activity {

    EditText et;
    EditText et2;
    Button bt;

    private AwesomeValidation awesomeValidation;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        et = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        bt = (Button) findViewById(R.id.button);

        TextView t = (TextView) findViewById(R.id.textView3);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityStudentLogin.this, ActivityStudentSignup.class);
                startActivity(i);
            }
        });

        awesomeValidation.addValidation(this, R.id.editText, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.editText2, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.passworderror);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });


    }


    private void submitForm(){
        if(awesomeValidation.validate()){
            Toast.makeText(this, "Sign in successfull", Toast.LENGTH_LONG).show();
        }
    }
}
