public class BusinessHandler implements Handler{
    private Handler nextHandler;
    @Override
    public void HandleRequest(Request request) {
        if(request.getStatus()==Status.SUCCESS){
            System.out.println("Successful Request");
            return;
        }

        System.out.println("Invalid request");
    }

    @Override
    public void setNextHandler(Handler nextHandler) {

    }
}
