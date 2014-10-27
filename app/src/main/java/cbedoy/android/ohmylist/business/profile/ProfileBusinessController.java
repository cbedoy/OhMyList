package cbedoy.android.ohmylist.business.profile;

import cbedoy.android.ohmylist.business.profile.interfaces.IProfileInformationDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileInformationHandler;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileRepresentationDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileRepresentationHandler;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileTransactionDelegate;
import cbedoy.android.ohmylist.business.profile.interfaces.IProfileTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class ProfileBusinessController implements IProfileInformationDelegate, IProfileRepresentationDelegate, IProfileTransactionDelegate
{
    private IProfileInformationHandler informationHandler;
    private IProfileTransactionHandler transactionHandler;
    private IProfileRepresentationHandler representationHandler;

    public void setInformationHandler(IProfileInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }

    public void setRepresentationHandler(IProfileRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setTransactionHandler(IProfileTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }
}
