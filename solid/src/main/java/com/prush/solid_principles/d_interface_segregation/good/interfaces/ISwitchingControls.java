package com.prush.solid_principles.d_interface_segregation.good.interfaces;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A interface which groups relevant controls needed for switching between available tracks and nothing more.
 */
public interface ISwitchingControls {

    void next();

    void previous();
}
