package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConfigurationTest {

    @Test
    public void shouldRetunSameInstance() {
        Configuration configuration = Configuration.getInstance();

        assertEquals(configuration, Configuration.getInstance());
    }

    @Test
    public void shouldInitCorrectly() {
        Configuration configuration = Configuration.getInstance();
        
        String urlKey = "db.url";
        String userKey = "db.user";
        String passwordKey = "db.password";

        String expectedUrl = "jdbc:mysql://localhost:3306/mabase";
        String expectedUser = "root";
        String expectedPassword = "1234";

        assertEquals(expectedUrl, configuration.getString(urlKey));
        assertEquals(expectedUser, configuration.getString(userKey));
        assertEquals(expectedPassword, configuration.getString(passwordKey));
    }
}
