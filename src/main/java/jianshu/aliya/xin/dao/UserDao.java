package jianshu.aliya.xin.dao;

import jianshu.aliya.xin.model.User;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * jianshu.
 */
public interface UserDao {
    void signUp(User user);

    User queryUserByNick(String nick);

    User queryUserByMobile(String mobile);

    void signInUpdate(User user);
}
