package emp.app.custExc;

@SuppressWarnings("serial")
public class EmpException extends Exception{
	public EmpException(String errMsg) {
		super(errMsg);
	}
}
