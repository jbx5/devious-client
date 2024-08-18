import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class59 {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	VorbisFloor field406;
	@ObfuscatedName("ay")
	boolean field403;
	@ObfuscatedName("an")
	int[] field405;
	@ObfuscatedName("au")
	int[] field402;
	@ObfuscatedName("ax")
	boolean[] field404;

	@ObfuscatedSignature(
		descriptor = "(Lbt;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field406 = var1;
		this.field403 = var2;
		this.field405 = var3;
		this.field402 = var4;
		this.field404 = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-1872528002"
	)
	void method1118(float[] var1, int var2) {
		int var3 = this.field406.field248.length;
		VorbisFloor var10000 = this.field406;
		int var4 = VorbisFloor.field249[this.field406.multiplier - 1];
		boolean[] var5 = this.field404;
		this.field404[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field406.method737(this.field405, var6);
			var8 = this.field406.method731(this.field405, var6);
			var9 = this.field406.method732(this.field405[var7], this.field402[var7], this.field405[var8], this.field402[var8], this.field405[var6]);
			var10 = this.field402[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field404;
				this.field404[var8] = true;
				var14[var7] = true;
				this.field404[var6] = true;
				if (var10 >= var13) {
					this.field402[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field402[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field404[var6] = false;
				this.field402[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field406.multiplier * this.field402[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field404[var8]) {
				var9 = this.field405[var8];
				var10 = this.field406.multiplier * this.field402[var8];
				this.field406.method733(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field406;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method1130() {
		return this.field403;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1612499108"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field405[var1];
			int var5 = this.field402[var1];
			boolean var6 = this.field404[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field405[var7];
				if (var8 < var4) {
					this.field405[var3] = var8;
					this.field402[var3] = this.field402[var7];
					this.field404[var3] = this.field404[var7];
					++var3;
					this.field405[var7] = this.field405[var3];
					this.field402[var7] = this.field402[var3];
					this.field404[var7] = this.field404[var3];
				}
			}

			this.field405[var3] = var4;
			this.field402[var3] = var5;
			this.field404[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldp;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = SoundSystem.getScript(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var4 = class426.method7963(var2, var0);
			var5 = SoundSystem.getScript(var4, var0);
			if (var5 != null) {
				return var5;
			} else {
				int var6 = var0 + -512;
				var5 = SoundSystem.getScript(var6, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "0"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field771;
		} else if (var5 >= 100) {
			var6 = Client.field691;
		} else {
			var6 = (Client.field691 - Client.field771) * var5 / 100 + Client.field771;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field579) {
			var18 = Client.field579;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field775) {
				var6 = Client.field775;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field778) {
			var18 = Client.field778;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field546) {
				var6 = Client.field546;
				var8 = var18 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var11 * var16 / 256;
				var17[var9] = var13 * var14 >> 16;
			}

			ConcurrentMidiTask.topLevelWorldView.scene.method3938(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldy;ZLvs;I)V",
		garbageValue = "-1677990224"
	)
	static final void method1135(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					if (var0.npcs[var5] == null) {
						var0.npcs[var5] = new NPC();
						var6 = true;
					}

					NPC var7 = var0.npcs[var5];
					var0.npcIndices[++var0.npcCount - 1] = var5;
					var7.npcCycle = Client.cycle;
					int var8 = var2.readBits(1);
					boolean var11 = var2.readBits(1) == 1;
					if (var11) {
						var2.readBits(32);
					}

					int var12 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var12;
					}

					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					var7.definition = UserComparator8.getNpcDefinition(var2.readBits(14));
					int var13 = var2.readBits(1);
					if (var13 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					class229.method4770(var7);
					if (var7.field1221 == 0) {
						var7.rotation = 0;
					}

					if (class546.field5371 >= 222) {
						var7.method2752(var9 + ClientPreferences.field1285, var10 + class28.field132, var8 == 1);
						continue;
					}

					var7.method2752(class253.localPlayer.pathX[0] + var9, class253.localPlayer.pathY[0] + var10, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "([Lnq;IB)V",
		garbageValue = "14"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class238.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && class238.isComponentHidden(var3) && var3 != HttpMethod.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class155.method3411(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = HealthBarConfig.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class182.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class416.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.method5307();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								class416.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3854 != 0 && !var3.isIf3) {
						int var9 = var3.field3854 >> 16;
						var5 = var3.field3854 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class416.invalidateWidget(var3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1621477878"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		UrlRequester.method3003();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var4 = GrandExchangeOffer.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					class31.method427(0.9D);
				}

				if (var2 == 2) {
					class31.method427(0.8D);
				}

				if (var2 == 3) {
					class31.method427(0.7D);
				}

				if (var2 == 4) {
					class31.method427(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					class271.setMusicVolume(255);
				}

				if (var2 == 1) {
					class271.setMusicVolume(192);
				}

				if (var2 == 2) {
					class271.setMusicVolume(128);
				}

				if (var2 == 3) {
					class271.setMusicVolume(64);
				}

				if (var2 == 4) {
					class271.setMusicVolume(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					class195.method4206(127);
				}

				if (var2 == 1) {
					class195.method4206(96);
				}

				if (var2 == 2) {
					class195.method4206(64);
				}

				if (var2 == 3) {
					class195.method4206(32);
				}

				if (var2 == 4) {
					class195.method4206(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var2 == 0) {
					class544.method9543(127);
				}

				if (var2 == 1) {
					class544.method9543(96);
				}

				if (var2 == 2) {
					class544.method9543(64);
				}

				if (var2 == 3) {
					class544.method9543(32);
				}

				if (var2 == 4) {
					class544.method9543(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1364, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1366, AttackOption.AttackOption_hidden};
				Client.playerAttackOption = (AttackOption)class134.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1364, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1366, AttackOption.AttackOption_hidden};
				Client.npcAttackOption = (AttackOption)class134.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Ldi;ZI)V",
		garbageValue = "-652986184"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			FloorUnderlayDefinition.widgetDefinition.method6547(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = FloorUnderlayDefinition.widgetDefinition.method6544(var3);
		if (var5 != null) {
			class416.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			HealthBarUpdate.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
