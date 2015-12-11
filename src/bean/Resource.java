/*
 * 文件名：Resouce.java
 * 版权：Copyright by www.nd.com
 * 描述： 课程共享资源，比如电子教室，只有几间
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package bean;

public class Resource
{
    private String name;
    private int num;
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    
    public int release(){
        return ++num;
    }
    
    public boolean obtain(){
        if(num<=0)
            return false;
        num--;
        return true;
    }
}


