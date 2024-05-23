import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
final class class108 implements class347 {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	class108(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "652965052"
	)
	public void vmethod6534() {
		if (this.val$cc != null && this.val$cc.method6945().field3749 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2327(this.val$cc);
			var1.setArgs(this.val$cc.method6945().field3749);
			class47.method887().addFirst(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Log;",
		garbageValue = "451650860"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4428, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4423, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.field4430, PlayerType.field4424, PlayerType.field4425, PlayerType.field4422, PlayerType.field4414, PlayerType.field4427, PlayerType.PlayerType_normal, PlayerType.field4418, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_playerModerator, PlayerType.field4412, PlayerType.field4419};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lie;",
		garbageValue = "598529502"
	)
	static VerticalAlignment[] method2768() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2169, VerticalAlignment.field2171};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lor;IIS)Z",
		garbageValue = "-22821"
	)
	public static boolean method2769(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class185.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
