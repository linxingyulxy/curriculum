package main;

import bean.Class;
import bean.Grade;
import bean.Subject;

public class Main {
	
	public static void main(String[] args) {
		Subject wulisubject=new Subject();
		wulisubject.setName("����");

		Subject xinxisubject=new Subject();
		xinxisubject.setName("��Ϣ");
		xinxisubject.setResource(true);
		
		Class cla[][]=new Class[3][12];
		
		
		
		for(int i=0;i<3;i++){
			for (int j=0;j<12;j++){
				cla[i][j]=new Class();
				cla[i][j].setTeam(j);
				cla[i][j].setGrade(i);
			}
		}
		cla[0][11]=null;	//���ĳ���û�����࣬����Ϊnull
		System.out.print(cla[0][11]==null);
	}
}
