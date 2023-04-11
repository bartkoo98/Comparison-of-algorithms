package bartkoo98;

public class SimpleCounter {
    private long _count = 0L;

    public long get_count() {
        return _count;
    }

    public void step() {
        _count++;
    }

    public void step(int value) {
        _count += value;
    }
}
