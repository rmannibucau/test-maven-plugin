package com.github.rmannibucau.maven.common;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "cdi")
public class CdiMojo extends AbstractMojo {
    @Override
    public void execute() {
        try (final SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            getLog().info("Started");
        }
    }
}
