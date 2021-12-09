package structural.proxy;

class RealApi implements Api {

    @Override
    public String requestData() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Data";
    }
}
