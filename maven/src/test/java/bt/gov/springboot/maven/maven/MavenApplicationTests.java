package bt.gov.springboot.maven.maven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenApplicationTests {

	@Test
	void contextLoads() {
		int a=2;
		int b=2;
		assertTrue(a+b==4);
	}

}
