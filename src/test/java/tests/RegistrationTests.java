package tests;

import config.AppiumConfig;
import dto.UserDto;
import org.testng.annotations.Test;
import screens.SplashScreen;

import java.util.Random;

public class RegistrationTests extends AppiumConfig {
    @Test
    public void registrationPositiveTest(){
        int i = new Random().nextInt(1000);
        UserDto user = UserDto.builder()
                .email("frodo_bag" + i + "@mail.com")
                .name("Frodo")
                .lastName("Bag")
                .password("Qwerty123$")
                .build();
        new SplashScreen(driver).goToSearchScreen().clickDots().clickRegistration();
    }

}
