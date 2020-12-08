package com.labs.oop;
import java.util.ArrayList;
public class Queue {
    ArrayList<String> item;

    public Queue(){
        this.item = new ArrayList<String>();
    };

    public boolean isNull(){
        return item.isEmpty();

    };

    public boolean notNull(){
        return !(item.isEmpty());
    };

    public int size() {
        return item.size();
    };

    public String get(int i){
        return item.get(i);
    }

    public ArrayList<String> push(String x) {
        item.add(x);
        return item;
    };

    public ArrayList<String> pop() {
        item.remove(item.size()-1);
        return item;
    };
}
