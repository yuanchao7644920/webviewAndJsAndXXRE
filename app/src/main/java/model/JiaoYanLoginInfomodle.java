package model;

import android.text.TextUtils;

/**
 * Created by Administrator on 2017/3/29.
 */

public class JiaoYanLoginInfomodle implements ILoginJiaoyanModle {
    /**
     * 实现校验功能
     *
     * @param name
     * @param pwd
     * @return
     */
    @Override
    public boolean jiaoYanUserInfo(String name, String pwd) {
        return checkLoginInfo(name, pwd);
    }

    /**
     * 具体逻辑自己实现
     * 拿到有presenter层给的用户信息，进行登录校验
     */
    public boolean checkLoginInfo(String name, String pwd) {
        //实际开发需要联网验证
        if (!TextUtils.isEmpty(name) && "123456".equals(pwd)) {
            return true;
        }
        return false;
    }
}
