package view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.administrator.vebview_activity_demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.ed_name)
    EditText mEdName;
    @BindView(R.id.ed_pwd)
    EditText mEdPwd;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.activity_main)
    RelativeLayout mActivityMain;
    private WebView mWeb;
    private LoginPresenter mLoginPresenter;
    private String mName;
    private String mPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //拿着用户名和密码--->去验证
        //验证成功后-->进行登录的网络请求-->请求的结果--->做出相应的处理
        mLoginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btn_login)
    public void onClick() {
        mLoginPresenter.getLoginInfo(getUserName(), getPassword());
    }

    //传入用户名
    @Override

    public String getUserName() {
        return mEdName.getText().toString().trim();
    }

    //传入密码
    @Override
    public String getPassword() {
        return mEdPwd.getText().toString().trim();
    }

    @Override
    public void getLoginResult(boolean result) {
        if (result) {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
        }
    }
}
