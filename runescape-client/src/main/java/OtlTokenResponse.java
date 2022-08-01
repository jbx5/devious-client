import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
@Implements("OtlTokenResponse")
@ObfuscatedName("com/jagex/oldscape/pub/RefreshAccessTokenResponse")
public interface OtlTokenResponse {
	boolean isSuccess();

	String getAccessToken();

	String getRefreshToken();
}