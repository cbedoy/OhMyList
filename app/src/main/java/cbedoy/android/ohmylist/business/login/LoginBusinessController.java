package cbedoy.android.ohmylist.business.login;

import cbedoy.android.ohmylist.business.login.interfaces.ILoginInformationDelegate;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginInformationHandler;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginRepresentationDelegate;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginRepresentationHandler;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginTransactionDelegate;
import cbedoy.android.ohmylist.business.login.interfaces.ILoginTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class LoginBusinessController implements ILoginInformationDelegate, ILoginRepresentationDelegate, ILoginTransactionDelegate
{
    private ILoginInformationHandler informationHandler;
    private ILoginRepresentationHandler representationHandler;
    private ILoginTransactionHandler transactionHandler;

    public void setInformationHandler(ILoginInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setRepresentationHandler(ILoginRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setTransactionHandler(ILoginTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }
}
