/*
 * 文件名：Subject.java
 * 版权：Copyright by www.nd.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2015年12月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package bean;

public class Subject
{
    private String name;
    private boolean resource=false;//是否需要占用资源

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
