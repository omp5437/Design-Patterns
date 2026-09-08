public class AuthenticationHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void HandleRequest(Request request) {
        if(request.getStatus()==Status.UNAUTHENTICATED){
            System.out.println("Handling unauthenticated request");
            return;
        }
        if(request.getStatus()==Status.AUTHENTICATED){
            System.out.println("Authentication successful");
            request.setStatus(Status.AUTHORIZED);
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
