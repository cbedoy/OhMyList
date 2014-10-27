package cbedoy.android.ohmylist.business;

import cbedoy.android.ohmylist.interfaces.IBackCore;
import cbedoy.android.ohmylist.interfaces.IMementoHandler;
import cbedoy.android.ohmylist.interfaces.IMessageRepresentationHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class BusinessController implements IBackCore
{
    private IMessageRepresentationHandler messageRepresentationHandler;
    private IMementoHandler mementoHandler;

    public void setMementoHandler(IMementoHandler mementoHandler) {
        this.mementoHandler = mementoHandler;
    }

    public void setMessageRepresentationHandler(IMessageRepresentationHandler messageRepresentationHandler) {
        this.messageRepresentationHandler = messageRepresentationHandler;
    }

    @Override
    public void backRequested() {

    }
}
