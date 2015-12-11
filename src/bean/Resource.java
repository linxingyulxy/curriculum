/*
 * �ļ�����Resouce.java
 * ��Ȩ��Copyright by www.nd.com
 * ������ �γ̹�����Դ��������ӽ��ң�ֻ�м���
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
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


