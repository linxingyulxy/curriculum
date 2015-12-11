/*
 * �ļ�����Teacher.java
 * ��Ȩ��Copyright by www.nd.com
 * ��������ʦ��
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package bean;

import java.util.HashMap;

import Exception.PriorityException;
import constant.Constants;
import util.NameUtil;

public class Teacher
{
    private String name;//����
    private Subject subject;//ѧ��
    private int[] grade;//�ɽ����
    private int time;//ÿ�ܿ�ʱ
    private boolean boss;//�Ƿ�γ�
    private boolean head;//�Ƿ������
    private boolean cadre;//�Ƿ��в�ɲ�
    private HashMap<String, Curriculum> map;//��ʦ���õĿγ̣�key�ĸ�ʽ���ܼ��ڼ��ڣ�21�ܶ���һ�ڡ�
    
    public HashMap<String, Curriculum> getMap()
    {
        return map;
    }
    public void setMap(HashMap<String, Curriculum> map)
    {
        this.map = map;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Subject getSubject()
    {
        return subject;
    }
    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }
    public int[] getGrade()
    {
        return grade;
    }
    public void setGrade(int[] grade)
    {
        this.grade = grade;
    }
    public int getTime()
    {
        return time;
    }
    public void setTime(int time)
    {
        this.time = time;
    }
    public boolean isBoss()
    {
        return boss;
    }
    public void setBoss(boolean boss)
    {
        this.boss = boss;
    }
    public boolean isHead()
    {
        return head;
    }
    public void setHead(boolean head)
    {
        this.head = head;
    }
    public boolean isCadre()
    {
        return cadre;
    }
    public void setCadre(boolean cadre)
    {
        this.cadre = cadre;
    }
    
    //public Curriculum next(){//��ȡָ��
        
    //}
    
    //���ÿγ�
    public void put(int week,int part,Curriculum curriculum){
        this.map.put(NameUtil.getName(week, part), curriculum);
    }
    
    //������ȼ�
    public void high(int week,int part,int priority) throws PriorityException{
        Curriculum curriculum=this.map.get(NameUtil.getName(week, part));
        if(curriculum.getSort()!=Constants.NORMAL_PRIORITY){
            throw new PriorityException("����ʦ���ڿΣ��Ѿ����ù������ȼ������������ø����ȼ�",this,week,part);
        }
        curriculum.setSort(Constants.HIGH_PRIORITY);
        this.put(week, part, curriculum);
    }
    
    //�������ȼ�
    public void low(int week,int part,int priority) throws PriorityException{
        Curriculum curriculum=this.map.get(NameUtil.getName(week, part));
        if(curriculum.getSort()!=Constants.NORMAL_PRIORITY){
            throw new PriorityException("����ʦ���ڿΣ��Ѿ����ù������ȼ������������õ����ȼ�",this,week,part);
        }
        curriculum.setSort(Constants.LOW_PRIORITY);
        this.put(week, part, curriculum);
    }
}
