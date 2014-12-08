package bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by wanglei on 2014/11/4.
 */

@XmlRootElement
public class LoginRequest {
    private String cityCode;
    private String userName;
    private String userPwd;
    private String meid;

    public LoginRequest() {
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid;
    }
}
