/*
 * �ļ�����Rule.java
 * ��Ȩ��Copyright by www.nd.com
 * �������ų�����
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package Rule;

import bean.Teacher;
import util.NameUtil;

public class Rule
{
    //�ܼ����ڼ��ڿΣ�������
    public static void notime(int week,int part,Teacher[] teachers){
        for(Teacher teacher:teachers){
            
            teacher.put(week,part, null);
        }
    }
    
    public static void highPriority(int week,int part,Teacher[] teachers){
        for(Teacher teacher:teachers){
            if()
        }
    }
}
