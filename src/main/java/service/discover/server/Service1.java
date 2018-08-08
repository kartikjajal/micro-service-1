package service.discover.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service1")
public class Service1 {
		
	@Autowired
	private Service2 service2;
	
	@Value("${server.port}")
    private int serverPort;

	@RequestMapping("/hello")
	public String hello() {
		return "hello-from-service-1 with "+serverPort;
	}
	
	@RequestMapping("/service2")
	public String users() {
		return service2.getAllUsers();
	}
	
}
