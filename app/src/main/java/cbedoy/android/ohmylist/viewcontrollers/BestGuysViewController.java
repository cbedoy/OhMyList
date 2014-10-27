package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyRepresentationDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class BestGuysViewController extends AbstractViewController implements IBestGuyRepresentationHandler {

    private IBestGuyRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IBestGuyRepresentationDelegate representationDelegate) {
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
