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

import Exception.PriorityException;
import bean.Require;
import bean.Teacher;
import constant.Constants;

public class Rule
{
    //�ܼ����ڼ��ڿΣ�������
    public static void notime(int week,int part,Teacher[] teachers){
        for(Teacher teacher:teachers){
            
            teacher.put(week,part, null);
        }
    }
    
    //�����ȼ��γ�
    public static void highPriority(int week,int part,Teacher[] teachers) throws PriorityException{
        for(Teacher teacher:teachers){
            teacher.high(week, part, Constants.HIGH_PRIORITY);
        }
    }
    
    //�����ȼ��γ�
    public static void lowPriority(int week,int part,Teacher[] teachers) throws PriorityException{
        for(Teacher teacher:teachers){
            teacher.low(week, part, Constants.LOW_PRIORITY);
        }
    }
    
    //������ʦ �Ƿ���һ�����Ľڿε���������Ǹÿ�Ŀ6��ʱ������ʦ��Ը4�ڿ�
    public static boolean maxPartCheck(int time,Teacher teacher,int week){
    	Require[] requires=teacher.getRequires();
    	//ѡ�� �Ƿ�����Ҫ������Ҫ��
    	for(Require require:requires){
    		if(require.getWeek()==week && require.getTime()==time){
    			int count=teacher.count(week, time);//��ʦ ������ ���ڿ�
    			if(count>=require.getMaxCurr()){
    				return false;
    			}
    		}
    	} 
    	//����������� ���� ����3��ʱ������2��ʱ��Ҫ���ж�
    	int count=teacher.count(week, time);//��ʦ ������ ���ڿ�
    	if(time==Constants.TIME_MORNING && count>3){
    		return false;
    	}
    	if(time==Constants.TIME_MORNING && count>2){
    		return false;
    	}
    	return true;
    	
    }
    
    
}
