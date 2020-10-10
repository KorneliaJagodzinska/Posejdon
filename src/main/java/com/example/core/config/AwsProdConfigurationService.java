package com.example.core.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class AwsProdConfigurationService implements AwsConfigurationService {
    @Override
    public String getAwsRegion() {
        return "AWS region for PROD";
    }

    @Override
    public String getAwsAZ() {
        return "AWS AZ for PROD";
    }
}
