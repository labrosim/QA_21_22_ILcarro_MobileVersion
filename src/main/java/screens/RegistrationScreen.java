package screens;

import dto.UserDto;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.Random;

public class RegistrationScreen extends BaseScreen{
    public RegistrationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


}
