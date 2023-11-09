package com.cib.li.myfun.lazy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class LazyBean implements InitializingBean {
    @Bean
    public LazyBean lazyBean1() {
        System.out.println("以lazy方式启动LazyBean1");
        return new LazyBean();
    }

    /**
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("让我们看下LazyBean的Configuration是不是lazy的");
    }
}
