/*
 * 文件名：Curriculum.java
 * 版权：Copyright by www.nd.com
 * 描述：课程类，
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package bean;

import constant.Constants;

public class Curriculum
{
    private Resource resource; //资源
    private int sort;   //优先级 
    private Subject  subject;//学科
    private int week;//周几
    private int part;//第几节
    private Teacher teacher;//哪个老师上这门课
    private int type=Constants.TYPE_CAN;//该课时 是否已经安排，默认未安排
    
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
