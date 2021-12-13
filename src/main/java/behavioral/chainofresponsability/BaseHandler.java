package behavioral.chainofresponsability;

class BaseHandler implements Handler {

    private final Handler next;

    public BaseHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void execute(Request request) {
        if (next != null)
            next.execute(request);
    }

}
