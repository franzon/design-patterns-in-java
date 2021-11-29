package creational.singleton;

class LazyLoadThreadSafeSingleton {

    private LazyLoadThreadSafeSingleton() {
    }

    public static LazyLoadThreadSafeSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final LazyLoadThreadSafeSingleton INSTANCE = new LazyLoadThreadSafeSingleton();
    }
}
