package com.example.mymobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mymobileapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText loginEmail;
    private EditText loginPassword;
    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//===============================================================================================
        //Setup binding
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        binding.buttonLogin.setOnClickListener(view -> {
//            Toast.makeText(this, "Bạn vừa đăng nhập", Toast.LENGTH_SHORT).show();
//        });
//===============================================================================================
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        LoginUser loginUser = new LoginUser();
        mActivityMainBinding.setLoginUser(loginUser);

        loginEmail = findViewById(R.id.loginEmail);
        loginPassword = findViewById(R.id.loginPassword);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (loginEmail.getText().toString().equals("admin") || loginEmail.getText().toString().equals("vune") && loginPassword.getText().toString().equals("123456")) {
                    nextActivity();
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


//===============================================================================================
//        setContentView(R.layout.activity_main);
//        btnLogin = (Button)findViewById(R.id.buttonLogin);

        //Option1:
//        btnLogin.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "nguuuuuuuuu", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    //Option2:
//    public void onLogin(View view){
//        Toast.makeText(MainActivity.this, "Bạn vừa đăng nhập", Toast.LENGTH_SHORT).show();
//    }

    private void nextActivity() {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        intent.putExtra("loginEmail", loginEmail.getText().toString().trim());
        startActivity(intent);
    }
}