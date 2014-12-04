package com.Helios811.TestMod.handler;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;



        try
        {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value.").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            if (configuration.hasChanged()) {

                configuration.save();
            }
        }



            System.out.println("Configuration Value: " + configValue);

    }
}
