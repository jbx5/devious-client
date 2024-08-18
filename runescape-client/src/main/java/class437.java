import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class437 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	class433 field4774;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1529317931
	)
	int field4771;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 417503383
	)
	int field4773;

	@ObfuscatedSignature(
		descriptor = "(Lqd;II)V"
	)
	class437(class433 var1, int var2, int var3) {
		this.field4771 = 0;
		this.field4773 = 0;
		this.field4774 = var1;
		this.field4771 = var2;
		this.field4773 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "55209386"
	)
	public String method8267() {
		if (this.method8289()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8270());

			for (int var2 = this.field4771; var2 < this.field4773; ++var2) {
				class435 var3 = this.field4774.method8017(var2);
				var1.append(var3.field4747);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method8286(int var1) {
		return this.field4774.method8048() == 2 || this.field4774.method8048() == 1 && (!this.field4774.field4736 || this.field4773 - 1 != var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1972616570"
	)
	public boolean method8289() {
		return this.field4773 == this.field4771;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1694055949"
	)
	public int method8270() {
		return this.field4773 - this.field4771;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)Z",
		garbageValue = "-953554313"
	)
	boolean method8271(class435 var1) {
		if (this.field4774.field4739 == 2) {
			return true;
		} else if (this.field4774.field4739 == 0) {
			return false;
		} else {
			return this.field4774.method8018() != var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "58"
	)
	int method8285() {
		if (this.method8289()) {
			return 0;
		} else {
			class435 var1 = this.field4774.method8017(this.field4773 - 1);
			if (var1.field4747 == '\n') {
				return 0;
			} else if (this.method8271(var1)) {
				return this.field4774.field4727.advances[42];
			} else {
				int var2 = this.field4774.field4727.advances[var1.field4747];
				if (var2 == 0) {
					return var1.field4747 == '\t' ? this.field4774.field4727.advances[32] * 3 : this.field4774.field4727.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ltj;",
		garbageValue = "1721133701"
	)
	public class518 method8269() {
		if (this.method8289()) {
			return new class518(0, 0);
		} else {
			class435 var1 = this.field4774.method8017(this.field4773 - 1);
			return new class518(var1.field4744 + this.method8285(), var1.field4746);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqu;",
		garbageValue = "-63"
	)
	public class435 method8274(int var1) {
		return var1 >= 0 && var1 < this.method8270() ? this.field4774.method8017(this.field4771 + var1) : null;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Lvs;I)V",
		garbageValue = "-955274284"
	)
	static void method8268(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
		var4.playerUpdateManager.updatePlayer(var1, false);
		int var5 = var4.sizeX / 8;
		int var6 = var4.sizeY / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field767[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field767[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class137.field1615 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				class137.field1615[var8][var9] = var1.readInt();
			}
		}

		AbstractByteArrayCopier.field3968 = new int[var7];
		Huffman.field3961 = new int[var7];
		WorldMapLabelSize.field3032 = new int[var7];
		AsyncRestClient.field53 = new byte[var7][];
		Script.field995 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field767[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (AbstractByteArrayCopier.field3968[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							AbstractByteArrayCopier.field3968[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							Huffman.field3961[var7] = ClientPreferences.archive9.getGroupId("m" + var15 + "_" + var16);
							WorldMapLabelSize.field3032[var7] = ClientPreferences.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		UserComparator3.updateGameState(25);
		Client.field513 = true;
		HttpMethod.field36 = var4;
		FontName.method9265(var4);
	}
}
