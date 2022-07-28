import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("py")
public class class433 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpy;")
	public static final class433 field4671 = new class433(1, 0, Integer.class, new class430());

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpy;")
	public static final class433 field4668 = new class433(0, 1, Long.class, new class432());

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpy;")
	public static final class433 field4676 = new class433(2, 2, String.class, new class434());

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1927704071)
	public final int field4670;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 11417249)
	public final int field4672;

	@ObfuscatedName("w")
	public final Class field4669;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lpc;")
	public final class429 field4673;

	@ObfuscatedSignature(descriptor = "(IILjava/lang/Class;Lpc;)V")
	class433(int var1, int var2, Class var3, class429 var4) {
		this.field4670 = var1;
		this.field4672 = var2;
		this.field4669 = var3;
		this.field4673 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4672;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;I)Ljava/lang/Object;", garbageValue = "1124119473")
	public Object method7602(Buffer var1) {
		return this.field4673.vmethod7608(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljn;Lqx;B)Lji;", garbageValue = "0")
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}
		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)[Lpy;", garbageValue = "-857670044")
	public static class433[] method7604() {
		return new class433[]{ field4671, field4668, field4676 };
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "([BIIII[Lgr;I)V", garbageValue = "2131155181")
	static final void method7605(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}
		Buffer var10 = new Buffer(var0);
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					class174.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Class;I)Lpy;", garbageValue = "422252256")
	public static class433 method7590(Class var0) {
		class433[] var1 = method7604();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			class433 var3 = var1[var2];
			if (var3.field4669 == var0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1268097351")
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class9.method80();
		Decimator.scene.clear();
		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}
		System.gc();
		class273.musicPlayerStatus = 1;
		class149.musicTrackArchive = null;
		class273.musicTrackGroupId = -1;
		UserComparator6.musicTrackFileId = -1;
		class273.musicTrackVolume = 0;
		class347.musicTrackBoolean = false;
		FaceNormal.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.playingJingle = false;
		ItemComposition.method3703();
		class82.updateGameState(10);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(descriptor = "(IB)Lpp;", garbageValue = "127")
	static class437 method7606(int var0) {
		class437 var1 = ((class437) (Client.DBTableIndex_cache.get(((long) (var0)))));
		if (var1 == null) {
			var1 = new class437(BuddyRankComparator.field1380, SecureRandomCallable.method2126(var0), class13.method174(var0));
			Client.DBTableIndex_cache.put(var1, ((long) (var0)));
		}
		return var1;
	}
}