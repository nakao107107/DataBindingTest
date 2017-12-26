package com.example.nakao.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nakao.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding Objectの取得
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //BindingオブジェクトにUserをセットする
        binding.setUser(new User());

    }
}
