package cbedoy.android.ohmylist.business.list;

import cbedoy.android.ohmylist.business.list.interfaces.IListInformationDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListInformationHandler;
import cbedoy.android.ohmylist.business.list.interfaces.IListRepresentationDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListRepresentationHandler;
import cbedoy.android.ohmylist.business.list.interfaces.IListTransactionDelegate;
import cbedoy.android.ohmylist.business.list.interfaces.IListTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class ListBusinessController implements IListInformationDelegate, IListRepresentationDelegate, IListTransactionDelegate
{
    private IListInformationHandler informationHandler;
    private IListTransactionHandler transactionHandler;
    private IListRepresentationHandler representationHandler;

    public void setTransactionHandler(IListTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    public void setRepresentationHandler(IListRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setInformationHandler(IListInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }
}
