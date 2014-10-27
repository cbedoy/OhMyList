package cbedoy.android.ohmylist.viewcontrollers;

import android.view.View;

import cbedoy.android.ohmylist.business.group.interfaces.IGroupRepresentationDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class GroupViewController extends AbstractViewController implements IGroupRepresentationHandler {

    private IGroupRepresentationDelegate representationDelegate;

    public void setRepresentationDelegate(IGroupRepresentationDelegate representationDelegate) {
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
