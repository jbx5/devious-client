package net.runelite.api;

import java.io.Serializable;
import java.util.*;

/**
 * A {@link Queue} that shares some properties of a {@link Set}.
 */
public class QueueSet<E> implements Queue<E>, Set<E>, Serializable {

    private static final long serialVersionUID = 1692909657689736799L;

    protected final Queue<E> q;

    protected final Set<E> s;

    /**
     * Creates an empty {@link QueueSet}
     */
    public QueueSet() {
        this(new LinkedList<E>(), new HashSet<E>());
    }

    /**
     * Creates a {@link QueueSet} with the given {@link Queue}
     * and {@link Set}.
     *
     * <p>NOTE: The {@link QueueSet} does not check if the initial
     * state of the given arguments is correct.
     */
    public QueueSet(Queue<E> q, Set<E> s) {
        if (q == null) {
            throw new NullPointerException("q");
        }

        if (s == null) {
            throw new NullPointerException("s");
        }

        this.q = q;
        this.s = s;
    }

    @Override
    public boolean add(E e) {
        return offer(e);
    }

    @Override
    public boolean offer(E e) {
        if (!contains(e)) {
            if (q.offer(e)) {
                s.add(e);
                return true;
            }
        }
        return false;
    }

    @Override
    public E element() {
        return q.element();
    }

    @Override
    public E peek() {
        return q.peek();
    }

    @Override
    public E poll() {
        E element = q.poll();
        s.remove(element);
        return element;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }

    @Override
    public int size() {
        return q.size();
    }

    @Override
    public void clear() {
        q.clear();
        s.clear();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @Override
    public E remove() {
        try {
            E element = q.remove();
            s.remove(element);
            return element;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public boolean remove(Object o) {
        if (s.remove(o)) {
            q.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            modified |= add(element);
        }
        return modified;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            modified |= remove(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;

        for (Iterator<E> it = iterator(); it.hasNext(); ) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }

        return modified;
    }

    @Override
    public Object[] toArray() {
        return q.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return q.toArray(a);
    }

    @Override
    public String toString() {
        return q.toString();
    }

    /**
     * An {@link Iterator} for the {@link QueueSet}.
     */
    private class QueueIterator implements Iterator<E> {

        private final Iterator<E> it = q.iterator();

        private E current = null;

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public E next() {
            current = it.next();
            return current;
        }

        @Override
        public void remove() {
            it.remove();
            s.remove(current);
            current = null;
        }
    }
}

