import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1840190059
	)
	static int field4575;
	@ObfuscatedName("ak")
	@Export("state")
	byte state;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -657879925
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2070091891
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2010946641
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 934961267
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 467418017
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lua;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "93560231"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "8000"
	)
	void method7412(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "525957991"
	)
	void method7417(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1568717561"
	)
	static final void method7426(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class485.field5007 || DelayFadeTask.field4786 != var1) {
			class485.field5007 = var0;
			DelayFadeTask.field4786 = var1;
			class105.updateGameState(25);
			Client.field527 = true;
			IgnoreList.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class358.scene.field1337;
			int var4 = class358.scene.field1333;
			class358.scene.field1337 = (var0 - 6) * 8;
			class358.scene.field1333 = (var1 - 6) * 8;
			int var5 = class358.scene.field1337 - var3;
			int var6 = class358.scene.field1333 - var4;
			var3 = class358.scene.field1337;
			var4 = class358.scene.field1333;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
				class103 var19 = class358.scene.field1343[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.field1229;
						var10000[var9] -= var5;
						var10000 = var19.field1276;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = class358.scene.field1341[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.field1229;
						var10000[var9] -= var5;
						var10000 = var22.field1276;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				class475 var23 = class358.scene.field1347[var7];
				if (var23 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var23.field4942;
						var10000[var9] -= var5;
						var10000 = var23.field4950;
						var10000[var9] -= var6;
					}

					var23.field4943 -= var5 * 128;
					var23.field4945 -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							class358.scene.field1349[var17][var13][var14] = class358.scene.field1349[var17][var15][var16];
						} else {
							class358.scene.field1349[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)class358.scene.field1342.last(); var18 != null; var18 = (PendingSpawn)class358.scene.field1342.previous()) {
				var18.field1192 -= var5;
				var18.field1196 -= var6;
				if (var18.field1192 < 0 || var18.field1196 < 0 || var18.field1192 >= 104 || var18.field1196 >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			PlayerComposition.cameraX -= var5 << 7;
			UserComparator4.cameraZ -= var6 << 7;
			class33.field178 -= var5 << 7;
			class76.field931 -= var6 << 7;
			Client.field771 = -1;
			class358.scene.field1352.clear();
			class358.scene.field1351.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				class358.scene.field1332[var14].clear();
			}

		}
	}
}
