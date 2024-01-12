import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class342 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	public class344 field3635;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	class339 field3630;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	class27 field3631;
	@ObfuscatedName("aj")
	public Object[] field3632;
	@ObfuscatedName("aq")
	public Object[] field3633;
	@ObfuscatedName("ar")
	public Object[] field3634;
	@ObfuscatedName("ag")
	public Object[] field3629;

	class342() {
		this.field3635 = new class344();
		this.field3630 = new class339();
		this.field3631 = new class27();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1290592831"
	)
	static final boolean method6370(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label68:
		while (true) {
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
						continue label68;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class137.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field555;
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
}
