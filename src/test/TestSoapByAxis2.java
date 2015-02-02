package test;

import java.rmi.RemoteException;

/**
 * Created by wanglei on 15-2-2.
 * 这种方式，首先用axis2的wsdl2java生成代码，然后用此工具来调用
 */
public class TestSoapByAxis2 {
    public static EventForwarderServiceStub.FeedResult jaxSend(String url,EventForwarderServiceStub.NocPacket nocPacket){
        try {
           /* nocPacket.setUserName("noc_hz");
            nocPacket.setPassword("noc_hz_pwd");
            nocPacket.setPayload("1232311");
            String urlString="****";*/
            EventForwarderServiceStub stub=new EventForwarderServiceStub(url);
            EventForwarderServiceStub.Send send=new EventForwarderServiceStub.Send();
            send.setNocPacket(nocPacket);
            EventForwarderServiceStub.SendE sende=new EventForwarderServiceStub.SendE();
            sende.setSend(send);
            EventForwarderServiceStub.SendResponse response= null;
            try {
                response = stub.send(sende).getSendResponse();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            EventForwarderServiceStub.FeedResult result=response.getResult();
            return result;
        } catch (AxisFault e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
