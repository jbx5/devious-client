import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("nn")
public class class389 {
	@ObfuscatedName("o")
	float field4422;

	@ObfuscatedName("q")
	float field4423;

	@ObfuscatedName("f")
	float field4414;

	@ObfuscatedName("u")
	float field4418;

	@ObfuscatedName("c")
	float field4416;

	@ObfuscatedName("w")
	float field4417;

	@ObfuscatedName("z")
	float field4412;

	@ObfuscatedName("j")
	float field4419;

	@ObfuscatedName("h")
	float field4420;

	@ObfuscatedName("a")
	float field4421;

	@ObfuscatedName("d")
	float field4413;

	@ObfuscatedName("n")
	float field4415;

	static {
		new class389();
	}

	class389() {
		this.method7060();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-261547964")
	void method7060() {
		this.field4415 = 0.0F;
		this.field4413 = 0.0F;
		this.field4421 = 0.0F;
		this.field4419 = 0.0F;
		this.field4412 = 0.0F;
		this.field4417 = 0.0F;
		this.field4418 = 0.0F;
		this.field4414 = 0.0F;
		this.field4423 = 0.0F;
		this.field4420 = 1.0F;
		this.field4416 = 1.0F;
		this.field4422 = 1.0F;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "1340034472")
	void method7061(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4423;
		float var5 = this.field4416;
		float var6 = this.field4419;
		float var7 = this.field4413;
		this.field4423 = var2 * var4 - var3 * this.field4414;
		this.field4414 = var4 * var3 + var2 * this.field4414;
		this.field4416 = var2 * var5 - this.field4417 * var3;
		this.field4417 = var2 * this.field4417 + var5 * var3;
		this.field4419 = var2 * var6 - var3 * this.field4420;
		this.field4420 = var6 * var3 + var2 * this.field4420;
		this.field4413 = var2 * var7 - var3 * this.field4415;
		this.field4415 = var2 * this.field4415 + var7 * var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(FB)V", garbageValue = "47")
	void method7062(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4422;
		float var5 = this.field4418;
		float var6 = this.field4412;
		float var7 = this.field4421;
		this.field4422 = this.field4414 * var3 + var2 * var4;
		this.field4414 = this.field4414 * var2 - var4 * var3;
		this.field4418 = var2 * var5 + var3 * this.field4417;
		this.field4417 = var2 * this.field4417 - var5 * var3;
		this.field4412 = this.field4420 * var3 + var6 * var2;
		this.field4420 = var2 * this.field4420 - var6 * var3;
		this.field4421 = var7 * var2 + var3 * this.field4415;
		this.field4415 = var2 * this.field4415 - var7 * var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(FS)V", garbageValue = "14299")
	void method7063(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4422;
		float var5 = this.field4418;
		float var6 = this.field4412;
		float var7 = this.field4421;
		this.field4422 = var4 * var2 - var3 * this.field4423;
		this.field4423 = var4 * var3 + this.field4423 * var2;
		this.field4418 = var2 * var5 - this.field4416 * var3;
		this.field4416 = var2 * this.field4416 + var3 * var5;
		this.field4412 = var6 * var2 - this.field4419 * var3;
		this.field4419 = var6 * var3 + this.field4419 * var2;
		this.field4421 = var7 * var2 - this.field4413 * var3;
		this.field4413 = var7 * var3 + var2 * this.field4413;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(FFFB)V", garbageValue = "27")
	void method7064(float var1, float var2, float var3) {
		this.field4421 += var1;
		this.field4413 += var2;
		this.field4415 += var3;
	}

	public String toString() {
		return this.field4422 + "," + this.field4418 + "," + this.field4412 + "," + this.field4421 + "\n" + this.field4423 + "," + this.field4416 + "," + this.field4419 + "," + this.field4413 + "\n" + this.field4414 + "," + this.field4417 + "," + this.field4420 + "," + this.field4415;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)[Ljr;", garbageValue = "-711904149")
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3061, ServerPacket.field3073, ServerPacket.field3041, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3043, ServerPacket.field3044, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3046, ServerPacket.field3047, ServerPacket.IF_SETANGLE, ServerPacket.field3049, ServerPacket.field3131, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3115, ServerPacket.NPC_SPOTANIM, ServerPacket.field3054, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3058, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_UID192, ServerPacket.MESSAGE_GAME, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3063, ServerPacket.field3064, ServerPacket.field3065, ServerPacket.field3066, ServerPacket.SET_PLAYER_OP, ServerPacket.IF_SETOBJECT, ServerPacket.field3069, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3094, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETHIDE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3096, ServerPacket.IF_SETANIM, ServerPacket.EVENT_WORLDHOP, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.PROJECTILE_SPAWN, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_MOVESUB, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3086, ServerPacket.field3081, ServerPacket.field3088, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3077, ServerPacket.field3091, ServerPacket.IF_SETPOSITION, ServerPacket.LOGOUT, ServerPacket.IF_SETMODEL, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3097, ServerPacket.field3107, ServerPacket.field3099, ServerPacket.field3087, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3105, ServerPacket.field3133, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3060, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.MINIMAP_TOGGLE, ServerPacket.VARP_LARGE, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_RESET, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3119, ServerPacket.IF_CLOSESUB, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_INV_FULL, ServerPacket.CAM_LOOKAT, ServerPacket.VARP_SMALL, ServerPacket.IF_SETCOLOUR, ServerPacket.field3126, ServerPacket.HINT_ARROW, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3129, ServerPacket.field3140, ServerPacket.field3114, ServerPacket.MIDI_SONG, ServerPacket.REBUILD_NORMAL, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3071, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3137, ServerPacket.URL_OPEN, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3039, ServerPacket.field3141 };
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)[Lql;", garbageValue = "-14")
	public static IndexedSprite[] method7083() {
		IndexedSprite[] var0 = new IndexedSprite[class457.SpriteBuffer_spriteCount];
		for (int var1 = 0; var1 < class457.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class457.SpriteBuffer_spriteWidth;
			var2.height = class457.SpriteBuffer_spriteHeight;
			var2.xOffset = class267.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class457.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class457.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = Decimator.SpriteBuffer_spriteHeights[var1];
			var2.palette = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette;
			var2.pixels = DbTableType.SpriteBuffer_pixels[var1];
		}
		IgnoreList.method6630();
		return var0;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(descriptor = "([Lku;IIIIIIIB)V", garbageValue = "114")
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method5634() || class67.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (ModeWhere.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != FontName.mousedOverWidgetIf1 && ModeWhere.isComponentHidden(var9)) {
					continue;
				}
				if (var9.type == 11 && var9.method5702(class152.urlRequester)) {
					if (var9.method5640()) {
						class220.invalidateWidget(var9);
						class439.revalidateWidgetScroll(var9.children, var9, true);
					}
					if (var9.field3492 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3492;
						Client.scriptEvents.addFirst(var10);
					}
				}
				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var26;
						var17 = var11;
						var18 = var26 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var26) {
							var16 = var18;
							var18 = var26;
						}
						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}
						++var18;
						++var19;
						var12 = (var16 > var2) ? var16 : var2;
						var13 = (var17 > var3) ? var17 : var3;
						var14 = (var18 < var4) ? var18 : var4;
						var15 = (var19 < var5) ? var19 : var5;
					} else {
						var16 = var26 + var9.width;
						var17 = var11 + var9.height;
						var12 = (var26 > var2) ? var26 : var2;
						var13 = (var11 > var3) ? var11 : var3;
						var14 = (var16 < var4) ? var16 : var4;
						var15 = (var17 < var5) ? var17 : var5;
					}
				}
				if (var9 == Client.clickedWidget) {
					Client.field549 = true;
					Client.field679 = var26;
					Client.field680 = var11;
				}
				boolean var34 = false;
				if (var9.field3444) {
					switch (Client.field603) {
						case 0 :
							var34 = true;
						case 1 :
						default :
							break;
						case 2 :
							if (Client.field660 == var9.id >>> 16) {
								var34 = true;
							}
							break;
						case 3 :
							if (var9.id == Client.field660) {
								var34 = true;
							}
					}
				}
				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
									if (var27.isMouseInputEvent) {
										var27.remove();
										var27.widget.containsMouse = false;
									}
								}
								if (LoginScreenAnimation.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}
								if (!Client.isMenuOpen) {
									UserComparator9.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}
					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}
					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							ViewportMouse.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class101.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class344.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}
						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class344.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								class302.Widget_addToMenu(var9, var17 - var26, var18 - var11);
							}
						}
						boolean var21;
						int var29;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3445.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3445[var20] != null) {
									for (var29 = 0; var29 < var9.field3445[var20].length; ++var29) {
										boolean var24 = false;
										if (var9.field3514 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3445[var20][var29]];
										}
										if (class390.method7092(var9.field3445[var20][var29]) || var24) {
											var21 = true;
											if (var9.field3514 != null && var9.field3514[var20] > Client.cycle) {
												break;
											}
											byte var33 = var9.field3446[var20][var29];
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var28 = true;
												break;
											}
										}
									}
								}
								if (var28) {
									if (var20 < 10) {
										ArchiveLoader.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class362.Widget_runOnTargetLeave();
										class21.selectSpell(var9.id, var9.childIndex, BoundaryObject.Widget_unpackTargetMask(class67.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = IgnoreList.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}
										Client.selectedSpellName = var9.dataText + class82.colorStartTag(16777215);
									}
									var29 = var9.field3447[var20];
									if (var9.field3514 == null) {
										var9.field3514 = new int[var9.field3445.length];
									}
									if (var9.field3448 == null) {
										var9.field3448 = new int[var9.field3445.length];
									}
									if (var29 != 0) {
										if (var9.field3514[var20] == 0) {
											var9.field3514[var20] = var29 + Client.cycle + var9.field3448[var20];
										} else {
											var9.field3514[var20] = var29 + Client.cycle;
										}
									} else {
										var9.field3514[var20] = Integer.MAX_VALUE;
									}
								}
								if (!var21 && var9.field3514 != null) {
									var9.field3514[var20] = 0;
								}
							}
						}
						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}
							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}
							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}
							int[] var22;
							if (var21) {
								class19.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
								if (var9.type == 11 && var9.method5720(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) {
									switch (var9.method5649()) {
										case 0 :
											class238.openURL(var9.method5668(), true, false);
											break;
										case 1 :
											if (WorldMapRectangle.method4966(class67.getWidgetFlags(var9))) {
												var22 = var9.method5646();
												if (var22 != null) {
													PacketBufferNode var23 = class433.getPacketBufferNode(ClientPacket.field3008, Client.packetWriter.isaacCipher);
													var23.packetBuffer.writeIntIME(var9.id);
													var23.packetBuffer.writeIntLE(var22[0]);
													var23.packetBuffer.writeShortAddLE(var22[1]);
													var23.packetBuffer.writeInt(var9.method5625());
													var23.packetBuffer.writeShortLE(var9.childIndex);
													var23.packetBuffer.writeIntIME(var22[2]);
													Client.packetWriter.addNode(var23);
												}
											}
									}
								}
							}
							if (var9.contentType == 1400) {
								class344.worldMap.method7226(var17, var18, var35 & var36, var35 & var21);
							}
							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class78.method2157(class67.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}
							if (var9 == Client.clickedWidgetParent) {
								Client.field675 = true;
								Client.field676 = var26;
								Client.field751 = var11;
							}
							if (var9.hasListener) {
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseY = Client.mouseWheelRotation;
									var37.args = var9.onScroll;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.clickedWidget != null || class115.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}
								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var37.args = var9.onClick;
										Client.scriptEvents.addFirst(var37);
									}
								}
								if (var9.isClicked && var36 && var9.onClickRepeat != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var37);
								}
								if (var9.isClicked && !var36) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onRelease;
										Client.field702.addFirst(var37);
									}
								}
								if (var36 && var9.onHold != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onHold;
									Client.scriptEvents.addFirst(var37);
								}
								if (!var9.containsMouse && var35) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var37);
									}
								}
								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var37);
								}
								if (var9.containsMouse && !var35) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseLeave;
										Client.field702.addFirst(var37);
									}
								}
								if (var9.onTimer != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onTimer;
									Client.field758.addFirst(var37);
								}
								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3369) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3369 <= 32) {
										label839 : for (var40 = var9.field3369; var40 < Client.changedVarpCount; ++var40) {
											var29 = Client.changedVarps[var40 & 31];
											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) {
												if (var29 == var9.varTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label839;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3369 = Client.changedVarpCount;
								}
								if (var9.onInvTransmit != null && Client.field686 > var9.field3510) {
									if (var9.invTransmitTriggers != null && Client.field686 - var9.field3510 <= 32) {
										label815 : for (var40 = var9.field3510; var40 < Client.field686; ++var40) {
											var29 = Client.changedItemContainers[var40 & 31];
											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) {
												if (var29 == var9.invTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label815;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3510 = Client.field686;
								}
								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3486) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3486 <= 32) {
										label791 : for (var40 = var9.field3486; var40 < Client.changedSkillsCount; ++var40) {
											var29 = Client.changedSkills[var40 & 31];
											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) {
												if (var29 == var9.statTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label791;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3486 = Client.changedSkillsCount;
								}
								if (Client.chatCycle > var9.field3508 && var9.onChatTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field750 > var9.field3508 && var9.onFriendTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field612 > var9.field3508 && var9.onClanTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field694 > var9.field3508 && var9.field3484 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3484;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field755 > var9.field3508 && var9.field3485 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3485;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field696 > var9.field3508 && var9.onStockTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field697 > var9.field3508 && var9.field3491 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3491;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field726 > var9.field3508 && var9.onMiscTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								var9.field3508 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var40 = 0; var40 < Client.field722; ++var40) {
										ScriptEvent var38 = new ScriptEvent();
										var38.widget = var9;
										var38.keyTyped = Client.field724[var40];
										var38.keyPressed = Client.field626[var40];
										var38.args = var9.onKey;
										Client.scriptEvents.addFirst(var38);
									}
								}
								ScriptEvent var32;
								if (var9.field3480 != null) {
									var22 = class7.method58();
									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3480;
										Client.scriptEvents.addFirst(var32);
									}
								}
								if (var9.field3481 != null) {
									var22 = Timer.method6564();
									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3481;
										Client.scriptEvents.addFirst(var32);
									}
								}
							}
						}
						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class115.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}
							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									FontName.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									FontName.mousedOverWidgetIf1 = var9;
								}
							}
							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class10.field59 = var9;
							}
							if (var9.scrollHeight > var9.height) {
								class17.method261(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}
						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}
							InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var9.id)))));
							if (var30 != null) {
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var31 = ((ScriptEvent) (Client.scriptEvents.last())); var31 != null; var31 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}
									if (LoginScreenAnimation.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}
									if (!Client.isMenuOpen) {
										UserComparator9.addCancelMenuEntry();
									}
								}
								MouseHandler.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}
	}
}