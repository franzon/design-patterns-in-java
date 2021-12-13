package behavioral.chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    void shouldExecuteAllHandlers() {
        Handler step3 = new Step3Handler(null);
        Handler step2 = new Step2Handler(step3);
        Handler step1 = new Step1Handler(step2);

        Request request = new Request();

        step1.execute(request);

        assertEquals(3, request.counter);
    }
}
