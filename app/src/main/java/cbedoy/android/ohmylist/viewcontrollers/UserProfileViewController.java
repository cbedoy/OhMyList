package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.profile.interfaces.IProfileRepresentationDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileRepresentationDelegate;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileRepresentationHandler;
import cbedoy.android.ohmylist.business.userprofile.interfaces.IUserProfileTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class UserProfileViewController extends AbstractViewController implements IUserProfileRepresentationHandler{

    private IUserProfileRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IUserProfileRepresentationDelegate representationDelegate) {
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
