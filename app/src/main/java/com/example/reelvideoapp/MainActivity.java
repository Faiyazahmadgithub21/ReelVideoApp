package com.example.reelvideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.reelvideoapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<Model> arrayList=new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        this.getTheme().applyStyle(R.style.FullScreen,false);
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.a,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.b,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.c,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.d,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.e,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.f,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.g,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.h,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.i,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.j,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.k,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.l,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.m,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.n,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.o,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.p,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.q,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.r,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.s,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.t,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.u,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.v,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.w,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.x,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.y,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.z,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.aa,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.bb,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.cc,R.drawable.boy,"Faiyaz Ahmad"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.dd,R.drawable.boy,"Faiyaz Ahmad"));

        adapter=new Adapter(MainActivity.this,arrayList);
        binding.vpg2.setAdapter(adapter);
    }
}