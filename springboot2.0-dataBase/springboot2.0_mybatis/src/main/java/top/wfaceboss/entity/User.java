package top.wfaceboss.entity;

import lombok.Data;
/**
 * 数据实体类层
 * @author Administrator
 *
 */
@Data
public class User {

	private Integer id;
	private Integer age;
	private String name;
	
	public static void main(String[] args) {
	new User().setAge(22);
	}
}
