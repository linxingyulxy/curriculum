/*
 * 文件名：priorityException.java
 * 版权：Copyright by www.nd.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package Exception;

import bean.Teacher;

public class PriorityException extends Exception
{
    String name;
    Teacher teacher;
    int week;
    int part;
    public PriorityException(String name,Teacher teacher,int week,int part){
        super();
        this.name=name;
        this.teacher=teacher;
        this.week=week;
        this.part=part;
        
    }
}
