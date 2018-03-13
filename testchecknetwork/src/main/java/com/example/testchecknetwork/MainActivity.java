package com.example.testchecknetwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.view.annotation.CheckNetwork;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;


public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.test_iv)
    ImageView testIv;

    @ViewInject(R.id.test_tv)
    TextView testTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);



    }

    @Event(value = R.id.test_iv)
    @CheckNetwork
    private void onClickIv(View view) {
        Toast.makeText(this,"点击了图片,需要检查网络",Toast.LENGTH_SHORT).show();
    }

    @Event(value = R.id.test_tv)
    private void onClickTv(View view) {
        Toast.makeText(this,"点击了文本,无需检查网络",Toast.LENGTH_SHORT).show();
    }
}
