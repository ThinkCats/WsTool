package test;

import bean.LoginRequest;
import bean.LoginResponse;
import utils.RestletUtils;

/**
 * Created by wanglei on 2014/11/9.
 */
public class Client {

    public static void main(String args[]){

        /*---------------------- get ----------------------*/
        //接口的地址,get数据
        String url="http://localhost:8080/NewSpms/services/login/getJson";
        //发送请求的对象，并且获得返回数据的对象
        //get()方法只需要传入url和获取结果的类
        LoginResponse response= RestletUtils.get(url, LoginResponse.class);
        //打印从服务器获得的对象中的数据
        System.out.println("----- get result -----");
        System.out.println(response.getErrMsg());

        /*---------------------- post ----------------------*/
        //接口的地址,Post数据并得到结果
        String url2="http://localhost:8080/NewSpms/services/login/getPost";
        //构建请求的对象
        LoginRequest data=new LoginRequest();
        data.setUserName("wangleissssss");
        data.setCityCode("1231");
        data.setMeid("11111");
        data.setUserPwd("123134");
        //post()方法中，第一个参数是接口地址，第二个参数是发送的请求对象，第三个参数是声明要返回的对象
        LoginResponse response2= RestletUtils.post(url2,data,LoginResponse.class);
        System.out.println("----- post and get result -----");
        System.out.println(response2.getErrMsg());

    }



}
