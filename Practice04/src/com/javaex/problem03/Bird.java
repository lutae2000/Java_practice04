package com.javaex.problem03;

public abstract class Bird {
    private String name;

    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    abstract void fly();
    abstract void sing();
    abstract void showName();
}
