package org.garethevans.plugin;

import hudson.Plugin
import java.util.logging.*

public class PluginImpl extends Plugin {

  private final static Logger LOG = Logger.getLogger(PluginImpl.class.getName());

  public void start() throws Exception {
    LOG.info("starting my plugin");
  }
}
