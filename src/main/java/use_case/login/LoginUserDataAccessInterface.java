package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the current user by their username.
     * This method is used to record the username of the logged-in user.
     * @param name the username of the user to set as currently logged in
     */
    void setCurrentUser(String name);

    /**
     * Retrieves the username of the current user.
     * Returns the username of the currently logged-in user or null if no user is logged in.
     * @return the username of the current user, or null if no user is logged in
     */
    String getCurrentUser();
}
