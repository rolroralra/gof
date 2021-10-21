package behavioral.state.example;

import org.junit.jupiter.api.Test;

public class MobilePhoneDriver {

	@Test
	public void testStatePatternExample() {
		AlertController alerter = new AlertController();
		alerter.setState(new BellState());
		
		//bell
		alerter.alert();
		alerter.switchMode();
			
		//vibration
		alerter.alert();
		alerter.switchMode();
		
		//silent
		alerter.alert();
		alerter.switchMode();
		
		//bell
		alerter.alert();
	}

}
