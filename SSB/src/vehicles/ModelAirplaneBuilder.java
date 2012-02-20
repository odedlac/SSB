/**
 * 
 */
package vehicles;


/**
 * @author Oded
 *
 */
public class ModelAirplaneBuilder implements AirplaneBuilder {

	private Airplane airplane;
	private LiftOff liftOff;
	private Flying flying;

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneBuilder#buildFlyingCapability()
	 */
	@Override
	public void buildFlyingCapability() {
		flying = FlyingFactory.createFlying("Model Airplane");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneBuilder#buildTakeoffCapability()
	 */
	@Override
	public void buildTakeoffCapability() {
		liftOff = LiftOffFactory.createLiftOff("Vertically");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneBuilder#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);		
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneBuilder#getAirplane()
	 */
	@Override
	public Airplane getAirplane() {
		return airplane;
	}

}
