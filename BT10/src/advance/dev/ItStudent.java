package advance.dev;

public class ItStudent implements ICoder, IGamer, IHacker {
	public void code() {
		System.out.println("0");
	}

	@Override
	public void playGame() {
	System.out.println("1");
	}

	@Override
	public void hackFacebook() {
		System.out.println("2");
	}

	@Override
	public String sleep(String time) {
		return time;
	}
}
