import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	AbstractArchive field314;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	NodeHashTable field320;

	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field320 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field314 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lbr;",
		garbageValue = "-4"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method861(var1, var2, false);
		class53 var6 = (class53)this.field320.get(var4);
		if (var6 != null) {
			return var6.method1072();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field320.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lck;",
		garbageValue = "239750119"
	)
	class53 method869(int var1, int var2) {
		long var3 = this.method861(var1, var2, true);
		class53 var5 = (class53)this.field320.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field314, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field320.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbr;",
		garbageValue = "-1"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lck;",
		garbageValue = "-111"
	)
	public class53 method862(int var1) {
		if (this.field314.getGroupCount() == 1) {
			return this.method869(0, var1);
		} else if (this.field314.getGroupFileCount(var1) == 1) {
			return this.method869(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lbr;",
		garbageValue = "1847227345"
	)
	public RawSound method875(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-1775885008"
	)
	long method861(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)Ljava/lang/String;",
		garbageValue = "1521150302"
	)
	static String method864(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class360.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class352.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILin;II)V",
		garbageValue = "-2105544594"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 16384;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field859 = var3.int7 * 16384;
		var5.field858 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field867 = var3.int5;
		var5.field868 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field870 = var5.field867 + (int)(Math.random() * (double)(var5.field868 - var5.field867));
		}

	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1891348793"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = WorldMapElement.getPacketBufferNode(ClientPacket.field3324, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntIME(var0);
		var2.packetBuffer.writeShortAdd(var1);
		Client.packetWriter.addNode(var2);
	}
}
