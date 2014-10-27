package cbedoy.android.ohmylist.widgets;

import android.app.Activity;

import cbedoy.android.ohmylist.interfaces.IMessageRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class MessageRepresentation implements IMessageRepresentationHandler {

    private Activity activity;

    public MessageRepresentation(Activity activity){
        this.activity = activity;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void hideMessage() {

    }

    @Override
    public void showCode(NOTIFICATION_CODE code) {

    }

    @Override
    public void showCodeMessage(NOTIFICATION_CODE code, String message) {

    }

    @Override
    public void showCodeTitleMessage(NOTIFICATION_CODE code, String title, String message) {

    }

    @Override
    public void showCodeTitleMessageWithCallback(NOTIFICATION_CODE code, String title, String message, IMessageRepresentationCallback callback) {

    }
}
