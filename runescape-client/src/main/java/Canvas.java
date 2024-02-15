import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("aq")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "67"
	)
	static int method297() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1372269351"
	)
	static int method296(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class228.method4468(var0, var1, var2);
		} else if (var0 < 1100) {
			return class357.method6983(var0, var1, var2);
		} else if (var0 < 1200) {
			return class103.method2749(var0, var1, var2);
		} else if (var0 < 1300) {
			return class193.method3783(var0, var1, var2);
		} else if (var0 < 1400) {
			return class175.method3549(var0, var1, var2);
		} else if (var0 < 1500) {
			return SecureRandomSSLSocket.method145(var0, var1, var2);
		} else if (var0 < 1600) {
			return class155.method3310(var0, var1, var2);
		} else if (var0 < 1700) {
			return VarbitComposition.method3832(var0, var1, var2);
		} else if (var0 < 1800) {
			return class136.method3143(var0, var1, var2);
		} else if (var0 < 1900) {
			return HttpMethod.method83(var0, var1, var2);
		} else if (var0 < 2000) {
			return UserComparator4.method2936(var0, var1, var2);
		} else if (var0 < 2100) {
			return class357.method6983(var0, var1, var2);
		} else if (var0 < 2200) {
			return class103.method2749(var0, var1, var2);
		} else if (var0 < 2300) {
			return class193.method3783(var0, var1, var2);
		} else if (var0 < 2400) {
			return class175.method3549(var0, var1, var2);
		} else if (var0 < 2500) {
			return SecureRandomSSLSocket.method145(var0, var1, var2);
		} else if (var0 < 2600) {
			return Occluder.method5636(var0, var1, var2);
		} else if (var0 < 2700) {
			return ArchiveDiskAction.method7035(var0, var1, var2);
		} else if (var0 < 2800) {
			return class11.method106(var0, var1, var2);
		} else if (var0 < 2900) {
			return HttpMethod.method82(var0, var1, var2);
		} else if (var0 < 3000) {
			return UserComparator4.method2936(var0, var1, var2);
		} else if (var0 < 3200) {
			return Archive.method7100(var0, var1, var2);
		} else if (var0 < 3300) {
			return FloorUnderlayDefinition.method3816(var0, var1, var2);
		} else if (var0 < 3400) {
			return Player.method2437(var0, var1, var2);
		} else if (var0 < 3500) {
			return class257.method5057(var0, var1, var2);
		} else if (var0 < 3600) {
			return class366.method7007(var0, var1, var2);
		} else if (var0 < 3700) {
			return class209.method4124(var0, var1, var2);
		} else if (var0 < 3800) {
			return CollisionMap.method4470(var0, var1, var2);
		} else if (var0 < 3900) {
			return class371.method7019(var0, var1, var2);
		} else if (var0 < 4000) {
			return HttpRequestTask.method255(var0, var1, var2);
		} else if (var0 < 4100) {
			return WorldMapSprite.method5040(var0, var1, var2);
		} else if (var0 < 4200) {
			return class161.method3440(var0, var1, var2);
		} else if (var0 < 4300) {
			return class218.method4259(var0, var1, var2);
		} else if (var0 < 5100) {
			return StructComposition.method3875(var0, var1, var2);
		} else if (var0 < 5400) {
			return TextureProvider.method5671(var0, var1, var2);
		} else if (var0 < 5600) {
			return LoginState.method1207(var0, var1, var2);
		} else if (var0 < 5700) {
			return HttpRequest.method98(var0, var1, var2);
		} else if (var0 < 6300) {
			return class93.method2439(var0, var1, var2);
		} else if (var0 < 6600) {
			return class182.method3658(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapData_0.method4613(var0, var1, var2);
		} else if (var0 < 6800) {
			return Login.method2199(var0, var1, var2);
		} else if (var0 < 6900) {
			return AABB.method5619(var0, var1, var2);
		} else if (var0 < 7000) {
			return BuddyRankComparator.method2976(var0, var1, var2);
		} else if (var0 < 7100) {
			return WorldMapID.method5043(var0, var1, var2);
		} else if (var0 < 7200) {
			return class4.method19(var0, var1, var2);
		} else if (var0 < 7300) {
			return FloorOverlayDefinition.method4052(var0, var1, var2);
		} else if (var0 < 7500) {
			return class11.method100(var0, var1, var2);
		} else if (var0 < 7600) {
			return PcmPlayer.method790(var0, var1, var2);
		} else if (var0 < 7700) {
			return Client.method1531(var0, var1, var2);
		} else {
			return var0 < 8100 ? CollisionMap.method4501(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1833781181"
	)
	static final int method295(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "15632"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class485.logOut();
		switch(var0) {
		case 1:
			JagexCache.method4224(24);
			SecureUrlRequester.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class75.SpriteBuffer_reset();
		}

	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "595411787"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ArchiveLoader.widgetDefinition.loadInterface(var0)) {
			class128.runComponentCloseListeners(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
