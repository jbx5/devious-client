import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class67 {
	@ObfuscatedName("v")
	static final BigInteger field875;
	@ObfuscatedName("o")
	static final BigInteger field878;
	static 
	{
		field875 = new BigInteger("10001", 16);
		field878 = new BigInteger("a297f6692a7a1d8b2786f93cf85ef1d85f2a702a6f04b4503c079d0c3970d7a7bda84292dd1c8249b1cd8d0eb0fe10e16ad2d42a7fbbb321f4f5603afec3f13a03d534b8e2233ba479c346208306d2d816ef9f8f1ee69896d2cd1f3dfcb7d8e5987ed6e9412f962811bfbfb59b689ce506438d4f3c8dfb5c95c1670ad4d2e767", 16);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lgz;", garbageValue = 
	"-61")

	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = ((ItemComposition) (ItemComposition.ItemDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldMapID.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != (-1)) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != (-1)) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != (-1)) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if ((!HealthBar.ItemDefinition_inMembersWorld) && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class182.getParamDefinition(((int) (var4.key)));
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)[B", garbageValue = 
	"-945554584")

	public static byte[] method1878() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; (var1 < 24) && (var0[var1] == 0); ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)Z", garbageValue = 
	"0")

	static final boolean method1879(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label71 : while (
		true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label71;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = (var7 >> 6) & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if ((((var13 > 0) && (var14 > 0)) && (var13 < 103)) && (var14 < 103)) {
						ObjectComposition var15 = class116.getObjectDefinition(var5);
						if (((((var12 != 22) || (!Client.isLowDetail)) || (var15.int1 != 0)) || (var15.interactType == 1)) || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field543;
								var3 = false;
							}

							var8 = true;
						}
					}
				} 

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			} 
		} 
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IZIB)V", garbageValue = 
	"12")

	public static final void method1881(int var0, boolean var1, int var2) {
		if ((var0 >= 8000) && (var0 <= 48000)) {
			SecureRandomFuture.field949 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			class33.field237 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}