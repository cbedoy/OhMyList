package cbedoy.android.ohmylist.business.group;

import cbedoy.android.ohmylist.business.group.interfaces.IGroupInformationDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupInformationHandler;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupRepresentationDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupRepresentationHandler;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupTransactionDelegate;
import cbedoy.android.ohmylist.business.group.interfaces.IGroupTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class GroupBusinessController implements IGroupInformationDelegate, IGroupRepresentationDelegate, IGroupTransactionDelegate
{
    private IGroupInformationHandler informationHandler;
    private IGroupRepresentationHandler representationHandler;
    private IGroupTransactionHandler transactionHandler;

    public void setInformationHandler(IGroupInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setRepresentationHandler(IGroupRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setTransactionHandler(IGroupTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }
}
