package service.discover.server;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service1")
public class Service1 {
		
	@Autowired
	private Service2 service2;
	
	private static final Logger LOG = Logger.getLogger(Service1.class.getName());
	
	@Value("${server.port}")
    private int serverPort;

	@RequestMapping("/hello")
	public String hello() {
		LOG.info("Before hello()");
		return "hello-from-service-1 with "+serverPort;		
	}
	
	@RequestMapping("/service2")
	public String users() {
		LOG.info("Before users()");
		String str=service2.getAllUsers();
		LOG.info("After users()");
		return str;
	}
	
	@RequestMapping("/common")	
	public String common() {
		LOG.info("Before common()");
		return "hello-from-common-service-1 with "+serverPort;
	}

	@RequestMapping("/admin")
	public String admin() {
		return "hello-from-admin-service-1 with "+serverPort;
	}
	
}
