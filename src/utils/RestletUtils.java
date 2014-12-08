package utils;

import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.io.IOException;

/**
 * Created by Administrator on 2014/11/10.
 */
public class RestletUtils {

    public static<T, V> V get(String url,  Class<V> response) {
        ClientResource clientResource=new ClientResource(url);
        Representation representation=clientResource.get();
        JacksonRepresentation<V> jacksonRepresentation=new JacksonRepresentation<V>(representation, response);
        try {
            return jacksonRepresentation.getObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static<T, V> V post(String url, T data, Class<V> response) {
        ClientResource clientResource=new ClientResource(url);
        Representation representation=clientResource.post((new JacksonRepresentation<T>(data)));
        JacksonRepresentation<V> jacksonRepresentation=new JacksonRepresentation<V>(representation, response);
        try {
            return jacksonRepresentation.getObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
