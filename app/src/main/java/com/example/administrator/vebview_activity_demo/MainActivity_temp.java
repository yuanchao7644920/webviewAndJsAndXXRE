package com.example.administrator.vebview_activity_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity_temp extends AppCompatActivity {

    @BindView(R.id.ed_name)
    EditText mEdName;
    @BindView(R.id.ed_pwd)
    EditText mEdPwd;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    private WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.btn_web})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                break;
            case R.id.btn_web:
                Toast.makeText(this, "ddd", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, WebViewActvity.class));
                break;
        }
    }

}
