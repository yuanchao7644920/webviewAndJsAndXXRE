package view;

/**
 * Created by Administrator on 2017/3/29.
 */

public interface LoginView {

    // 获取用户名
    String getUserName();

    // 获取密码
    String getPassword();

    // 获取model层验证用户名、密码后返回的结果
    void getLoginResult(boolean result);
}
