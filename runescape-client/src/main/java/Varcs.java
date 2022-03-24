import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("cm")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("h")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("g")
	@Export("map")
	Map map;

	@ObfuscatedName("l")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("n")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("d")
	@ObfuscatedGetter(longValue = 
	2946805821198805637L)

	long field1307;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = FloorOverlayDefinition.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = ((VarcInt) (VarcInt.VarcInt_cached.get(((long) (var2)))));
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method3386(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, ((long) (var2)));
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (FloorOverlayDefinition.archive2.method5829(15)) {
			var2 = FloorOverlayDefinition.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"533278034")

	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-1614865457")

	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? ((Integer) (var2)) : -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)V", garbageValue = 
	"1697457193")

	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"2144710049")

	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? ((String) (var2)) : "";
	}


	@Deprecated
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)V", garbageValue = 
	"2070749528")

	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}


	@Deprecated
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"554707928")

	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1036049158")

	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lpr;", garbageValue = 
	"-444552079")

	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return ReflectionCheck.getPreferencesFile("2", Login.field917.name, var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = ((Entry) (var4.next()));
				int var6 = ((Integer) (var5.getKey()));
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += ItemLayer.stringCp1252NullTerminatedByteSize(((String) (var7)));
					}

					++var3;
				}
			} 

			Buffer var33 = new Buffer(var2);
			var33.writeByte(2);
			var33.writeShort(var3);
			Iterator var34 = this.map.entrySet().iterator();

			label186 : while (
			true) {
				Entry var21;
				int var22;
				do {
					if (!var34.hasNext()) {
						var1.write(var33.array, 0, var33.offset);
						break label186;
					}

					var21 = ((Entry) (var34.next()));
					var22 = ((Integer) (var21.getKey()));
				} while (!this.intsPersistence[var22] );

				var33.writeShort(var22);
				Object var8 = var21.getValue();
				Class var10 = var8.getClass();
				class431[] var11 = new class431[]{ class431.field4598, class431.field4595, class431.field4600 };
				class431[] var12 = var11;
				int var13 = 0;

				class431 var9;
				class431 var14;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null;
						break;
					}

					var14 = var12[var13];
					if (var10 == var14.field4599) {
						var9 = var14;
						break;
					}

					++var13;
				} 

				var33.writeByte(var9.field4594);
				Class var23 = var8.getClass();
				class431[] var15 = new class431[]{ class431.field4598, class431.field4595, class431.field4600 };
				class431[] var16 = var15;
				int var17 = 0;

				while (true) {
					if (var17 >= var16.length) {
						var14 = null;
						break;
					}

					class431 var18 = var16[var17];
					if (var23 == var18.field4599) {
						var14 = var18;
						break;
					}

					++var17;
				} 

				if (var14 == null) {
					throw new IllegalArgumentException();
				}

				class427 var35 = var14.field4596;
				var35.vmethod7681(var8, var33);
			} 
		} catch (Exception var31) {
		} finally {
			try {
				var1.close();
			} catch (Exception var30) {
			}

		}

		this.unwrittenChanges = false;
		this.field1307 = WorldMapSprite.getServerTime();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2035245594")

	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label212 : {
			try {
				byte[] var2 = new byte[((int) (var1.length()))];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == (-1)) {
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2);
				if ((var15.array.length - var15.offset) >= 1) {
					int var16 = var15.readUnsignedByte();
					if ((var16 < 0) || (var16 > 2)) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) {
						var17 = var15.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label212;
							}

							var8 = var15.readUnsignedShort();
							var9 = var15.readUnsignedByte();
							class431[] var10 = new class431[]{ class431.field4598, class431.field4595, class431.field4600 };
							class431 var11 = ((class431) (ChatChannel.findEnumerated(var10, var9)));
							Object var12 = var11.method7671(var15);
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var12);
							}

							++var7;
						} 
					} else {
						var17 = var15.readUnsignedShort();

						for (var7 = 0; var7 < var17; ++var7) {
							var8 = var15.readUnsignedShort();
							var9 = var15.readInt();
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var15.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label212;
							}

							var15.readUnsignedShort();
							var15.readStringCp1252NullTerminated();
							++var8;
						} 
					}
				}
			} catch (Exception var26) {
				break label212;
			} finally {
				try {
					var1.close();
				} catch (Exception var25) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"673207891")

	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && (this.field1307 < (WorldMapSprite.getServerTime() - 60000L))) {
			this.write();
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"14")

	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/io/File;", garbageValue = 
	"-899497514")

	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = ((File) (FileSystem.FileSystem_cacheFiles.get(var0)));
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(class17.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"-620948182")

	static final void method2462(boolean var0) {
		if (var0) {
			Client.field516 = (Login.field903) ? class124.field1509 : class124.field1511;
		} else {
			LinkedHashMap var1 = Interpreter.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = ((var5 << 5) - var5) + var3.charAt(var6);
			}

			Client.field516 = (var1.containsKey(var5)) ? class124.field1516 : class124.field1510;
		}

	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;IIIIIIII)V", garbageValue = 
	"-2083182413")

	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (((var9 != null) && (var9.parentId == var1)) && ((var9.method5637() || (WorldMapSection2.getWidgetFlags(var9) != 0)) || (var9 == Client.clickedWidgetParent))) {
				if (var9.isIf3) {
					if (class263.isComponentHidden(var9)) {
						continue;
					}
				} else if (((var9.type == 0) && (var9 != Player.mousedOverWidgetIf1)) && class263.isComponentHidden(var9)) {
					continue;
				}

				if ((var9.type == 11) && var9.method5694(UserComparator9.urlRequester)) {
					class290.invalidateWidget(var9);
					GrandExchangeEvents.revalidateWidgetScroll(var9.children, var9, true);
					if (var9.field3408 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3408;
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
					Client.field671 = true;
					Client.field596 = var26;
					Client.field673 = var11;
				}

				boolean var34 = false;
				if (var9.field3432) {
					switch (Client.field652) {
						case 0 :
							var34 = true;
						case 1 :
						default :
							break;
						case 2 :
							if (Client.field653 == (var9.id >>> 16)) {
								var34 = true;
							}
							break;
						case 3 :
							if (var9.id == Client.field653) {
								var34 = true;
							}}

				}

				if ((var34 || (!var9.isIf3)) || ((var12 < var14) && (var13 < var15))) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
									if (var27.isMouseInputEvent) {
										var27.remove();
										var27.widget.containsMouse = false;
									}
								}

								if (class136.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									VarpDefinition.addCancelMenuEntry();
								}
							}
						} else if ((((var9.noScrollThrough && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
							for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
								if (var27.isMouseInputEvent && (var27.widget.onScroll == var27.args)) {
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

					boolean var35 = (((var17 >= var12) && (var18 >= var13)) && (var17 < var14)) && (var18 < var15);
					if (var9.contentType == 1337) {
						if (((!Client.isLoading) && (!Client.isMenuOpen)) && var35) {
							class132.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						Script.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							ClanChannel.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if ((!Client.isMenuOpen) && var35) {
							if (var9.contentType == 1400) {
								ClanChannel.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								WorldMapLabelSize.Widget_addToMenu(var9, var17 - var26, var18 - var11);
							}
						}

						boolean var21;
						int var29;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3422.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if ((!var21) && (var9.field3422[var20] != null)) {
									for (var29 = 0; var29 < var9.field3422[var20].length; ++var29) {
										boolean var24 = false;
										if (var9.field3406 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3422[var20][var29]];
										}

										if (class273.method5267(var9.field3422[var20][var29]) || var24) {
											var21 = true;
											if ((var9.field3406 != null) && (var9.field3406[var20] > Client.cycle)) {
												break;
											}

											byte var33 = var9.field3423[var20][var29];
											if ((var33 == 0) || ((((((var33 & 8) == 0) || (((!KeyHandler.KeyHandler_pressedKeys[86]) && (!KeyHandler.KeyHandler_pressedKeys[82])) && (!KeyHandler.KeyHandler_pressedKeys[81]))) && (((var33 & 2) == 0) || KeyHandler.KeyHandler_pressedKeys[86])) && (((var33 & 1) == 0) || KeyHandler.KeyHandler_pressedKeys[82])) && (((var33 & 4) == 0) || KeyHandler.KeyHandler_pressedKeys[81]))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										Message.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class120.Widget_runOnTargetLeave();
										ApproximateRouteStrategy.selectSpell(var9.id, var9.childIndex, WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = InvDefinition.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + ChatChannel.colorStartTag(16777215);
									}

									var29 = var9.field3424[var20];
									if (var9.field3406 == null) {
										var9.field3406 = new int[var9.field3422.length];
									}

									if (var9.field3425 == null) {
										var9.field3425 = new int[var9.field3422.length];
									}

									if (var29 != 0) {
										if (var9.field3406[var20] == 0) {
											var9.field3406[var20] = (var29 + Client.cycle) + var9.field3425[var20];
										} else {
											var9.field3406[var20] = var29 + Client.cycle;
										}
									} else {
										var9.field3406[var20] = Integer.MAX_VALUE;
									}
								}

								if ((!var21) && (var9.field3406 != null)) {
									var9.field3406[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if (((MouseHandler.MouseHandler_currentButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((((((MouseHandler.MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= var12)) && (MouseHandler.MouseHandler_lastPressedY >= var13)) && (MouseHandler.MouseHandler_lastPressedX < var14)) && (MouseHandler.MouseHandler_lastPressedY < var15)) {
								var21 = true;
							}

							int[] var22;
							if (var21) {
								PcmPlayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
								if ((var9.type == 11) && var9.method5623(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY)) {
									switch (var9.method5656()) {
										case 0 :
											class11.openURL(var9.method5647(), true, false);
											break;
										case 1 :
											if (class355.method6620(WorldMapSection2.getWidgetFlags(var9))) {
												var22 = var9.method5686();
												if (var22 != null) {
													PacketBufferNode var23 = ItemContainer.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher);
													var23.packetBuffer.writeIntIME(var22[0]);
													var23.packetBuffer.writeShortLE(var9.childIndex);
													var23.packetBuffer.writeIntLE(var22[1]);
													var23.packetBuffer.writeIntME(var9.method5699());
													var23.packetBuffer.writeIntLE(var22[2]);
													var23.packetBuffer.writeInt(var9.id);
													Client.packetWriter.addNode(var23);
												}
											}}

								}
							}

							if (var9.contentType == 1400) {
								ClanChannel.worldMap.method7305(var17, var18, var35 & var36, var35 & var21);
							}

							if ((((Client.clickedWidget != null) && (var9 != Client.clickedWidget)) && var35) && class162.method3276(WorldMapSection2.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field668 = true;
								Client.field669 = var26;
								Client.field628 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var37;
								if ((var35 && (Client.mouseWheelRotation != 0)) && (var9.onScroll != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseY = Client.mouseWheelRotation;
									var37.args = var9.onScroll;
									Client.scriptEvents.addFirst(var37);
								}

								if (((Client.clickedWidget != null) || (FloorDecoration.dragInventoryWidget != null)) || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if ((!var9.isClicked) && var21) {
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

								if ((var9.isClicked && var36) && (var9.onClickRepeat != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var37);
								}

								if (var9.isClicked && (!var36)) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onRelease;
										Client.field695.addFirst(var37);
									}
								}

								if (var36 && (var9.onHold != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onHold;
									Client.scriptEvents.addFirst(var37);
								}

								if ((!var9.containsMouse) && var35) {
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

								if ((var9.containsMouse && var35) && (var9.onMouseRepeat != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var37);
								}

								if (var9.containsMouse && (!var35)) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseLeave;
										Client.field695.addFirst(var37);
									}
								}

								if (var9.onTimer != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onTimer;
									Client.field694.addFirst(var37);
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if ((var9.onVarTransmit != null) && (Client.changedVarpCount > var9.field3391)) {
									if ((var9.varTransmitTriggers != null) && ((Client.changedVarpCount - var9.field3391) <= 32)) {
										label827 : for (
										var40 = var9.field3391; var40 < Client.changedVarpCount; ++var40) {
											var29 = Client.changedVarps[var40 & 31];

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) {
												if (var29 == var9.varTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label827;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3391 = Client.changedVarpCount;
								}

								if ((var9.onInvTransmit != null) && (Client.field746 > var9.field3355)) {
									if ((var9.invTransmitTriggers != null) && ((Client.field746 - var9.field3355) <= 32)) {
										label803 : for (
										var40 = var9.field3355; var40 < Client.field746; ++var40) {
											var29 = Client.changedItemContainers[var40 & 31];

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) {
												if (var29 == var9.invTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label803;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3355 = Client.field746;
								}

								if ((var9.onStatTransmit != null) && (Client.changedSkillsCount > var9.field3387)) {
									if ((var9.statTransmitTriggers != null) && ((Client.changedSkillsCount - var9.field3387) <= 32)) {
										label779 : for (
										var40 = var9.field3387; var40 < Client.changedSkillsCount; ++var40) {
											var29 = Client.changedSkills[var40 & 31];

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) {
												if (var29 == var9.statTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label779;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3387 = Client.changedSkillsCount;
								}

								if ((Client.chatCycle > var9.field3481) && (var9.onChatTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field685 > var9.field3481) && (var9.onFriendTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field726 > var9.field3481) && (var9.onClanTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field687 > var9.field3481) && (var9.field3395 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3395;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field749 > var9.field3481) && (var9.field3461 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3461;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field689 > var9.field3481) && (var9.onStockTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field572 > var9.field3481) && (var9.field3468 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3468;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field762 > var9.field3481) && (var9.onMiscTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								var9.field3481 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var40 = 0; var40 < Client.field713; ++var40) {
										ScriptEvent var38 = new ScriptEvent();
										var38.widget = var9;
										var38.keyTyped = Client.field568[var40];
										var38.keyPressed = Client.field716[var40];
										var38.args = var9.onKey;
										Client.scriptEvents.addFirst(var38);
									}
								}

								ScriptEvent var32;
								if (var9.field3457 != null) {
									var22 = class65.method1869();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3457;
										Client.scriptEvents.addFirst(var32);
									}
								}

								if (var9.field3458 != null) {
									var22 = class166.method3311();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3458;
										Client.scriptEvents.addFirst(var32);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (((Client.clickedWidget != null) || (FloorDecoration.dragInventoryWidget != null)) || Client.isMenuOpen) {
								continue;
							}

							if ((((((var9.mouseOverRedirect >= 0) || (var9.mouseOverColor != 0)) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								if (var9.mouseOverRedirect >= 0) {
									Player.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Player.mousedOverWidgetIf1 = var9;
								}
							}

							if (((((var9.type == 8) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								class160.field1750 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								BuddyRankComparator.method2624(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var9.id)))));
							if (var30 != null) {
								if ((((((var30.type == 0) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) && (!Client.isMenuOpen)) {
									for (ScriptEvent var31 = ((ScriptEvent) (Client.scriptEvents.last())); var31 != null; var31 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}

									if (class136.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										VarpDefinition.addCancelMenuEntry();
									}
								}

								ItemComposition.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}