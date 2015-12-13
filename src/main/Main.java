package main;

import bean.Class;
import bean.Grade;
import bean.Subject;

public class Main {
	
	public static void main(String[] args) {
		Subject wulisubject=new Subject();
		wulisubject.setName("物理");

		Subject xinxisubject=new Subject();
		xinxisubject.setName("信息");
		xinxisubject.setResource(true);
		
		Class cla[][]=new Class[3][12];
		
		
		
		for(int i=0;i<3;i++){
			for (int j=0;j<12;j++){
				cla[i][j]=new Class();
				cla[i][j].setTeam(j);
				cla[i][j].setGrade(i);
			}
		}
		cla[0][11]=null;	//如果某年段没有满班，设置为null
		System.out.print(cla[0][11]==null);
	}
}
