package com.company.day26;

import java.util.Objects;

public class DefaultPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public DefaultPair() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultPair)) return false;
        DefaultPair<?, ?> that = (DefaultPair<?, ?>) o;
        return getKey().equals(that.getKey()) && getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }

    @Override
    public String toString() {
        return "DefaultPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
}
