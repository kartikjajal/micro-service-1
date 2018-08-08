package service.discover.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("service2")
@FeignClient(url="https://www.quandl.com/api/v3/datasets/BSE/",value="USERS")
public interface Service2 {

	//@RequestMapping("/service2/welcome")
	@RequestMapping("BOM532648.csv?api_key=dzvtB36QFqZpe9FsjQsP")
	public String getAllUsers();
	
	
	
}
