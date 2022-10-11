import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public abstract class class145 extends Node {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;

	class145() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	abstract void vmethod3300(Buffer var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	abstract void vmethod3302(ClanChannel var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-244488333"
	)
	public static int method3226(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 49
		int var1 = (int)(var2 >>> 0 & 127L); // L: 51
		return var1; // L: 53
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2139456201"
	)
	static final void method3227(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 176
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		class65.addGameMessage(30, "", var1); // L: 178
	} // L: 180
}
