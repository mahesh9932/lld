package cor.requesthandlers;

import cor.Request;
import cor.manager.TokenManager;

public class AuthorizationHandler extends RequestHandler{

    private final TokenManager tokenManager;

    public AuthorizationHandler(RequestHandler requestHandler){
        super(requestHandler);
        tokenManager = new TokenManager();
    }
    @Override
    public void isValid(Request request) {
        tokenManager.getEmail(request.getToken());
        System.out.println("Authorization passed");
        next(request);
    }
}
