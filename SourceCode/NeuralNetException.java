public class NeuralNetException extends NetworkException{

	private static final long serialVersionUID = 1L;
	
	public NeuralNetException(){
		
	}
	
	public NeuralNetException(String message){
		super(message);
	}
	
	public NeuralNetException(String message, Exception e){
		super(message, e);
	}
	
	public NeuralNetException(Throwable cause){
		super(cause);
	}
	
	public NeuralNetException(Throwable cause, String message){
		super(message, cause);
	}
}
