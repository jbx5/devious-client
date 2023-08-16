import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1676;
	@ObfuscatedName("au")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1687463019
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-485826730"
	)
	static final int method3121(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	static int method3119(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-973066355"
	)
	static final void method3122(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.x - ((Actor)var1).x;
				var4 = var0.y - ((Actor)var1).y;
				if (var3 != 0 || var4 != 0) {
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047;
					var0.orientation = var6;
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1271 > 0) {
			var7 = -1;
			if (var0.field1235 != -1 && var0.field1236 != -1) {
				var2 = var0.field1235 * 128 - UrlRequester.baseX * 8192 + 64;
				var3 = var0.field1236 * 128 - class47.baseY * 8192 + 64;
				var4 = var0.x - var2;
				int var8 = var0.y - var3;
				if (var4 != 0 || var8 != 0) {
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047;
					var7 = var6;
				}
			} else if (var0.field1234 != -1) {
				var7 = var0.field1234;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field1237) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2393();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var10 = true;
			boolean var11 = true;
			++var0.field1239;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var0.field1266 * var4;
			boolean var12 = true;
			if (var7 < var0.field1266 || var7 > 2048 - var0.field1266) {
				var0.rotation = var0.orientation;
				var12 = false;
			}

			if (var0.field1266 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1239 > 25 || var12)) {
				if (var4 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var4 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1239 = 0;
		}

	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)V",
		garbageValue = "70"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) {
			var1 = var0.buttonText;
			var2 = var0.id;
			var3 = var0.itemId;
			UserComparator8.insertMenuItem(var1, "", 24, 0, 0, var2, var3, false);
		}

		int var4;
		String var9;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class300.Widget_getSpellActionName(var0);
			if (var1 != null) {
				var9 = class217.colorStartTag(65280) + var0.field3758;
				var3 = var0.id;
				var4 = var0.itemId;
				UserComparator8.insertMenuItem(var1, var9, 25, 0, -1, var3, var4, false);
			}
		}

		if (var0.buttonType == 3) {
			class385.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var5;
			int var6;
			int var7;
			String var11;
			String var12;
			if (Client.isSpellSelected) {
				var2 = NpcOverrides.getWidgetFlags(var0);
				boolean var10 = (var2 >> 21 & 1) != 0;
				if (var10 && (Canvas.selectedSpellFlags & 32) == 32) {
					var11 = Client.selectedSpellActionName;
					var12 = Client.selectedSpellName + " " + "->" + " " + var0.dataText;
					var5 = var0.childIndex;
					var6 = var0.id;
					var7 = var0.itemId;
					UserComparator8.insertMenuItem(var11, var12, 58, 0, var5, var6, var7, false);
				}
			} else {
				for (int var16 = 9; var16 >= 5; --var16) {
					var4 = NpcOverrides.getWidgetFlags(var0);
					boolean var14 = (var4 >> var16 + 1 & 1) != 0;
					if (!var14 && var0.onOp == null) {
						var9 = null;
					} else if (var0.actions != null && var0.actions.length > var16 && var0.actions[var16] != null && var0.actions[var16].trim().length() != 0) {
						var9 = var0.actions[var16];
					} else {
						var9 = null;
					}

					if (var9 != null) {
						var12 = var0.dataText;
						var5 = var16 + 1;
						var6 = var0.childIndex;
						var7 = var0.id;
						int var8 = var0.itemId;
						UserComparator8.insertMenuItem(var9, var12, 1007, var5, var6, var7, var8, false);
					}
				}

				var1 = class300.Widget_getSpellActionName(var0);
				if (var1 != null) {
					var9 = var0.dataText;
					var3 = var0.childIndex;
					var4 = var0.id;
					var5 = var0.itemId;
					UserComparator8.insertMenuItem(var1, var9, 25, 0, var3, var4, var5, false);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					var5 = NpcOverrides.getWidgetFlags(var0);
					boolean var15 = (var5 >> var2 + 1 & 1) != 0;
					if (!var15 && var0.onOp == null) {
						var11 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var11 = var0.actions[var2];
					} else {
						var11 = null;
					}

					if (var11 != null) {
						UserComparator8.insertMenuItem(var11, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				var3 = NpcOverrides.getWidgetFlags(var0);
				boolean var13 = (var3 & 1) != 0;
				if (var13) {
					class385.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
