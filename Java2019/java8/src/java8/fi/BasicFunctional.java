package java8.fi;

import java.util.Iterator;

@FunctionalInterface
public interface BasicFunctional<T> {
    @Override
    boolean equals(Object obj);

    int compare(T o1,T o2);
}

interface X{
    Iterator m(Iterator<String> arg);
}

interface Y{
    Iterator m(Iterator<String> arg);
}

@FunctionalInterface
interface Z extends X,Y{}
