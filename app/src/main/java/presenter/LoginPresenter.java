package presenter;

import model.JiaoYanLoginInfomodle;
import view.LoginView;

/**
 * Created by Administrator on 2017/3/29.
 */

public class LoginPresenter {

    private JiaoYanLoginInfomodle mJiaoYanLoginInfomodle;
    private LoginView mLoginView;

    public LoginPresenter(LoginView loginView) {
        this.mLoginView = loginView;
        mJiaoYanLoginInfomodle = new JiaoYanLoginInfomodle();
    }

    public void getLoginInfo(String name, String pwd) {
        //拿到数据后进行校验，由model层完成
        //拿到相应的model的对象，由构造方法传入
        boolean result = mJiaoYanLoginInfomodle.checkLoginInfo(name, pwd);
        // 把验证结果传递给view层,因为Loginactivity实现了view的接口
        mLoginView.getLoginResult(result);
    }
}
