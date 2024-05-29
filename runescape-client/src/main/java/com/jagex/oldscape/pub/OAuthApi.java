package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	boolean isOnLoginScreen();

	long getAccountHash();

	void setClient(int var1);

	void setOtlTokenRequester(OtlTokenRequester var1);

	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
