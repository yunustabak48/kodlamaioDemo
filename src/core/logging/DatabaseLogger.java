package core.logging;

public class DatabaseLogger  implements Logger{

	@Override
	public void logadd(String data) {
		System.out.println("databaseye loglandı:"+data);
	}

}
