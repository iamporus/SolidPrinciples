package com.prush.d_interface_segregation.good.interfaces;


import com.prush.d_interface_segregation.good.models.Track;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A interface which groups relevant controls needed for playback and nothing more.
 */
public interface IPlaybackControls {

    void play(Track track);

    void pause();

    void stop();
}
