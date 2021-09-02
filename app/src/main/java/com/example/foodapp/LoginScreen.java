package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginScreen extends AppCompatActivity {

    Button btn;
    TextView txtRegister, txtFp;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        auth = FirebaseAuth.getInstance();



        btn = findViewById(R.id.btn_login);
        txtRegister = findViewById(R.id.textRegister);
        txtFp = findViewById(R.id.textFp);
        TextInputLayout textInputLayout = findViewById(R.id.email);
        TextInputLayout textInputLayout2 = findViewById(R.id.password);


        // ha code lihala aatta

        // firebase authentication add kel

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                final String textEmail = textInputLayout.getEditText().getText().toString();
//                final String textPassword = textInputLayout2.getEditText().getText().toString();;
//
//                if (textEmail.isEmpty() || textPassword.isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "Please enter email & password!", Toast.LENGTH_SHORT).show();
//                } else {
//                    auth.signInWithEmailAndPassword(textEmail, textPassword)
//                            .addOnCompleteListener(LoginScreen.this, new OnCompleteListener<AuthResult>() {
//                                @Override
//                                public void onComplete(@NonNull Task<AuthResult> task) {
//
//                                    if (task.isSuccessful()) {
//                                        Toast.makeText(getApplicationContext(), "Authencation success :)", Toast.LENGTH_SHORT).show();
//
//                                        //saveLoginData(textEmail, textPassword);
//
//                                        startActivity(new Intent(getApplicationContext(), HomeScreen.class));
//                                    } else {
//                                        Toast.makeText(getApplicationContext(), "Authencation failed!", Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            });
//                }
////                Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
////                startActivity(intent);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CartActivity.class));
            }
        });
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SignupActivity.class));
            }
        });

        txtFp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ForgotActivity.class));
            }
        });
    }
}