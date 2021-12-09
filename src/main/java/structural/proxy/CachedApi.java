package structural.proxy;

class CachedApi implements Api {

    private final Api realApi;
    private String cachedData;

    public CachedApi(Api realApi) {
        this.realApi = realApi;
    }

    @Override
    public String requestData() {
        if (cachedData != null)
            return cachedData;

        return realApi.requestData();
    }
}
