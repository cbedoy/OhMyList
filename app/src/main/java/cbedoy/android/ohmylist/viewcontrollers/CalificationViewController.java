package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationRepresentationDelegate;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class CalificationViewController extends AbstractViewController implements ICalificationRepresentationHandler {

    private ICalificationRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(ICalificationRepresentationDelegate representationDelegate) {
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
