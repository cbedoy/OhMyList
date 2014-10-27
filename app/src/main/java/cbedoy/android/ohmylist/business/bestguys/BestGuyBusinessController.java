package cbedoy.android.ohmylist.business.bestguys;

import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyInformationDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyInformationHandler;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyRepresentationDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyRepresentationHandler;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyTransactionDelegate;
import cbedoy.android.ohmylist.business.bestguys.interfaces.IBestGuyTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class BestGuyBusinessController implements IBestGuyInformationDelegate, IBestGuyRepresentationDelegate, IBestGuyTransactionDelegate
{
    private IBestGuyInformationHandler informationHandler;
    private IBestGuyRepresentationHandler representationHandler;
    private IBestGuyTransactionHandler transactionHandler;

    public void setInformationHandler(IBestGuyInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setRepresentationHandler(IBestGuyRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setTransactionHandler(IBestGuyTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }
}
