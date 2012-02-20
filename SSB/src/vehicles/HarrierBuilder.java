/**
 * 
 */
package vehicles;


/**
 * @author Oded
 *
 */
public class HarrierBuilder implements AirplaneBuilder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;
	

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneBuilder#buildFlyingCapability()
	 */
	@Override
	public void buildFlyingCapability() {
		flying = FlyingFactory.createFlying("Fighter Jet");
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
		// TODO Auto-generated method stub
		return airplane;
	}

}
