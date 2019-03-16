package microservices.book.socialmutiplication;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.given;

import microservices.book.socialmutiplication.domain.Multiplication;
import microservices.book.socialmutiplication.service.MultiplicationService;
import microservices.book.socialmutiplication.service.RandomGeneratorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

	@MockBean
	private RandomGeneratorService randomGeneratorService;
	
	
	@Autowired
	@Qualifier("multiplicationServiceImpl")
	private MultiplicationService multiplicationService;
	
	
	@Test
	public void createRandomMultiplicationTest() {
		
		given(randomGeneratorService.generateRamdomFactor()).willReturn(50, 30);
		
		Multiplication multiplication  = multiplicationService.createRandaomMultiplication();
		
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
		
		
		
	}
	
}
