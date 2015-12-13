/**
 * ��Դ������
 */
package util;

import constant.Global;
import bean.Resource;

public class ResourceUtil {
	private static Resource resources[][] ;
	
	static{
		resources=new Resource[5][8];
	}
	
	//���� ĳ��ĳ�ڿε���Դ
	public static boolean obtainResouce(int week,int part){
		return resources[week][part].obtain();
	}
	
	//�ͷ�ĳ��ĳ�ڿε���Դ
	public static int releaseResource(int week,int part){
		return resources[week][part].release();
	}
}
