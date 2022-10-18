package core.logging;

public class FileLogger implements Logger {

	@Override
	public void logadd(String data) {
		System.out.println("file loglandı: " +data);
		
	}

}
