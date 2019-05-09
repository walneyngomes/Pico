package Configuration;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import br.com.pico.map.ney.Email;
import br.com.pico.map.ney.EventLogWriter;
import br.com.pico.map.ney.Nofification;
import br.com.pico.map.ney.SMS;

public class ConfigurationNofifitication extends AbstractModule {

	protected void configure() {

		bind(Nofification.class).annotatedWith(Names.named("SMS")).to(SMS.class);
		bind(Nofification.class).annotatedWith(Names.named("EVENT")).to(EventLogWriter.class);
		bind(Nofification.class).annotatedWith(Names.named("Email")).to(Email.class);

	}

}
