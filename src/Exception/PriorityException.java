/*
 * �ļ�����priorityException.java
 * ��Ȩ��Copyright by www.nd.com
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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
