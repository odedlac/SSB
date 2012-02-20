/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class HarrierFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		return FlyingFactory.createFlying("Fighter Jet");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		return LiftOffFactory.createLiftOff("Vertically");
	}

}
