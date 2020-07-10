package com.prush.d_interface_segregation.bad.interfaces;

import com.prush.d_interface_segregation.bad.models.Track;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A fat interface trying to group multiple related functionalities together. This is a common pitfall
 * which often leads to a lot of classes needing to implement unnecessary methods in future.
 */
public interface IAudioPlayerControls {
    void play(Track track);

    void pause();

    void stop();

    void next();

    void previous();
}
