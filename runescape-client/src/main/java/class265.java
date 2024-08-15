import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class265 implements class29 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	Widget field2905;
	@ObfuscatedName("ay")
	boolean field2906;
	@ObfuscatedName("an")
	boolean field2907;

	public class265() {
		this.field2905 = null;
		this.field2906 = false;
		this.field2907 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-80"
	)
	public boolean vmethod5350(int var1) {
		if (this.field2905 == null) {
			return false;
		} else {
			class27 var2 = this.field2905.method6973();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method368(var1)) {
					switch(var1) {
					case 81:
						this.field2907 = true;
						break;
					case 82:
						this.field2906 = true;
						break;
					default:
						if (this.method5324(var1)) {
							class416.invalidateWidget(this.field2905);
						}
					}
				}

				return var2.method366(var1);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1050737787"
	)
	public boolean vmethod5351(int var1) {
		switch(var1) {
		case 81:
			this.field2907 = false;
			return false;
		case 82:
			this.field2906 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-772262998"
	)
	public boolean vmethod5378(char var1) {
		if (this.field2905 == null) {
			return false;
		} else if (!GrandExchangeEvents.method7388(var1)) {
			return false;
		} else {
			class358 var2 = this.field2905.method6971();
			if (var2 != null && var2.method6843()) {
				class27 var3 = this.field2905.method6973();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method365(var1) && var2.method6724(var1)) {
						class416.invalidateWidget(this.field2905);
					}

					return var3.method399(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1863708161"
	)
	public boolean vmethod5354(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "-1103182824"
	)
	public void method5318(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2905) {
				this.method5345();
				this.field2905 = var1;
			}

			class356 var2 = var1.method6974();
			if (var2 != null) {
				if (!var2.field3730.method6691() && var2.field3734 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2421(var1);
					var3.setArgs(var2.field3734);
					WidgetDefinition.method6561().addFirst(var3);
				}

				var2.field3730.method6640(true);
			}
		} else {
			this.method5345();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "1108154514"
	)
	public Widget method5327() {
		return this.field2905;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1903193183"
	)
	public void method5345() {
		if (this.field2905 != null) {
			class356 var1 = this.field2905.method6974();
			Widget var2 = this.field2905;
			this.field2905 = null;
			if (var1 != null) {
				if (var1.field3730.method6691() && var1.field3734 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2421(var2);
					var3.setArgs(var1.field3734);
					WidgetDefinition.method6561().addFirst(var3);
				}

				var1.field3730.method6640(false);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1829704313"
	)
	boolean method5324(int var1) {
		if (this.field2905 == null) {
			return false;
		} else {
			class358 var2 = this.field2905.method6971();
			if (var2 != null && var2.method6843()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method5345();
					return true;
				case 48:
					if (this.field2906) {
						var2.method6663();
					}

					return true;
				case 65:
					if (this.field2906) {
						var5 = DynamicObject.client.method481();
						var2.method6682(var5);
					}

					return true;
				case 66:
					if (this.field2906) {
						var5 = DynamicObject.client.method481();
						var2.method6789(var5);
					}

					return true;
				case 67:
					if (this.field2906) {
						var5 = DynamicObject.client.method481();
						var2.method6683(var5);
					}

					return true;
				case 84:
					if (var2.method6702() == 0) {
						var2.method6724(10);
					} else if (this.field2907 && var2.method6706()) {
						var2.method6724(10);
					} else {
						class356 var3 = this.field2905.method6974();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2421(this.field2905);
						var4.setArgs(var3.field3736);
						WidgetDefinition.method6561().addFirst(var4);
						this.method5345();
					}

					return true;
				case 85:
					if (this.field2906) {
						var2.method6660();
					} else {
						var2.method6787();
					}

					return true;
				case 96:
					if (this.field2906) {
						var2.method6746(this.field2907);
					} else {
						var2.method6889(this.field2907);
					}

					return true;
				case 97:
					if (this.field2906) {
						var2.method6672(this.field2907);
					} else {
						var2.method6685(this.field2907);
					}

					return true;
				case 98:
					if (this.field2906) {
						var2.method6742();
					} else {
						var2.method6673(this.field2907);
					}

					return true;
				case 99:
					if (this.field2906) {
						var2.method6856();
					} else {
						var2.method6674(this.field2907);
					}

					return true;
				case 101:
					if (this.field2906) {
						var2.method6661();
					} else {
						var2.method6659();
					}

					return true;
				case 102:
					if (this.field2906) {
						var2.method6675(this.field2907);
					} else {
						var2.method6665(this.field2907);
					}

					return true;
				case 103:
					if (this.field2906) {
						var2.method6668(this.field2907);
					} else {
						var2.method6666(this.field2907);
					}

					return true;
				case 104:
					if (this.field2906) {
						var2.method6644(this.field2907);
					} else {
						var2.method6823(this.field2907);
					}

					return true;
				case 105:
					if (this.field2906) {
						var2.method6726(this.field2907);
					} else {
						var2.method6676(this.field2907);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("an")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class418.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lnq;IIIB)V",
		garbageValue = "127"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		ClanChannelMember.method3363();
		SpriteMask var4 = var0.method6948(FloorUnderlayDefinition.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + class354.entity.getX() / 32;
				int var7 = 464 - class354.entity.getY() / 32;
				class91.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class354.entity.getX() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class354.entity.getY() / 32;
					UrlRequest.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = ConcurrentMidiTask.topLevelWorldView.groundItems[ConcurrentMidiTask.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class354.entity.getX() / 32;
							var12 = var16 * 4 + 2 - class354.entity.getY() / 32;
							UrlRequest.drawSpriteOnMinimap(var1, var2, var11, var12, class269.field2960[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < ConcurrentMidiTask.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = ConcurrentMidiTask.topLevelWorldView.npcs[ConcurrentMidiTask.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class354.entity.getX() / 32;
							var12 = var9.y / 32 - class354.entity.getY() / 32;
							UrlRequest.drawSpriteOnMinimap(var1, var2, var11, var12, class269.field2960[1], var4);
						}
					}
				}

				var8 = ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerCount;
				int[] var17 = ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = ConcurrentMidiTask.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class253.localPlayer) {
						var12 = var15.x / 32 - class354.entity.getX() / 32;
						int var13 = var15.y / 32 - class354.entity.getY() / 32;
						if (var15.isFriend()) {
							UrlRequest.drawSpriteOnMinimap(var1, var2, var12, var13, class269.field2960[3], var4);
						} else if (class253.localPlayer.team != 0 && var15.team != 0 && var15.team == class253.localPlayer.team) {
							UrlRequest.drawSpriteOnMinimap(var1, var2, var12, var13, class269.field2960[4], var4);
						} else if (var15.isFriendsChatMember()) {
							UrlRequest.drawSpriteOnMinimap(var1, var2, var12, var13, class269.field2960[5], var4);
						} else if (var15.isClanMember()) {
							UrlRequest.drawSpriteOnMinimap(var1, var2, var12, var13, class269.field2960[6], var4);
						} else {
							UrlRequest.drawSpriteOnMinimap(var1, var2, var12, var13, class269.field2960[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < ConcurrentMidiTask.topLevelWorldView.npcs.length) {
						NPC var19 = ConcurrentMidiTask.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class354.entity.getX() / 32;
							var12 = var19.y / 32 - class354.entity.getY() / 32;
							InterfaceParent.worldToMinimap(var1, var2, var11, var12, TileItem.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - ConcurrentMidiTask.topLevelWorldView.baseX * 4 + 2 - class354.entity.getX() / 32;
						var11 = Client.hintArrowY * 4 - ConcurrentMidiTask.topLevelWorldView.baseY * 4 + 2 - class354.entity.getY() / 32;
						InterfaceParent.worldToMinimap(var1, var2, var10, var11, TileItem.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < ConcurrentMidiTask.topLevelWorldView.players.length) {
						Player var20 = ConcurrentMidiTask.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class354.entity.getX() / 32;
							var12 = var20.y / 32 - class354.entity.getY() / 32;
							InterfaceParent.worldToMinimap(var1, var2, var11, var12, TileItem.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class354.entity.getX() / 32;
					var11 = Client.destinationY * 4 + 2 - class354.entity.getY() / 32;
					UrlRequest.drawSpriteOnMinimap(var1, var2, var10, var11, TileItem.mapDotSprites[0], var4);
				}

				if (!class253.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field685[var3] = true;
		}
	}
}
