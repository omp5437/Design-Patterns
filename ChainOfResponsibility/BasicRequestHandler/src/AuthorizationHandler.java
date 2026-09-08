public class AuthorizationHandler implements Handler{
    private Handler nextHandler;
    @Override
    public void HandleRequest(Request request) {
        if(request.getStatus()==Status.UNAUTHORIZED){
            System.out.println("Unauthorized request");
            return;
        }
        if(request.getStatus()==Status.AUTHORIZED){
            System.out.println("Authorization successful");
            request.setStatus(Status.VALIDATED);
        }
        if(nextHandler!=null){
            nextHandler.HandleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler=nextHandler;
    }
}
