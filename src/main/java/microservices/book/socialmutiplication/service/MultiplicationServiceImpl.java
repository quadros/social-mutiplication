package microservices.book.socialmutiplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservices.book.socialmutiplication.domain.Multiplication;

@Service("multiplicationServiceImpl")
public class MultiplicationServiceImpl implements MultiplicationService {
	
	
	private RandomGeneratorService randomGeneratorService;
	
	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}

	@Override
	public Multiplication createRandaomMultiplication() {
		int factorA = randomGeneratorService.generateRamdomFactor();
		int factorB = randomGeneratorService.generateRamdomFactor();
		return new Multiplication(factorA, factorB);
	}

}
