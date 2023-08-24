package com.spring.batch.common.incrementer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class BatchJobParametersIncrementer implements JobParametersIncrementer {

    private static String batchRunDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    private static String RUN_DATE_TIME_KEY = "run.dateTime";

    @Override
    public JobParameters getNext(JobParameters jobParameters) {
        log.debug("batchRunDate ::: {}", batchRunDateTime);
        return new JobParametersBuilder(jobParameters).addString(RUN_DATE_TIME_KEY, batchRunDateTime).toJobParameters();
    }
}