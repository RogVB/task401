package es.usj.task401;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MediaPlayerService extends IntentService {

    public MediaPlayerService() {
        super("MediaPlayerService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound);
        mediaPlayer.start();
    }
}
