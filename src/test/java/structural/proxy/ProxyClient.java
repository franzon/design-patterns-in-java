package structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyClient {

    @Test
    void shouldUseCachedData() {
        Api api = new CachedApi(new RealApi());

        String data = api.requestData();

        assertEquals("Data", data);

        data = api.requestData();
        assertEquals("Data", data);
    }
}
