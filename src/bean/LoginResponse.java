package bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by wanglei on 2014/11/4.
 */
@XmlRootElement
public class LoginResponse extends BaseResponse {
    private long collectorId;
    private String collectorType;
    private String loginKey;
    private List parkingSiteList;

    public LoginResponse() {
    }


    public long getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(long collectorId) {
        this.collectorId = collectorId;
    }

    public String getCollectorType() {
        return collectorType;
    }

    public void setCollectorType(String collectorType) {
        this.collectorType = collectorType;
    }

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }

    public List getParkingSiteList() {
        return parkingSiteList;
    }

    public void setParkingSiteList(List parkingSiteList) {
        this.parkingSiteList = parkingSiteList;
    }
}
