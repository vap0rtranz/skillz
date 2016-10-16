/**
 * 
 */
package chapter9;

/**
 * @author Justin
 *
 */
public class TV {
	/**
	 * @param args
	 */
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV() { }

	public void turnOn() { on = true; }
	
	public void channelUp()
	{
		if (on && channel < 12)
		{
			channel++;
		}
	}

}
