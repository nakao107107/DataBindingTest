package com.example.nakao.databindingtest;

import android.databinding.ObservableInt;
import android.view.View;

/**
 * Created by nakao on 2017/12/26.
 */

public class User{

    public ObservableInt like=new ObservableInt();

    public User(){
        like.set(0);
    }

    public void onClickLike(View view){
        like.set(like.get()+1);
    }
}
