package service.discover.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("service2")
@FeignClient(url="https://jsonplaceholder.typicode.com/",value="USERS")
public interface Service2 {

	//@RequestMapping("/service2/welcome")
	@RequestMapping("users")
	public String getAllUsers();
	
	
	
}
