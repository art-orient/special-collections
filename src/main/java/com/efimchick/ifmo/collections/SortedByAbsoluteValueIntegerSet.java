package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class SortedByAbsoluteValueIntegerSet extends TreeSet<Integer> {

    public static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Math.abs(o1) - Math.abs(o2);
        }
    };

    public SortedByAbsoluteValueIntegerSet() {
        super(comparator);
    }

    @Override
    public boolean add(Integer integer) {
        return super.add(integer);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c);
    }

    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}
