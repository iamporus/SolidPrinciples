package com.prush.d_interface_segregation.good;

import com.prush.d_interface_segregation.good.interfaces.ISwitchingControls;
import com.prush.d_interface_segregation.good.interfaces.IPlaybackControls;
import com.prush.d_interface_segregation.good.models.Track;

@SuppressWarnings("unused")
public class NowPlayingTrackScreen implements IPlaybackControls, ISwitchingControls {

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

    }

    @Override
    public void previous() {

    }
}
