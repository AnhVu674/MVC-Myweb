import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class My extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new ;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { "MyConfig.class" };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
