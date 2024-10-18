import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1255984963
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 105958947
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-755905144"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Llp;",
		garbageValue = "3125"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116199203"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1767515"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-607271768"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = AsyncRestClient.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "73"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1112315754"
	)
	static int method6363(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Lvm;II)V",
		garbageValue = "850854382"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2) {
		int var3 = var1.readUnsignedByte();
		if (var3 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;
			WorldEntityCoord var4 = new WorldEntityCoord();

			int var5;
			int var6;
			int var8;
			int var12;
			int var13;
			for (var5 = 0; var5 < var3; ++var5) {
				var6 = var0.worldEntityIndices[var5];
				WorldEntity var14 = var0.worldEntities[var6];
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					Client.worldViewManager.method2700(var14.worldView);
					var0.worldEntities[var6] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var6;
					byte var9;
					int var16;
					if (var2 < 3) {
						var14.field5031 = var2 == 1 ? 1 : var1.readByte();
						var9 = var1.readByte();
						byte var18 = var1.readByte();
						var16 = var1.readUnsignedShort();
						SoundSystem.method862((byte)var1.readUnsignedByte());
						var4.method5790(var9, var18);
						var4.setCurrentRotationAngle(var16);
						if (var4.getX() != 0 || var4.getY() != 0) {
							var14.method9151(var4);
						}
					} else if (var2 == 3 && var8 != 1) {
						var4.method5771(var14.method9149());
						var9 = var1.readByte();
						if (var9 != 0) {
							int var15 = class496.method9322(var1, var9, 0);
							var16 = class496.method9322(var1, var9, 2);
							var12 = class496.method9322(var1, var9, 4);
							var13 = class496.method9322(var1, var9, 6);
							var4.method5782(var15, var16, var12, var13);
						}

						if (var8 == 2) {
							var14.method9151(var4);
						} else {
							var14.method9152(var4);
						}
					}
				}
			}

			while (var1.method10028(Client.packetWriter.serverPacketLength) >= 10) {
				var5 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var5;
				var6 = var1.readUnsignedByte();
				int var7 = var1.readUnsignedByte();
				var8 = var6 * 8;
				int var17 = var7 * 8;
				WorldView var10 = Client.worldViewManager.method2684(var5, var8, var17, TaskHandler.clientPreferences.getDrawDistance(), class232.field2471);
				WorldEntity var11 = new WorldEntity(var5, var10);
				var0.worldEntities[var5] = var11;
				if (var2 < 3) {
					var12 = var1.readUnsignedByte();
					var13 = var1.readUnsignedByte();
					var11.worldEntityCoord.method5790(var12, var13);
					var11.worldEntityCoord.setCurrentRotationAngle(var1.readUnsignedShort());
					var1.readUnsignedShort();
				} else if (var2 == 3) {
					var11.field5031 = var1.readByte();
					ViewportMouse.method5487(var1, var11.worldEntityCoord, 0, 0);
					var11.method9151(var11.worldEntityCoord);
				}
			}

		}
	}
}
