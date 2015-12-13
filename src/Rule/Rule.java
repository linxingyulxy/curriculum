/*
 * 文件名：Rule.java
 * 版权：Copyright by www.nd.com
 * 描述：排除规则。
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package Rule;

import Exception.PriorityException;
import bean.Require;
import bean.Teacher;
import constant.Constants;

public class Rule
{
    //周几，第几节课，不能上
    public static void notime(int week,int part,Teacher[] teachers){
        for(Teacher teacher:teachers){
            
            teacher.put(week,part, null);
        }
    }
    
    //高优先级课程
    public static void highPriority(int week,int part,Teacher[] teachers) throws PriorityException{
        for(Teacher teacher:teachers){
            teacher.high(week, part, Constants.HIGH_PRIORITY);
        }
    }
    
    //低优先级课程
    public static void lowPriority(int week,int part,Teacher[] teachers) throws PriorityException{
        for(Teacher teacher:teachers){
            teacher.low(week, part, Constants.LOW_PRIORITY);
        }
    }
    
    //检查该老师 是否有一上午四节课的情况，除非该科目6课时，或老师自愿4节课
    public static boolean maxPartCheck(int time,Teacher teacher,int week){
    	Require[] requires=teacher.getRequires();
    	//选择 是否有需要条件的要求
    	for(Require require:requires){
    		if(require.getWeek()==week && require.getTime()==time){
    			int count=teacher.count(week, time);//老师 安排了 几节课
    			if(count>=require.getMaxCurr()){
    				return false;
    			}
    		}
    	} 
    	//如果都不满足 按照 上午3课时，下午2课时的要求判断
    	int count=teacher.count(week, time);//老师 安排了 几节课
    	if(time==Constants.TIME_MORNING && count>3){
    		return false;
    	}
    	if(time==Constants.TIME_MORNING && count>2){
    		return false;
    	}
    	return true;
    	
    }
    
    
}
