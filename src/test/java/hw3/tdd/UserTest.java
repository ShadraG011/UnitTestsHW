package hw3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gbhomeworks.hw3.tdd.User;
import ru.gbhomeworks.hw3.tdd.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    UserRepository userRepository;

    @BeforeEach
    void initData() {
        userRepository = new UserRepository();
    }

    @Test
    void checkAuthenticateUserPositive(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);
        boolean accept = user.authenticate(name, password);
        assertTrue(accept);
    }

    @Test
    void checkAuthenticateUserNegative(){
        String name = "name";
        String password = "password";
        String wrongPassword = "wrongPassword";

        User user = new User(name, password, false);
        boolean accept = user.authenticate(name, wrongPassword);
        assertFalse(accept);
    }

    @Test
    void checkRepositoryAddAuthenticatedUserPositive(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);
        user.authenticate(name, password);

        int currentCount = userRepository.data.size();
        userRepository.addUser(user);

        assertThat(userRepository.data.size())
                .isEqualTo(currentCount + 1);

        User userInRepository =
                userRepository.data.get(userRepository.data.size() - 1);

        assertEquals(user, userInRepository);
    }

    @Test
    void checkRepositoryAddNotAuthenticatedUserNegative(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);

        int currentCount = userRepository.data.size();
        userRepository.addUser(user);

        assertThat(userRepository.data.size())
                .isEqualTo(currentCount);
    }

    @Test
    void unLoginAllUsersTest() {
        User user = new User("username1", "password1", false);
        User admin = new User("admin", "passwordAdmin", true);


        user.authenticate("username1", "password1");
        admin.authenticate("admin", "passwordAdmin");

        userRepository.addUser(user);
        userRepository.addUser(admin);
        userRepository.unLoginAllUsersExceptAdmin();
        assertTrue(admin.isAuthenticate);
        assertFalse(user.isAuthenticate);
    }

}
