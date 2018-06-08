package com.javaex.problem03;

public class Duck extends Bird {

    public void sing() {
    	System.out.print("오리("+getName()+")가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.print("오리("+getName()+")가 날지 않습니다.");
    }
    
    public void showName() {
    	System.out.print("오리의 이름은 "+getName()+"입니다");
    }

}
