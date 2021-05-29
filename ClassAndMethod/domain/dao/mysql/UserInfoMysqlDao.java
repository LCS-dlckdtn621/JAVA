package domain.dao.mysql;

import domain.dao.UserInfoDao;
import domain.userinfo.UserInfo;

public class UserInfoMysqlDao implements UserInfoDao {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userID = " + userInfo);
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = " + userInfo);
    }
}
