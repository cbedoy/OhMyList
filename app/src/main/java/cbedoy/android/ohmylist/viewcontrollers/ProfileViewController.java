package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.profile.interfaces.IProfileRepresentationDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class ProfileViewController extends AbstractViewController implements IProfileRepresentationHandler {

    private IProfileRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IProfileRepresentationDelegate representationDelegate) {
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
