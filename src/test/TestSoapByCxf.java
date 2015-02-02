package com.test;


import com.gnivcode.spms.process.service.EventForwarderInterface;
import com.gnivcode.spms.process.service.EventForwarderService;
import com.gnivcode.spms.process.service.FeedResult;
import com.gnivcode.spms.process.service.NocPacket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wang on 15-1-27.
 */
public class TestSoapByCxf {
    public static void main(String[] args) {
        URL wsdlLocation= null;
        try {
            wsdlLocation = new URL("***");
            NocPacket nocPacket=new NocPacket();
            nocPacket.setPayload("lasdfsfsdf");
            nocPacket.setUserName("noc_hz");
            nocPacket.setPassword("noc_hz_pwd");
            EventForwarderService service=new EventForwarderService(wsdlLocation);
            EventForwarderInterface ss=service.getEventForwarderPort();
            FeedResult result=ss.send(nocPacket);
            System.out.println(result.getResultDesc());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
