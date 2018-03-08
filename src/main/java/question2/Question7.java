package question2;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;

public class Question7
{

    public String getScope(ConfigurableApplicationContext context, String sourceBean) {

        BeanDefinition beanDefinition = context.getBeanFactory().getMergedBeanDefinition(sourceBean);
        return beanDefinition.getScope();
    }
}

