package sk.simko.microservices.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Hello {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String ipAddress;
	
	public Hello(String name, String ipAddress) {
		this.name = name;
		this.ipAddress = ipAddress;
	}
}
