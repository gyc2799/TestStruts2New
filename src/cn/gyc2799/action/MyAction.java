package cn.gyc2799.action;

public class MyAction extends com.opensymphony.xwork2.ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("正在执行Myaction……");
		return "MyOK";
	}
	
}
