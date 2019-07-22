package io.spring.workshop.tradingservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TradingUser {

	@Id
	private String id;

	private String userName;

	private String fullName;

	public TradingUser(String userName, String fullName) {
		this.userName = userName;
		this.fullName = fullName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TradingUser that = (TradingUser) o;

		if (!id.equals(that.id)) return false;
		return userName.equals(that.userName);
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + userName.hashCode();
		return result;
	}
}

