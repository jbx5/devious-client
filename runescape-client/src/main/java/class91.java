import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public enum class91 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1115(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1116(1, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1120(2, 7),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1118(3, 8),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1119(4, 9);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1164261959
	)
	final int field1122;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1128902541
	)
	final int field1121;

	class91(int var3, int var4) {
		this.field1122 = var3;
		this.field1121 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1121;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "663948989"
	)
	public static String method2346(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = UrlRequest.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("al")
	static final void method2337(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "13528"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "920618569"
	)
	static final void method2339(int var0, int var1, int var2) {
		if (PlayerComposition.cameraX < var0) {
			PlayerComposition.cameraX = (var0 - PlayerComposition.cameraX) * Huffman.field3967 / 1000 + PlayerComposition.cameraX + UserComparator7.field1505;
			if (PlayerComposition.cameraX > var0) {
				PlayerComposition.cameraX = var0;
			}
		}

		if (PlayerComposition.cameraX > var0) {
			PlayerComposition.cameraX -= (PlayerComposition.cameraX - var0) * Huffman.field3967 / 1000 + UserComparator7.field1505;
			if (PlayerComposition.cameraX < var0) {
				PlayerComposition.cameraX = var0;
			}
		}

		if (class171.cameraY < var1) {
			class171.cameraY = (var1 - class171.cameraY) * Huffman.field3967 / 1000 + class171.cameraY + UserComparator7.field1505;
			if (class171.cameraY > var1) {
				class171.cameraY = var1;
			}
		}

		if (class171.cameraY > var1) {
			class171.cameraY -= (class171.cameraY - var1) * Huffman.field3967 / 1000 + UserComparator7.field1505;
			if (class171.cameraY < var1) {
				class171.cameraY = var1;
			}
		}

		if (UserComparator4.cameraZ < var2) {
			UserComparator4.cameraZ = (var2 - UserComparator4.cameraZ) * Huffman.field3967 / 1000 + UserComparator4.cameraZ + UserComparator7.field1505;
			if (UserComparator4.cameraZ > var2) {
				UserComparator4.cameraZ = var2;
			}
		}

		if (UserComparator4.cameraZ > var2) {
			UserComparator4.cameraZ -= (UserComparator4.cameraZ - var2) * Huffman.field3967 / 1000 + UserComparator7.field1505;
			if (UserComparator4.cameraZ < var2) {
				UserComparator4.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lnb;III)V",
		garbageValue = "678948371"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = class13.method167(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = class13.method167(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					Tile.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var6 = Client.menuOptionsCount - 1;
					if (var6 != -1) {
						ApproximateRouteStrategy.method1201(var6);
					}

					return;
				}
			}

		}
	}
}
