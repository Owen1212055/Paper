package io.papermc.paper.connection;

import com.destroystokyo.paper.profile.PlayerProfile;
import java.net.InetAddress;
import org.bukkit.NamespacedKey;
import org.jspecify.annotations.Nullable;

public interface PlayerLoginConnection extends CookieConnection {

    /**
     * Gets the authenticated profile for this connection.
     * This may return null depending on what stage this connection is at.
     * @return authenticated profile, or null if not currently present
     */
    @Nullable PlayerProfile getAuthenticatedProfile();

    /**
     * Gets the player profile that this connection is requesting to authenticate as.
     * @return the unsafe unauthenticated profile, or null if not currently sent
     */
    @Nullable
    PlayerProfile getUnsafeProfile();

    /**
     * Gets the player IP address.
     *
     * @return The IP address
     */
    InetAddress getAddress();

    /**
     * Gets the raw address of the player logging in
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

    // TODO: Should we have a read-only interface?
    @Deprecated
    @Override
    void storeCookie(NamespacedKey key, byte[] value) throws UnsupportedOperationException;
}
