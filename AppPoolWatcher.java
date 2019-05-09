package Injector;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import br.com.pico.map.ney.Nofification;

public class AppPoolWatcher {

	Nofification action;

	@Inject
	public AppPoolWatcher(@Named("EVENT") Nofification spellChecker) {
		this.action = spellChecker;

	}

	public Nofification getAction() {
		return action;
	}

	public void setAction(Nofification action) {
		this.action = action;
	}

	public void notificar() {
		action.ActOnNotification();
	}

}
