package PageFactory;

import Pages.LoginPage;

public class PageFactory {
    private LoginPage logobj;

    public LoginPage getloginPage() {
        if (logobj == null) {
            logobj = new LoginPage();
        }
        return logobj;
    }

}
