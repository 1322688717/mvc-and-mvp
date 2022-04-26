package com.example.mvcdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnOnclick;
    TextView tvTxt;

    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private String getData() {
        boolean isSuccess;
        Random random = new Random();
        isSuccess = random.nextBoolean();
        if (isSuccess == true){
            BeanAccount beanAccount = new BeanAccount();
            String name = beanAccount.getName();
            int levle = beanAccount.getLevle();
            showSuccess();
            return name;
        }else {
            fail();
            return "获取失败";
        }
    }

    private void showText(String txt) {
        tvTxt.setText(txt);
    }

    private void fail() {
        if (toast!= null){
            toast.cancel();
            toast = Toast.makeText(this,"获取失败",Toast.LENGTH_SHORT);
        }else {

            toast = Toast.makeText(this,"获取失败",Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    private void showSuccess() {

        if (toast!= null){
            toast.cancel();
            toast = Toast.makeText(this,"获取成功",Toast.LENGTH_SHORT);
        }else {

            toast = Toast.makeText(this,"获取成功",Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    private void initView() {
        btnOnclick = findViewById(R.id.btn_onclck);
        tvTxt = findViewById(R.id.tv_txt);
        btnOnclick.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name = getData();
        showText(name);
    }
}