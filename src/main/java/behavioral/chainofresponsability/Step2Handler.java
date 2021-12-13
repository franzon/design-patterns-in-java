package behavioral.chainofresponsability;

public class Step2Handler extends BaseHandler {

    public Step2Handler(Handler next) {
        super(next);
    }

    @Override
    public void execute(Request request) {
        System.out.println("Step 2");

        request.counter++;

        super.execute(request);
    }
}
