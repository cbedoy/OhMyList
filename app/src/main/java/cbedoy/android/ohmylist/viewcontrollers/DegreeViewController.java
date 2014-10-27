package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeRepresentationDelegate;
import cbedoy.android.ohmylist.business.degree.interfaces.IDegreeRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class DegreeViewController extends AbstractViewController implements IDegreeRepresentationHandler {

    private IDegreeRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IDegreeRepresentationDelegate representationDelegate) {
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
