/*
 * �ļ�����Curriculum.java
 * ��Ȩ��Copyright by www.nd.com
 * �������γ��࣬
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package bean;

public class Curriculum
{
    private Resource resource; //��Դ
    private int sort;   //���ȼ� 
    private Subject  subject;//ѧ��
    private int week;//�ܼ�
    private int part;//�ڼ���
    
    public Resource getResource()
    {
        return resource;
    }
    public void setResource(Resource resource)
    {
        this.resource = resource;
    }
    public int getSort()
    {
        return sort;
    }
    public void setSort(int sort)
    {
        this.sort = sort;
    }
    public Subject getSubject()
    {
        return subject;
    }
    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }
    public int getWeek()
    {
        return week;
    }
    public void setWeek(int week)
    {
        this.week = week;
    }
    public int getPart()
    {
        return part;
    }
    public void setPart(int part)
    {
        this.part = part;
    }
}
