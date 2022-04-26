package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IMainView, View.OnClickListener {
    private Button btnOnclick;
    private TextView tvTxt;
    private Persenter mPersenter = new Persenter(this);

    private static Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        mPersenter.getData();
    }

    private void initView() {
        btnOnclick = findViewById(R.id.btn_onclck);
        tvTxt = findViewById(R.id.tv_txt);
        btnOnclick.setOnClickListener(this);
    }

    @Override
    public void showSuccess() {
        if (toast!= null){
            toast.cancel();
            toast = Toast.makeText(this,"获取成功",Toast.LENGTH_SHORT);
        }else {

            toast = Toast.makeText(this,"获取成功",Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    @Override
    public void showFail() {
        if (toast!= null){
            toast.cancel();
            toast = Toast.makeText(this,"获取失败",Toast.LENGTH_SHORT);
        }else {

            toast = Toast.makeText(this,"获取失败",Toast.LENGTH_SHORT);
        }
        toast.show();
    }

    @Override
    public void showText(String txt) {
        tvTxt.setText(txt);
    }

    @Override
    public void onClick(View view) {
        mPersenter.getData();
    }
}