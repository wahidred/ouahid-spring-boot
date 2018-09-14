package bpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DebugBpp implements BeanPostProcessor {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		logger.debug("¤¤¤¤¤¤¤¤¤ CREATION " + bean.toString());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
