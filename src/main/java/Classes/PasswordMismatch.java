package Classes;

public class PasswordMismatch extends Throwable {

	public PasswordMismatch() {
		super("Password is not the same.");
	}
	public PasswordMismatch(String message) {
		super(message);
	}
}
