//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Request request=new Request(1,"First request", Status.AUTHENTICATED);
        Handler authenticationHandler=new AuthenticationHandler();
        Handler authorizationHandler=new AuthorizationHandler();
        Handler validationHandler=new ValidationHandler();
        Handler businessHandler=new BusinessHandler();
        authenticationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(validationHandler);
        validationHandler.setNextHandler(businessHandler);

        authenticationHandler.HandleRequest(request);
        request.setStatus(Status.UNAUTHENTICATED);
        authenticationHandler.HandleRequest(request);





    }
}