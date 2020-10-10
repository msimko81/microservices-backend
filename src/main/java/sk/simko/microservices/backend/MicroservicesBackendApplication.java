package sk.simko.microservices.backend;

import java.io.Closeable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MicroservicesBackendApplication implements Closeable {

	private static ConfigurableApplicationContext appCtx;
	
	public static void main(String[] args) {
		appCtx = SpringApplication.run(MicroservicesBackendApplication.class, args);
	}
	
	@Override
    public void close() {
		appCtx.close();
    }
}
