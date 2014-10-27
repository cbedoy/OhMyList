package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.list.interfaces.IListRepresentationDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class ListViewController extends AbstractViewController implements IListRepresentationHandler{

    private IListRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IListRepresentationDelegate representationDelegate) {
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
