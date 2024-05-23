import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1521454339
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -63926047
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1972188803
	)
	public int field4952;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 661479403
	)
	public int field4955;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -961502985
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.field4952 = 0;
		this.field4955 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field4955 = var3;
		this.spotAnimationFrame = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldc;",
		garbageValue = "828196070"
	)
	static class92[] method8787() {
		return new class92[]{class92.field1129, class92.field1125, class92.field1131, class92.field1127, class92.field1124, class92.field1128};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-48"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		KitDefinition.logOut();
		switch(var0) {
		case 1:
			class294.method5939();
			break;
		case 2:
			VerticalAlignment.method4030();
		}

	}
}
