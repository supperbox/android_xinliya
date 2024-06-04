package com.example.test7;

import android.content.Intent;
import android.os.Bundle;
//import android.view.Gravity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
//import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.btn_1);
        username = findViewById(R.id.et_1);
        password = findViewById(R.id.et_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        String ok = "登陆成功！";
        login.setOnClickListener(new View.OnClickListener() {
            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
//                Intent intent = null;
//                intent = new Intent(MainActivity.this, FunActivity.class);
//                startActivity(intent);
//
//            }
            public void onClick(View v){
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String ok = "登陆成功！";
                String fail = "用户名或密码有误，请重新输入！";
                Intent intent = null;
                if (user.equals("wyh") && pass.equals("wyh")){
                    //toast用法1
                    Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
                    //
                    intent = new Intent(MainActivity.this, FunActivity.class);
                    startActivity(intent);
                }else{//toast用法2
                    Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                }

            }
        });



        }







//    private void onClick(View v){
//        String user = username.getText().toString();
//        String pass = password.getText().toString();
//        String ok = "登陆成功！";
//        String fail = "用户名或密码有误，请重新输入！";
//        Intent intent = null;
//        if (user=="wyh"&&pass=="wyh"){
//            //toast用法1
//            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();
//            //
//            intent = new Intent(MainActivity.this, FunActivity.class);
//            startActivity(intent);
//        }else{//toast用法2
//            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
//            toastCenter.setGravity(Gravity.CENTER,0,0);
//            toastCenter.show();
//        }
//
//    }

}