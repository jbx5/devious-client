import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public abstract class class166 extends Node {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	class166() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	abstract void vmethod3761(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	abstract void vmethod3762(ClanChannel var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Lui;I)Lui;",
		garbageValue = "2074110219"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class7.method47(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "985406620"
	)
	static void method3692(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, VarcInt.getTileHeight(class162.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, VarcInt.getTileHeight(class162.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		class162.worldView.projectiles.addFirst(var14);
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lva;B)V",
		garbageValue = "48"
	)
	static void method3682(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
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
						Client.field591[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field591[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		GraphicsObject.field914 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				GraphicsObject.field914[var8][var9] = var1.readInt();
			}
		}

		class142.field1664 = new int[var7];
		class111.field1427 = new int[var7];
		class462.field4932 = new int[var7];
		HttpRequest.field47 = new byte[var7][];
		UserComparator8.field1516 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field591[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (class142.field1664[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							class142.field1664[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							class111.field1427[var7] = Bounds.archive9.getGroupId("m" + var15 + "_" + var16);
							class462.field4932[var7] = Bounds.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		class464.updateGameState(25);
		Client.field612 = true;
		class382.field4458 = var4;
		VarbitComposition.method4074(var4);
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-2021507668"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (HttpRequestTask.loginState != var0) {
			HttpRequestTask.loginState = var0;
		}
	}
}
