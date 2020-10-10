package sk.simko.microservices.backend;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class HelloController {

	private final HelloDao dao;
	
	@PostMapping("/save")
	public Hello save(@RequestParam(value = "name", defaultValue = "world") String name) throws UnknownHostException {
		Hello hello = new Hello(name, InetAddress.getLocalHost().toString());
		return dao.save(hello);
	}

	@GetMapping("/list")
	public List<Hello> list() {
		return dao.findAll();
	}
}
