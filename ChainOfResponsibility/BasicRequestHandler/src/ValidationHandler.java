public class ValidationHandler implements Handler{
    private Handler nextHandler;
    @Override
    public void HandleRequest(Request request) {
        if(request.getStatus()==Status.VALIDATED){
            System.out.println("Validation successful");
            request.setStatus(Status.SUCCESS);
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
