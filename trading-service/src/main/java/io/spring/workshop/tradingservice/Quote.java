package io.spring.workshop.tradingservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;

@Getter @Setter @NoArgsConstructor
public class Quote {

	private static final MathContext MATH_CONTEXT = new MathContext(2);

	private String ticker;

	private BigDecimal price;

	private Instant instant;

	public Quote(String ticker, BigDecimal price) {
		this.ticker = ticker;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Quote{" +
				"ticker='" + ticker + '\'' +
				", price=" + price +
				", instant=" + instant +
				'}';
	}
}