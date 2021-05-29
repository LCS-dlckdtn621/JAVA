package domain.userinfo.web;

import domain.dao.UserInfoDao;
import domain.dao.mysql.UserInfoMysqlDao;
import domain.dao.oracle.UserInfoOraclelDao;
import domain.userinfo.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        //경로 구하기
        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        UserInfoDao userInfoDao = null;

        if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOraclelDao();
        }

        userInfoDao.deleteUserInfo(userInfo);
    }
}
