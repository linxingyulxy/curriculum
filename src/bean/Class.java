/*
 * 文件名：Class.java
 * 版权：Copyright by www.nd.com
 * 描述：班级bean，保存全校多少班级
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package bean;

public class Class
{
    private int grade; //几年
    private int team; //几班
    private Curriculum[][] curriculums;//课程表
    public int getGrade()
    {
        return grade;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public int getTeam()
    {
        return team;
    }
    public void setTeam(int team)
    {
        this.team = team;
    }
    public Curriculum[][] getCurriculums()
    {
        return curriculums;
    }
    public void setCurriculums(Curriculum[][] curriculums)
    {
        this.curriculums = curriculums;
    }
    
    public void set(int week,int part,Curriculum curriculum){
        this.curriculums[week][part]=curriculum;
    }
}
