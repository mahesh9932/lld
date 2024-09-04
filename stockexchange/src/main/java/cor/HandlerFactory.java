package cor;

import cor.requesthandlers.AuthorizationHandler;
import cor.requesthandlers.RequestHandler;
import cor.requesthandlers.ValidtionRequestHandler;

public class HandlerFactory {

    public static RequestHandler getHandlers(String apiName){
        return new ValidtionRequestHandler(new AuthorizationHandler(null));
    }
}
