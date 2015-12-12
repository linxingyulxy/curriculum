/*
 * 文件名：Teacher.java
 * 版权：Copyright by www.nd.com
 * 描述：教师类
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package bean;

import java.util.HashMap;

import Exception.PriorityException;
import constant.Constants;
import util.NameUtil;

public class Teacher
{
    private String name;//名称
    private Subject subject;//学科
    private int[] grade;//可教年纪
    private int time;//每周课时
    private boolean boss;//是否段长
    private boolean head;//是否班主任
    private boolean cadre;//是否中层干部
    private HashMap<String, Curriculum> map;//老师可用的课程，key的格式是周几第几节：21周二第一节。
    private Require[] requires;//要求,如无要求，默认上午3课时，下午2课时
    
    public Require[] getRequires() {
		return requires;
	}
	public void setRequires(Require[] requires) {
		this.requires = requires;
	}
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
    
    //public Curriculum next(){//获取指定
        
    //}
    
    //设置课程
    public void put(int week,int part,Curriculum curriculum){
    	curriculum.setType(Constants.TYPE_ALREADY);
        this.map.put(NameUtil.getName(week, part), curriculum);
    }
    
    //提高优先级
    public void high(int week,int part,int priority) throws PriorityException{
        Curriculum curriculum=this.map.get(NameUtil.getName(week, part));
        if(curriculum.getSort()!=Constants.NORMAL_PRIORITY){
            throw new PriorityException("该老师本节课，已经设置过低优先级，不可再设置高优先级",this,week,part);
        }
        curriculum.setSort(Constants.HIGH_PRIORITY);
        this.put(week, part, curriculum);
    }
    
    //降低优先级
    public void low(int week,int part,int priority) throws PriorityException{
        Curriculum curriculum=this.map.get(NameUtil.getName(week, part));
        if(curriculum.getSort()!=Constants.NORMAL_PRIORITY){
            throw new PriorityException("该老师本节课，已经设置过高优先级，不可再设置低优先级",this,week,part);
        }
        curriculum.setSort(Constants.LOW_PRIORITY);
        this.put(week, part, curriculum);
    }
    
    //计算老师周几 已经安排了几节课
    public int count(int week,int time){
    	int count=0;
    	if(time==Constants.TIME_MORNING){
    		for(int i=1;i<=4;i++){
    			Curriculum curriculum=this.map.get(NameUtil.getName(week, i));
    			if(curriculum.getType()==Constants.TYPE_ALREADY)
    				count++;
    		}
    	}
    	else if(time==Constants.TIME_AFTERNONG){
    		for(int i=5;i<=7;i++){
    			Curriculum curriculum=this.map.get(NameUtil.getName(week, i));
    			if(curriculum.getType()==Constants.TYPE_ALREADY)
    				count++;
    		}
    	}
    	else if(time==Constants.TIME_ALL){
    		count+=count(week, Constants.TIME_MORNING);
    		count+=count(week, Constants.TIME_AFTERNONG);
    	}
    	return count;
    }
}
