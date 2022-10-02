package com.venvo.demo.generic;

public class GenericFactoryImpl<T,N> implements GenericFactory<T,N> {
    public T nextObject() {
        return null;
    }

    public N nextNumber() {
        return null;
    }
}
