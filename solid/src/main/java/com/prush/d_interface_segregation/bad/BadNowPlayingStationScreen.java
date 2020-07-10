package com.prush.d_interface_segregation.bad;

import com.prush.d_interface_segregation.bad.interfaces.IAudioPlayerControls;
import com.prush.d_interface_segregation.bad.models.Track;
import com.prush.d_interface_segregation.good.GoodNowPlayingStationScreen;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * The system in context has two kinds of content available for playback:
 * - Track
 *      Once playback starts, a track can be paused, resumed, stopped, or switched to next and previous available tracks.
 * - Station
 *      contains multiple tracks. A random track from the station is selected for playback. It can be then paused, resumed, stopped
 *      but switching to next or previous tracks is not allowed.
 * <p>
 * Respective screens are created to display currently playing (NowPlaying) track and station with available playback controls.
 *
 * Problem with this approach:
 * - Notice that even though a screen showing Now Playing Station's information doesn't need next and previous
 *  controls, it is still required to implement the methods as it is bound to a fat interface.
 *
 * <p>
 * This violates the ISP, as the IAudioPlayerControls interface is clearly grouping multiple functionalities together.
 *
 * @see GoodNowPlayingStationScreen for a solution which follows the principle and fixes the problems.
 */
public class BadNowPlayingStationScreen implements IAudioPlayerControls {
    @Override
    public void play(Track track) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {
        throw new UnsupportedOperationException("Next operation is not supported for tracks from a Station");
    }

    @Override
    public void previous() {
        throw new UnsupportedOperationException("Previous operation is not supported for tracks from a Station");
    }
}
