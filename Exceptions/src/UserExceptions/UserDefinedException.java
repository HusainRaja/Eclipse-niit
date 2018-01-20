package UserExceptions;

public class UserDefinedException extends Exception{
	public String getMessage() {
		return "number should be between 1 and 100";
	}
	public void printStackTrace() {
		System.err.println("there is an error at Thread Main");
		System.err.println(getMessage());
	}
}
