package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.login.interfaces.ILoginRepresentationDelegate;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class LoginViewController extends AbstractViewController implements ILoginRepresentationHandler {

    private ILoginRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(ILoginRepresentationDelegate representationDelegate) {
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
