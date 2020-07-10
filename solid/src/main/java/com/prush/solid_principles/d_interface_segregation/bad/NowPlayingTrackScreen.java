package com.prush.solid_principles.d_interface_segregation.bad;

import com.prush.solid_principles.d_interface_segregation.bad.interfaces.IAudioPlayerControls;
import com.prush.solid_principles.d_interface_segregation.bad.models.Track;

@SuppressWarnings("unused")
public class NowPlayingTrackScreen implements IAudioPlayerControls {

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
