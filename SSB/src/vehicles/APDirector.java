/**
 * 
 */
package vehicles;


/**
 * @author Oded
 *
 */
public class APDirector {

	
	private AirplaneBuilder builder;

	public APDirector(AirplaneBuilder harrierBuilder) {
		builder = harrierBuilder;
	}

	public void buildAirPlane() {
		builder.buildFlyingCapability();
		builder.buildTakeoffCapability();
		builder.buildAirplane();		
	}

}
