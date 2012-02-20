/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class ModelAirPlaneFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		return FlyingFactory.createFlying("Model Airplane");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		return LiftOffFactory.createLiftOff("don't");
	}

}
