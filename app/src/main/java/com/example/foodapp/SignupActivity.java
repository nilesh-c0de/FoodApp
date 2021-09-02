package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodapp.model.Customer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private DatabaseReference users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        auth = FirebaseAuth.getInstance();
//        //FirebaseDatabase database = FirebaseDatabase.getInstance();
//        users = FirebaseDatabase.getInstance().getReference("customerData");
//
//        Button sing_up = findViewById(R.id.buttonSumbit);
//        final EditText rEmail = findViewById(R.id.edit_email);
//        final EditText rName = findViewById(R.id.edit_name);
//        final EditText rPass = findViewById(R.id.edit_pass);
//        final EditText rCpass = findViewById(R.id.edit_cpass);
//        final EditText rMb = findViewById(R.id.edit_mb);
//
//        sing_up.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final String name = rName.getText().toString();
//                final String email = rEmail.getText().toString();
//                final String pass = rPass.getText().toString();
//                final String cpass = rCpass.getText().toString();
//                final String mb = rMb.getText().toString();
//
//                if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || cpass.isEmpty() || mb.isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
//                } else {
//                    auth.createUserWithEmailAndPassword(email, pass)
//                            .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
//                                @Override
//                                public void onComplete(@NonNull Task<AuthResult> task) {
//                                    if (task.isSuccessful()) {
//                                        users.addListenerForSingleValueEvent(new ValueEventListener() {
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                final Customer usr = new Customer(email, pass, cpass, name, mb, "");
//                                                users.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(usr);
//                                                Toast.makeText(getApplicationContext(), "Registered successfully!", Toast.LENGTH_SHORT).show();
//                                            }
//
//                                            @Override
//                                            public void onCancelled(@NonNull DatabaseError databaseError) {
//                                                Toast.makeText(getApplicationContext(), "Failed!", Toast.LENGTH_SHORT).show();
//                                            }
//                                        });
//                                    } else {
//                                        Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            });
//                }
//            }
//        });
    }
}