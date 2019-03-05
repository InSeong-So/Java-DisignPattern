package designPattern.pattern16.mediator;

public interface Colleague {

	public abstract void setMediator(Mediator mediator);

	public abstract void setColleagueEnabled(boolean enabled);
}
