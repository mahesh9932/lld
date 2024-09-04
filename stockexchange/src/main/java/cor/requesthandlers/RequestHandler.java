package cor.requesthandlers;

import cor.Request;

public abstract class RequestHandler {
    private final RequestHandler nextHandler;


    protected RequestHandler(RequestHandler next){
        this.nextHandler = next;
    }

    public abstract void isValid(Request request);

    public void next(Request request){
        if(this.nextHandler != null){
            this.nextHandler.isValid(request);
        }
    }
}
