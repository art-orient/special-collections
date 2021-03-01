package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue extends LinkedList<Integer> {

    @Override
    public boolean add(Integer integer) {
        return super.add(integer);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public Integer peek() {
        List<Integer> list = new ArrayList<>(this);
        Collections.sort(list);
        int index = this.size() / 2;
        if (this.size() % 2 == 0) {
            index--;
        }
        return list.get(index);
    }

    @Override
    public Integer poll() {
        List<Integer> list = new ArrayList<>(this);
        Collections.sort(list);
        int index = this.size() / 2;
        if (this.size() % 2 == 0) {
            index--;
        }
        Integer median = list.get(index);
        this.remove(median);
        return median;
    }

    @Override
    public Integer remove() {
        return super.remove();
    }

    @Override
    public boolean offer(Integer integer) {
        return super.offer(integer);
    }

    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}
