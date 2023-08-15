package com.spring.batch.common.config.xstream;

import com.thoughtworks.xstream.XStream;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.xstream.XStreamMarshaller;

@Configuration
public class XStreamConfiguration {

    public XStreamConfiguration(XStreamMarshaller xStreamMarshaller) {
        XStream xstream = xStreamMarshaller.getXStream();
        xstream.allowTypesByWildcard(new String[]{"com.spring.batch.**"});
    }
}
