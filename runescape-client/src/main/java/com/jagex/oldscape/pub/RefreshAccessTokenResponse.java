package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("RefreshAccessTokenResponse")
public interface RefreshAccessTokenResponse {
	boolean isSuccess();

	String getAccessToken();

	String getRefreshToken();
}
