package org.crawler;

public class CrawlingTuple<K, V> {
    private K first;
    private V second;

    public CrawlingTuple(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}

