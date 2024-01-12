import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1418849961
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -200326855
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1095674875
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 6086387616366978933L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -740836945
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Lsu;",
		garbageValue = "44"
	)
	static class469[] method5234() {
		return new class469[]{class469.field4829, class469.field4830, class469.field4831, class469.field4828};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lco;",
		garbageValue = "-1339823329"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}
}
