package cbedoy.android.ohmylist.business.califications;

import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationInformationDelegate;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationInformationHandler;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationRepresentationDelegate;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationRepresentationHandler;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationTransactionDelegate;
import cbedoy.android.ohmylist.business.califications.interfaces.ICalificationTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class CalificationBusinessController implements ICalificationInformationDelegate, ICalificationRepresentationDelegate, ICalificationTransactionDelegate
{
    private ICalificationInformationHandler informationHandler;
    private ICalificationRepresentationHandler representationHandler;
    private ICalificationTransactionHandler transactionHandler;

    public void setTransactionHandler(ICalificationTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    public void setRepresentationHandler(ICalificationRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setInformationHandler(ICalificationInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }
}
