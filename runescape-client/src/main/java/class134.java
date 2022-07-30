import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("eb")
public class class134 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 730256935)
	int field1581;

	@ObfuscatedName("q")
	byte field1586;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1773818537)
	int field1582;

	@ObfuscatedName("u")
	String field1584;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1581 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1897546377")
	void vmethod3146(Buffer var1) {
		this.field1581 = var1.readUnsignedShort();
		this.field1586 = var1.readByte();
		this.field1582 = var1.readUnsignedShort();
		var1.readLong();
		this.field1584 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-406744366")
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1581)));
		var2.rank = this.field1586;
		var2.world = this.field1582;
		var2.username = new Username(this.field1584);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqy;I)V", garbageValue = "487596361")
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class28.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = ((byte) (var3 >> 28));
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class300.baseX * 8;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - Message.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		FriendSystem.Client_plane = var2.plane = var4;
		if (Players.field1295[var1] != null) {
			var2.read(Players.field1295[var1]);
		}
		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1293[var1] = 0;
		Players.Players_emptyIdxCount = 0;
		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1293[var7] = 0;
			}
		}
		var0.exportIndex();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqq;")
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = ((RunException) (var0));
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}
		return var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1422099031")
	public static boolean method2939(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field138[var0] : false;
	}
}