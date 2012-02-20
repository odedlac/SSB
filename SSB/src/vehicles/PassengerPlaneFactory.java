/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class PassengerPlaneFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		return FlyingFactory.createFlying("Passenger Airplane");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		return LiftOffFactory.createLiftOff("Horizontally");
	}

}
