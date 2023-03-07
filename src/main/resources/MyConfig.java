import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@Component({ "com.anhvu" })
public class MyConfig {
	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
