package io.javabrains.unit1;

@FunctionalInterface
interface Filter<T> {
    boolean pass(T item);
}