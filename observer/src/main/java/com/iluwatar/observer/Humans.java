package com.iluwatar.observer;

import java.util.logging.Logger;

/**
 * Humans.
 */

public class Humans implements WeatherObserver{

    private static final Logger LOGGER = Logger.getLogger(Orcs.class.getName());

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case FOGGY:
                LOGGER.info("The humans trying to see something in the fog.");
                break;
            case COLD:
                LOGGER.info("The humans in cold weather, wear warm clothes.");
                break;
            case RAINY:
                LOGGER.info("The humans open umbrellas.");
                break;
            case SUNNY:
                LOGGER.info("The humans are sunbath.");
                break;
            case WINDY:
                LOGGER.info("The humans are hard to stand still in windy weather.");
                break;
            default:
                break;
        }
    }
}
