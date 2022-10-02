package com.venvo.demo.generic;

public interface GenericFactory<T,N> {
    T nextObject();
    N nextNumber();
}
