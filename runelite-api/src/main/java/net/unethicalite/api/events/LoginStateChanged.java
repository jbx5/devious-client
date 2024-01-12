package net.unethicalite.api.events;

import lombok.Value;
import net.runelite.api.LoginState;

@Value
public class LoginStateChanged
{
    LoginState state;
}
