package net.runelite.api;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum LoginState
{
    UNKNOWN(-1),
    SHUTDOWN_PREVIOUS_CONNECTION(0),
    INIT_MOUSEHANDLER_SOCKET(1),
    WRITE_INITIAL_LOGIN_PACKET(2),
    READ_LOGIN_STATUS(3),
    READ_RANDOM_VERIFICATION_NUMBER(4),
    WRITE_CLIENT_INFO_PACKET(5),
    READ_CLIENT_INFO_STATUS(6),
    READ_DIGEST_PARSER_PACKET_SIZE(7),
    SUBMIT_DIGEST_PARSER_TASK(8),
    WRITE_DIGEST_PARSER_RESULT(9),
    READ_STATE_11_PACKET_SIZE(10),
    UNMAPPED_11(11),
    READ_PROFILE_TRANSFER_TIME(12),
    PROFILE_TRANSFER(13),
    READ_ACCOUNT_INFO_PACKET_SIZE(14),
    READ_ACCOUNT_INFO(15),
    UPDATE_PLAYER_AND_LOAD_REGIONS(16),
    UNMAPPED_17(17),
    UNMAPPED_18(18),
    UNMAPPED_19(19),
    UNMAPPED_20(20),
    REFRESHING_TOKEN(21);

    private static final Map<Integer, LoginState> stateValueMap =
            Arrays.stream(LoginState.values())
                    .collect(Collectors.toMap(gs -> gs.state, Function.identity()));

    /**
     * The raw state value.
     */
    private final int state;

    LoginState(int state)
    {
        this.state = state;
    }

    /**
     * Utility method that maps the rank value to its respective
     * {@link LoginState} value.
     *
     * @param state the raw state value
     * @return the login state
     */
    public static LoginState of(int state)
    {
        return stateValueMap.getOrDefault(state, UNKNOWN);
    }

}
