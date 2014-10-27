package cbedoy.android.ohmylist.business.signup;

import cbedoy.android.ohmylist.business.signup.interfaces.ISignupInformationDelegate;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupInformationHandler;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupRepresentationDelegate;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupRepresentationHandler;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupTransactionDelegate;
import cbedoy.android.ohmylist.business.signup.interfaces.ISignupTransactionHandler;

/**
 * Created by Carlos on 26/10/2014.
 */
public class SignUpBusinessController implements ISignupInformationDelegate, ISignupRepresentationDelegate, ISignupTransactionDelegate
{
    private ISignupInformationHandler informationHandler;
    private ISignupRepresentationHandler representationHandler;
    private ISignupTransactionHandler transactionHandler;

    public void setTransactionHandler(ISignupTransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    public void setRepresentationHandler(ISignupRepresentationHandler representationHandler) {
        this.representationHandler = representationHandler;
    }

    public void setInformationHandler(ISignupInformationHandler informationHandler) {
        this.informationHandler = informationHandler;
    }
}
