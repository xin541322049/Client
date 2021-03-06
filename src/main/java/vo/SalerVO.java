package vo;

import other.User;
import other.UserType;

/**
 * Created by apple on 2016/11/22.
 * 存储Saler信息的VO类
 * @author CROFF
 * @version 2016-12-1
 */
public class SalerVO extends User {
	
	private String name;	//姓名或名称
	private String tel;	//联系方式
	
	/**
	 * 空构造方法
	 */
	public SalerVO() {
		super.setUserType(UserType.Saler);
	}
	
	/**
	 * 有参数的构造方法
	 * @param userID 用户名
	 * @param password 密码
	 * @param name 姓名或名称
	 * @param tel 联系方式
	 */
	public SalerVO(String userID, String password, String name, String tel) {
		super(userID, password, UserType.Saler);
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}
