import java.util.NoSuchElementException;

public class EVL<T> {
    ListenElement first = null;
    ListenElement last = null;
    int size = 0;


    public void appendLast(T o) {
        ListenElement l = new ListenElement(o);
        if(size == 0){
            first = l;
            last = first;
            size++;
            return;
        }
        last.next = l;
        last = l;
        size++;
    }

    public T getFirst() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("getFirst(): Ist leer");
        }
        return first.data;
    }

    public T getLast() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("getFirst(): Ist leer");
        }
        return last.data;
    }

    public void addLast(T e) {
        appendLast(e);
    }

    public T removeLast() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("removeLast(): Ist leer");
        }
        T lastListElementData = getLast();

        ListenElement tmp = first;
        for (int i = 0; i < size - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = null;
        last = tmp;

        size--;
        return lastListElementData;
    }

    public boolean contains(T e) throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("contains(): Ist leer");
        }
        ListenElement elements = first;
        for (int i = 0; i < size; i++) {
            if (elements.data.equals(e)) {
                return true;
            }
            elements = elements.next;
        }
        return false;
    }

    public int size() {
        return size;
    }



    //TODO  1-42-13-27-0-11 In diesem Format zurück geben rekursiv
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListenElement tmp = first;
        while (null != tmp) {
            if (tmp != first) {
                s.append("-");
            }
            s.append(tmp.data);
            tmp = tmp.next;
        }
        return s.toString();
    }


    class ListenElement {
        T data;
        ListenElement next = null;

        ListenElement(T o) {
            data = o;
        }
    }
}