package com.javaex.problem03;

public class Duck extends Bird {

    public void sing() {
    	System.out.print("����("+getName()+")�� �Ҹ����� ��ϴ�.");
    }

    public void fly() {
    	System.out.print("����("+getName()+")�� ���� �ʽ��ϴ�.");
    }
    
    public void showName() {
    	System.out.print("������ �̸��� "+getName()+"�Դϴ�");
    }

}
