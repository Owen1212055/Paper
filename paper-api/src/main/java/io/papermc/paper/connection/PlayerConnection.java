package io.papermc.paper.connection;

import net.kyori.adventure.text.Component;

public interface PlayerConnection {

    /**
     * Disconnects the player connection.
     * <p>
     * Note that calling this during connection related events may caused undefined behavior.
     * @param component disconnect reason
     */
    void disconnect(Component component);

    /**
     * Gets if this connection originated from a transferred connection.
     * @return is transferred
     */
    boolean isTransferred();
}
