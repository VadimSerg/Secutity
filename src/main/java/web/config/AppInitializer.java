
package web.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class, WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{ WebConfig.class  };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    protected Filter[]  getServletFilters() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return  new Filter[] { encodingFilter };
    }
}