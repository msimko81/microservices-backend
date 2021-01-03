package sk.simko.microservices.backend;

import java.net.InetAddress;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
@RestController
public class HelloController {

	private final HelloDao dao;
	
	@GetMapping("/info")
	@SneakyThrows
	public Info info() {
		return new Info(InetAddress.getLocalHost().toString(), "0.0.2.RELEASE");
	}
	
	@PostMapping("/save")
	@SneakyThrows
	public Hello save(@RequestParam(value = "name", defaultValue = "world") String name) {
		Hello hello = new Hello(name, InetAddress.getLocalHost().toString());
		return dao.save(hello);
	}

	@GetMapping("/list")
	public List<Hello> list() {
		return dao.findAll();
	}
}
