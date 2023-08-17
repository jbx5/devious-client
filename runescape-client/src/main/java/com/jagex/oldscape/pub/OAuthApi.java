package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   boolean isOnLoginScreen();

   void setClient(int var1);

   long getAccountHash();

   void setOtlTokenRequester(OtlTokenRequester var1);
}
