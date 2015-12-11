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

import bean.Teacher;
import util.NameUtil;

public class Rule
{
    //周几，第几节课，不能上
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
