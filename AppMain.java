package Teste;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

import Configuration.ConfigurationNofifitication;
import Injector.AppPoolWatcher;

public class AppMain {
	public static void main(String[] walneynegreiros) {
		Injector injector = Guice.createInjector(new ConfigurationNofifitication()); // classe configuracao
		AppPoolWatcher app = (AppPoolWatcher) injector.getInstance(AppPoolWatcher.class);

		
		app.notificar();

	}

}
