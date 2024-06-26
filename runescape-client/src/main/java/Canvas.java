import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ai")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("gh")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("aq")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldb;IIB)V",
		garbageValue = "0"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class353.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1214 = 0;
			}

			if (var3 == 2) {
				var0.field1214 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class353.SequenceDefinition_get(var1).field2298 >= class353.SequenceDefinition_get(var0.sequence).field2298) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1214 = 0;
			var0.field1265 = var0.pathLength;
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329273571"
	)
	static boolean method320() {
		return (Client.drawPlayerNames & 4) != 0;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1210346411"
	)
	static final void method323(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var14 * var11 - var7 * var13 >> 16;
			var12 = var14 * var7 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var13 * var12 + var14 * var10 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			WorldMapSectionType.field2666 = var0 - var10;
			ObjectSound.field853 = var1 - var11;
			class137.field1630 = var2 - var12;
			class328.field3565 = var3;
			WorldMapLabelSize.field2551 = var4;
		} else {
			class47.cameraX = var0 - var10;
			class328.cameraY = var1 - var11;
			class60.cameraZ = var2 - var12;
			Language.cameraPitch = var3;
			class337.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class371.oculusOrbFocalPointX >> 7 != SoundCache.localPlayer.x >> 7 || PacketBufferNode.oculusOrbFocalPointY >> 7 != SoundCache.localPlayer.y >> 7)) {
			var13 = SoundCache.localPlayer.plane;
			var14 = (class371.oculusOrbFocalPointX >> 7) + class511.topLevelWorldView.baseX;
			var15 = (PacketBufferNode.oculusOrbFocalPointY >> 7) + class511.topLevelWorldView.baseY;
			NPC.method2713(var14, var15, var13, true);
		}

	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2048510923"
	)
	static void method322() {
		if (Client.isSpellSelected) {
			Widget var0 = ModeWhere.widgetDefinition.getWidgetChild(Message.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Projectile.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			TriBool.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnx;II)I",
		garbageValue = "1946879633"
	)
	static final int method325(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ModeWhere.widgetDefinition.method6519(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class164.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = SoundCache.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ModeWhere.widgetDefinition.method6519(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class164.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class162.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (SoundCache.localPlayer.x >> 7) + class511.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (SoundCache.localPlayer.y >> 7) + class511.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
