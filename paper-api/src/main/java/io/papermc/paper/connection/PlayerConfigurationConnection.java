package io.papermc.paper.connection;

import com.destroystokyo.paper.ClientOption;
import com.destroystokyo.paper.profile.PlayerProfile;
import java.net.InetAddress;

public interface PlayerConfigurationConnection extends PlayerCommonConnection {

    /**
     * Gets the profile for this connection.
     *
     * @return profile
     */
    PlayerProfile getProfile();

    /**
     * Gets the player IP address.
     *
     * @return The IP address
     */
    InetAddress getAddress();

    /**
     * Gets the raw address of the player logging in
     *
     * @return The address
     */
    InetAddress getRawAddress();

    /**
     * Gets the hostname that the player used to connect to the server, or
     * blank if unknown
     *
     * @return The hostname
     */
    String getHostname();

    /**
     * Clears the players chat history and their local chat.
     */
    void clearChat();

    /**
     * Completes the configuration for this player, which will cause this player to reenter the game.
     * <p>
     * Note, this should be only be called if you are reconfiguring the player.
     */
    void completeConfiguration();

    /**
     * @param type client option
     * @return the client option value of the player
     */
    <T> T getClientOption(ClientOption<T> type);

}
