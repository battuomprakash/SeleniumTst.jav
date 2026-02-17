package sikuli;


import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Sikuli_Test {
	
	  Screen s = new Screen();
	
  @Test
  public void Captured_Sikuli_images() throws SikuliException, InterruptedException {
	  s.click("C:\\Users\\OM PRAKASH\\Documents\\Lib\\Sikuli\\window.PNG");
  }
}
