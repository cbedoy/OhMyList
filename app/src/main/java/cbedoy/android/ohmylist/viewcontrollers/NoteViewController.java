package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.notes.interfaces.INoteRepresentationDelegate;
import cbedoy.android.ohmylist.business.notes.interfaces.INoteRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class NoteViewController extends AbstractViewController implements INoteRepresentationHandler {

    private INoteRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(INoteRepresentationDelegate representationDelegate) {
        this.representationDelegate = representationDelegate;
    }

    @Override
    protected View init() {
        return null;
    }

    @Override
    public void reload() {

    }

    @Override
    public void showPreviewViewController() {

    }
}
