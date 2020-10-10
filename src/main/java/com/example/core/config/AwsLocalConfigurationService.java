package com.example.core.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"local", "default"})
public class AwsLocalConfigurationService implements AwsConfigurationService{
    @Override
    public String getAwsRegion() {
        return "AWS region for LOCAL";
    }

    @Override
    public String getAwsAZ() {
        return "AWS AZ for LOCAL";
    }
}
