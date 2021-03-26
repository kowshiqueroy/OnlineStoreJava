package OSPackage;
import java.time.LocalDate;

public class FoodItem extends Product{
	
	private LocalDate mfgDate, expirationDate;

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	double putOnSale(Object criterion, int percentage) {
		// TODO Auto-generated method stub
		return 0;
	}
}
