/**
 * 资源管理类
 */
package util;

import constant.Global;
import bean.Resource;

public class ResourceUtil {
	private static Resource resources[][] ;
	
	static{
		resources=new Resource[5][8];
	}
	
	//申请 某天某节课的资源
	public static boolean obtainResouce(int week,int part){
		return resources[week][part].obtain();
	}
	
	//释放某天某节课的资源
	public static int releaseResource(int week,int part){
		return resources[week][part].release();
	}
}
