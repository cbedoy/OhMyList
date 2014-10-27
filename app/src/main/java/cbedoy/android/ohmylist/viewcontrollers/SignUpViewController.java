package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.signup.interfaces.ISignupRepresentationDelegate;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class SignUpViewController extends AbstractViewController implements ISignupRepresentationHandler {

    private ISignupRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(ISignupRepresentationDelegate representationDelegate) {
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
