/*
 * �ļ�����Class.java
 * ��Ȩ��Copyright by www.nd.com
 * �������༶bean������ȫУ���ٰ༶
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package bean;

public class Class
{
    private int grade; //����
    private int team; //����
    private Curriculum[][] curriculums;//�γ̱�
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
