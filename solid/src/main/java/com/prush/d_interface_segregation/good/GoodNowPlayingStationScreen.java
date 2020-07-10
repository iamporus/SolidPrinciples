package com.prush.d_interface_segregation.good;

import com.prush.d_interface_segregation.good.interfaces.IPlaybackControls;
import com.prush.d_interface_segregation.good.interfaces.ISwitchingControls;
import com.prush.d_interface_segregation.good.models.Track;

/**
 * Notice how IAudioPlayerControls interface is now split into two cohesive interfaces.
 *
 * @see IPlaybackControls - groups playback controls together
 * @see ISwitchingControls - groups switching controls together
 * <p>
 * This removes the need of implementing unnecessary methods and keeps your classes clean and less confusion prone.
 */
public class GoodNowPlayingStationScreen implements IPlaybackControls {
    @Override
    public void play(Track track) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

}
