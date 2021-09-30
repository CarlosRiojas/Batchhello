package com.BatchHello.BatchExample.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBatchConfig {
    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory){
        jobBuilderFactory.get("ETL-Load")
    }
}
