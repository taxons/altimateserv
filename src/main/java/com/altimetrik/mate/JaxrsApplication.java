package com.altimetrik.mate;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;


@Component
@ApplicationPath("/v1/manage/")
public class JaxrsApplication extends Application {
}