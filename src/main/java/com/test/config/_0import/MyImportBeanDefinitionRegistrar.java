package com.test.config._0import;

import com.test.bean.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by majianghua on 2018/10/12.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
    /**
     *
     * @param importingClassMetadata  当前类的注解信息
     * @param registry   用来注册BeanDefinition
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //注册User  bean
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(User.class);
        registry.registerBeanDefinition("userBeanDefition",rootBeanDefinition);

    }
}
