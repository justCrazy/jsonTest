package Main;

import java.util.ArrayList;
import java.util.List;

//import net.sf.json.JSONArray;

import com.alibaba.fastjson.JSONArray;

public class JsonTest {

	public static void main(String[] args) {
		
		User user  = new User("飞机",12,"男"); 
		User user1  = new User("紫苑",23,"女"); 
		User user2  = new User("水岸",32,"男"); 
		User user3  = new User("蒂萨",22,"男"); 
		User user4  = new User("剑豪",12,"男"); 
		User user5  = new User("八十多分",12,"男"); 
		List<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		System.out.println(userList);
		//官方的json包
//		JSONArray jsonArray = JSONArray.fromObject(userList);
//		String url = jsonArray.toString();
		
		//alibaba的fastjson
		String url = JSONArray.toJSONString(userList);
		System.out.println(url);
	}
}
