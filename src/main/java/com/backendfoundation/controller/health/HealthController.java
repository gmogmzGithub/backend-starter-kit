package com.backendfoundation.controller.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @Autowired(required = false)
    private BuildProperties buildProperties;

    @Autowired
    private Environment env;

    @GetMapping("/alive")
    public Map<String, Object> alive() {
        Map<String, Object> response = new HashMap<>();

        if (buildProperties != null) {
            response.put("name", buildProperties.getName());
            response.put("version", buildProperties.getVersion());
            response.put("artifact", buildProperties.getArtifact());
            response.put("group", buildProperties.getGroup());
            response.put("description", env.getProperty("build.info.description"));
        } else {
            response.put("message", "Build properties not available.");
        }

        return response;
    }
}
