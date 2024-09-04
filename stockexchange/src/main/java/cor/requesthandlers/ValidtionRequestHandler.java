package cor.requesthandlers;

import cor.Request;

public class ValidtionRequestHandler extends RequestHandler{
    public ValidtionRequestHandler(RequestHandler requestHandler){
        super(requestHandler);
    }

    @Override
    public void isValid(Request request) {
        if(request.getHeader()==null || request.getBody() == null || request.getToken() == null){
            throw new RuntimeException("Inavlid request");
        }
        System.out.println("Validation Passed");
        next(request);
    }
}
