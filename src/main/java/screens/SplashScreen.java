package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen{
    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
//    @FindBy(xpath = "//*[text() = '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]']")
//    MobileElement versionTextView;

    @FindBy(id = "com.telran.ilcarro:id/versionText")
    MobileElement titleTextView;

    public String getCurrentVersion(){
        return titleTextView.getText();
    }
}
