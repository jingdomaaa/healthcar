package com.nit.healthcar.carmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
import android.os.Message;

public class Login extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textView;
    private Button button;
    Handler handler = new Handler(message -> {
        if(message.what == 1) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
        return false;
    });
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editText1 = findViewById(R.id.editText6);
        editText2 = findViewById(R.id.editText7);
        textView = findViewById(R.id.sign);
        button = findViewById(R.id.btn2);
        button.setOnClickListener(view -> {
            final String account = editText1.getText().toString().trim();
            final String password = editText2.getText().toString().trim();
            if (account == null || account.equals("")) {
                Toast.makeText(Login.this, "帐号不能为空", Toast.LENGTH_SHORT).show();
            } else if (password == null || password.equals("")) {
                Toast.makeText(Login.this, "密码不能为空", Toast.LENGTH_SHORT).show();
            } else {
                new Thread(() -> {
                    Message msg = new Message();
                    if (DBUtils.getUserInfoByAccount(account, password) == 1) {
                        msg.what = 1;
                    } else {
                       msg.what = -1;
                    }
                    Log.e("DBUtils",msg.what + " ");
                    handler.sendMessage(msg);
                }).start();
            }
        });
        //下面是注册界面
        textView.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this, Sign.class);
            startActivity(intent);
        });
    }
}