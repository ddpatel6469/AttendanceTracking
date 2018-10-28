package com.example.ddpatel.attendancetracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityTeacherLogin extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        TextView t1 = (TextView) findViewById(R.id.textView3);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityTeacherLogin.this,ActivityTeacherSignup.class);
                startActivity(i);
            }
        });
    }
}
