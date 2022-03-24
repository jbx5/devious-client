import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public enum class83 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1081(0, -1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1074(1, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1075(2, 3),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1076(3, 4),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1077(4, 5),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lcp;")

	field1078(5, 6);

	@ObfuscatedName("rl")
	@ObfuscatedSignature(descriptor = 
	"Ley;")

	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = 
	"Lpa;")

	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1515440803)

	final int field1079;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	79198917)

	final int field1073;

	class83(int var3, int var4) {
		this.field1079 = var3;
		this.field1073 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1073;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;II)V", garbageValue = 
	"-2074244777")

	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		UserComparator8.method2575(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 64) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			HealthBarUpdate.method2213(var0, var4, var5, var6);
		}

		if ((var0.offset - var2) != var1) {
			throw new RuntimeException(((var0.offset - var2) + " ") + var1);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lqv;", garbageValue = 
	"-122")

	public static PrivateChatMode method2124(int var0) {
		PrivateChatMode[] var1 = Canvas.method389();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field4737) {
				return var3;
			}
		}

		return null;
	}}