package usantatecla.utils;

public abstract class Command {

	protected String title;

	protected Command(String title) {
		this.title = title;
	}

	protected abstract void interact();

	public abstract boolean isActive();

	public String getTitle() {
		return this.title;
	}

}
