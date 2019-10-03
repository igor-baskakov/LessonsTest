import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getAllUsers() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }


    @Test
    public void getAllUsers_FEMALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getHowManyUsers();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_MALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getHowManyUsers(Sex.MALE);
        int actual = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getHowManyUsers(Sex.FEMALE);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAllAgeUsers();
        int actual = 32 + 43 + 25;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAllAgeUsers(Sex.MALE);
        int actual = 43 + 25;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAllAgeUsers(Sex.FEMALE);
        int actual = 32;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageAgeOfAllUsers() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAverageAgeOfAllUsers();
        int actual = (32 + 43 + 25) / 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageAgeOfAllUsers_FEMALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAverageAgeOfAllUsers(Sex.FEMALE);
        int actual = 32;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageAgeOfAllUsers_MALE() {
        User user1 = new User("Марина",32, Sex.FEMALE);
        User user2 = new User("Евгений", 43, Sex.MALE);
        User user3 = new User("Жорж", 25, Sex.MALE);

        int expected = User.getAverageAgeOfAllUsers(Sex.MALE);
        int actual = (43 + 25) / 2;
        Assert.assertEquals(expected, actual);
    }
}