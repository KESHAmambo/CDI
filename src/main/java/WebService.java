import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

/**
 * Created by abara on 15.11.2016.
 */
public class WebService {
    @Inject
    Library library;

    @GET
    @Path("resource")
    @Produces("application/json")
    public Book getResource() {
        return library.getBook();
    }

    @POST
    @Path("resource")
    @Consumes("application/json")
    @Produces("application/json")
    public Book getRequestData(Request request) {
        return library.getBook();
    }
}
