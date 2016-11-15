import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import java.net.URI;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by abara on 15.11.2016.
 */

@RunWith(Arquillian.class)
public class WebServiceIT {
    private Client client;
    private WebTarget target;
    @ArquillianResource
    private URL base;

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addClasses(Book.class, Library.class, LibraryImpl.class, LibraryImpl.class)
                .addAsResource("META-INF/beans.xml");
    }

    @Before
    public void setUp() throws Exception {
        client = ClientBuilder.newClient();
        target = client.target(
                URI.create(
                        new URL(base, "api/nmpi/v0.1/network/nodes/STUB").toExternalForm()));
        target.register(List.class);
    }

    @Test
    public void getResource() throws Exception {

    }

    @Test
    public void getRequestData() throws Exception {

    }

}