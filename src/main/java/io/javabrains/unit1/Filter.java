package io.javabrains.unit1;

interface Filter<T> {
    public boolean pass(T item);
}