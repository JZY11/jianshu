package jianshu.aliya.xin.dao.impl;

import jianshu.aliya.xin.dao.UserDao;
import jianshu.aliya.xin.model.User;
import jianshu.aliya.xin.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * jianshu.
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void signUp(User user) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            sqlSession.insert("user.signUp",user);
        }
    }

    @Override
    public User queryUserByNick(String nick) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(false)){
            return sqlSession.selectOne("user.queryUserByNick",nick);
        }
    }

    @Override
    public User queryUserByMobile(String mobile) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(false)){
            return sqlSession.selectOne("user.queryUserByMobile",mobile);
        }
    }

    @Override
    public void signInUpdate(User user) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            sqlSession.update("user.signInUpdate",user);
        }
    }
}
