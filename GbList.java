package GbList;

public interface GbList<T> {
    GbList<T> add(T item);
    T get(int index);
    GbList<T> remove(int index);
    boolean update(T item, int index);
    int size();
    boolean isEmpty();
}
