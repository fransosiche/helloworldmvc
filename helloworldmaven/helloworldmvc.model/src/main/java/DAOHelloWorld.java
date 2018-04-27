package fr.exia.helloworldmaven;

public class DAOHelloWorld {
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String HelloWorldMessage = null;

	public DAOHelloWorld() {
		readfile();
		// TODO Auto-generated constructor stub

	}

	public static DAOHelloWorld getinstance() {

	}

	private static DAOHelloWorld setinstance(DAOHelloWorld instance) {

	}

	private void readfile(){
		BufferedReader br = new BufferedReader(new FileReader("Bureau/text.txt")));
		String line;
		while ((line = br.readLine()) != null) {
		   
		}
		br.close();
		
	}

	public String getHelloWorldMessage() {

	}

	public void setHelloWorldMessage(String helloWorldMessage) {

	}
}
