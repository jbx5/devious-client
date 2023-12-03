import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1310653337
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1994817079
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -672114413
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 433200453
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1228637641
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 33622073
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -942189481
	)
	int field2452;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1040610857
	)
	int field2460;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1034393799
	)
	int field2457;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 367055233
	)
	int field2459;

	WorldMapSection2() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "16"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2452) {
			var1.regionLowX = this.field2452;
		}

		if (var1.regionHighX < this.field2457) {
			var1.regionHighX = this.field2457;
		}

		if (var1.regionLowY > this.field2460) {
			var1.regionLowY = this.field2460;
		}

		if (var1.regionHighY < this.field2459) {
			var1.regionHighY = this.field2459;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "542110974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2452 && var1 >> 6 <= this.field2457 && var2 >> 6 >= this.field2460 && var2 >> 6 <= this.field2459;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "12300"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2452 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2460 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lmh;",
		garbageValue = "-1535299153"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2452 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2460 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-10"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2452 = var1.readUnsignedShort();
		this.field2460 = var1.readUnsignedShort();
		this.field2457 = var1.readUnsignedShort();
		this.field2459 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-471572167"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-726042655"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1992791084"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field725.method4281();
			}

			if (Client.gameState == 0) {
				SpriteMask.client.method515();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class19.updateLoginState(0);
				Client.field522 = 0;
				Client.field614 = 0;
				Client.timer.method7931(var0);
				if (var0 != 20) {
					VerticalAlignment.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class4.field4 != null) {
				class4.field4.close();
				class4.field4 = null;
			}

			if (Client.gameState == 25) {
				Client.field559 = 0;
				Client.field555 = 0;
				Client.field678 = 1;
				Client.field521 = 0;
				Client.field558 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class6.method44(WorldMapDecorationType.archive10, GrandExchangeOfferOwnWorldComparator.archive8, false, var1);
				} else if (var0 == 11) {
					class6.method44(WorldMapDecorationType.archive10, GrandExchangeOfferOwnWorldComparator.archive8, false, 4);
				} else if (var0 == 50) {
					class139.setLoginResponseString("", "Updating date of birth...", "");
					class6.method44(WorldMapDecorationType.archive10, GrandExchangeOfferOwnWorldComparator.archive8, false, 7);
				} else {
					class14.method189();
				}
			} else {
				var1 = class4.method21() ? 0 : 12;
				class6.method44(WorldMapDecorationType.archive10, GrandExchangeOfferOwnWorldComparator.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
