package cor;

import cor.requesthandlers.RequestHandler;

public class GetDataApi {
    public Response getData(Request request){
        RequestHandler requestHandler = HandlerFactory.getHandlers("get data");
        requestHandler.isValid(request);
        return null;
    }
}
