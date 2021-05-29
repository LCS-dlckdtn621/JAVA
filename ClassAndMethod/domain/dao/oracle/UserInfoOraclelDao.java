package domain.dao.oracle;

import domain.dao.UserInfoDao;
import domain.userinfo.UserInfo;

public class UserInfoOraclelDao implements UserInfoDao {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.showUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID = " + userInfo.showUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = " + userInfo.showUserID());
    }
}
