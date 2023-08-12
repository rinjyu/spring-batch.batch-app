package com.spring.batch.common.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@RequiredArgsConstructor
public class BatchTaskConfigure extends DefaultTaskConfigurer {

    public BatchTaskConfigure(@Qualifier("batchManageDataSource") DataSource dataSource) {
        super(dataSource);
    }
}
