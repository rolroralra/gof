package behavioral.state.example;

public class AlertController {
	private AlertState state;
	
	public void setState(AlertState state) {
		this.state = state;
	}

	public void alert() {
		state.alert();
	}

	public void switchMode() {
		System.out.printf("%s --> ", this.state.getClass().getSimpleName());
		setState(state.nextState());
		System.out.println(this.state.getClass().getSimpleName());
	}

}
