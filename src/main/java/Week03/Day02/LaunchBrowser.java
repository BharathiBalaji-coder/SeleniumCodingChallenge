package Week03.Day02;

public class LaunchBrowser extends LaunchEdgeBrowser {
	
	
	
	public void launch() {
		super.launch();
		System.out.println("Chrome");

	}
	
	
	public static void main(String[] args) {
		
		LaunchBrowser browser=new LaunchBrowser();
		browser.launch();
	}
	

}
