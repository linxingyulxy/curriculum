/*
 * �ļ�����Subject.java
 * ��Ȩ��Copyright by www.nd.com
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2015��12��11��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package bean;

public class Subject
{
    private String name;
    private boolean resource=false;//�Ƿ���Ҫռ����Դ

    public boolean isResource() {
		return resource;
	}

	public void setResource(boolean resource) {
		this.resource = resource;
	}

	public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
