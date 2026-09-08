public interface Handler {
    void HandleRequest(Request request);
    void setNextHandler(Handler nextHandler);
}
