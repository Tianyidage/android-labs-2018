package com.example.john.soft1614080902237;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class M3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);
        final EditText editText=(EditText)findViewById(R.id.edit_text);
        //获取控件
        Button btnLogin=(Button)findViewById(R.id.chaxun);
        Button buttonque=(Button)findViewById(R.id.queding);
        //final EditText EdPassword=(EditText) findViewById(R.id.edit_text);
        final EditText EdUserName=(EditText)findViewById(R.id.edit_text);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("jc", Context.MODE_PRIVATE);//创建SharedPreferences对象
                SharedPreferences.Editor editor = sharedPreferences.edit(); //需要获取SharedPreferences的编辑对象
                editor.putString("username", editText.getText().toString()); //向preferences写入数据：
                //editor.putString("Password", EdPassword.getText().toString());
                editor.commit();// 向preferences文件中提交数据：
                Intent intent=new Intent(M3Activity.this,M5Activity.class);
                startActivity(intent);
            }
        } );
        buttonque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(M3Activity.this,M7Activity.class);
                startActivity(intent);
            }
        });
    }
}
