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

import constant.Constants;

public class Curriculum
{
    private Resource resource; //��Դ
    private int sort;   //���ȼ� 
    private Subject  subject;//ѧ��
    private int week;//�ܼ�
    private int part;//�ڼ���
    private Teacher teacher;//�ĸ���ʦ�����ſ�
    private int type=Constants.TYPE_CAN;//�ÿ�ʱ �Ƿ��Ѿ����ţ�Ĭ��δ����
    
    public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
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
