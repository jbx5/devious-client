import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class class53 extends Node {
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field370;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	class47 field371;

	public class53() {
		this.field371 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcn;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field371 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	public class53(RawSound var1) {
		this.field371 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	public boolean method1073() {
		return this.field371 == null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "1543798831"
	)
	public RawSound method1074() {
		if (this.field371 != null && this.field371.field330.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1076();
			} finally {
				this.field371.field330.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "-1853053497"
	)
	public RawSound method1072() {
		if (this.field371 != null) {
			this.field371.field330.lock();

			RawSound var1;
			try {
				var1 = this.method1076();
			} finally {
				this.field371.field330.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "0"
	)
	RawSound method1076() {
		if (this.field371.field335 == null) {
			this.field371.field335 = this.field371.field329.toRawSound((int[])null);
			this.field371.field329 = null;
		}

		return this.field371.field335;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lvc;",
		garbageValue = "1538715004"
	)
	static SpritePixels method1092(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lob;",
		garbageValue = "837196491"
	)
	public static GameBuild method1093(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1181668791"
	)
	public static void method1090() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "46472907"
	)
	static final void method1091(class101 var0) {
		int[] var1 = var0.field1336.field1416;

		int var2;
		for (var2 = 0; var2 < var0.field1336.field1415; ++var2) {
			Player var5 = var0.field1341[var1[var2]];
			if (var5 != null && var5.field1218 > 0) {
				--var5.field1218;
				if (var5.field1218 == 0) {
					var5.field1224 = null;
				}
			}
		}

		for (var2 = 0; var2 < var0.field1344; ++var2) {
			int var3 = var0.field1345[var2];
			class103 var4 = var0.field1343[var3];
			if (var4 != null && var4.field1218 > 0) {
				--var4.field1218;
				if (var4.field1218 == 0) {
					var4.field1224 = null;
				}
			}
		}

	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1767491834"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class108.friendsChat != null) {
			PacketBufferNode var1 = WorldMapElement.getPacketBufferNode(ClientPacket.field3323, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
