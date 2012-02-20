package vehicles;

public interface AirplaneBuilder {

	public abstract void buildFlyingCapability();

	public abstract void buildTakeoffCapability();

	public abstract void buildAirplane();

	public abstract Airplane getAirplane();

}