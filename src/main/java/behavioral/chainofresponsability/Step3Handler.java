package behavioral.chainofresponsability;

public class Step3Handler extends BaseHandler {

    public Step3Handler(Handler next) {
        super(next);
    }

    @Override
    public void execute(Request request) {
        System.out.println("Step 3");

        request.counter++;

        super.execute(request);
    }
}
