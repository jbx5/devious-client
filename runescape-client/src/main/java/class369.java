import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public enum class369 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4058(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4061(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4056(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4059(3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4060(4);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -447414025
	)
	final int field4057;

	class369(int var3) {
		this.field4057 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4057;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		ScriptFrame.method1223();
		if (PendingSpawn.friendsChat != null) {
			PendingSpawn.friendsChat.invalidateIgnoreds();
		}

	}
}
