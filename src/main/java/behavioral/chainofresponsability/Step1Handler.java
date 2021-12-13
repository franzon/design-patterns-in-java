package behavioral.chainofresponsability;

public class Step1Handler extends BaseHandler {

    public Step1Handler(Handler next) {
        super(next);
    }

    @Override
    public void execute(Request request) {
        System.out.println("Step 1");

        request.counter++;

        super.execute(request);
    }
}
