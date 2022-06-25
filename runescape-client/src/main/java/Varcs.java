import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.io.RandomAccessFile;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.io.File;
import java.util.Map;
import java.io.EOFException;
import net.runelite.mapping.Export;
@Deprecated
@ObfuscatedName("ck")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("t")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	@ObfuscatedName("ez")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive5")
	static Archive archive5;

	@ObfuscatedName("q")
	@Export("intsPersistence")
	boolean[] intsPersistence;

	@ObfuscatedName("f")
	@Export("map")
	Map map;

	@ObfuscatedName("j")
	@Export("strings")
	String[] strings;

	@ObfuscatedName("e")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;

	@ObfuscatedName("g")
	@ObfuscatedGetter(longValue = -7650990867349600243L)
	long field1321;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class140.archive2.getGroupFileCount(19);
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
					var4.method3400(new Buffer(var5));
				}
				VarcInt.VarcInt_cached.put(var4, ((long) (var2)));
				var3 = var4;
			}
			this.intsPersistence[var2] = var3.persist;
		}
		var2 = 0;
		if (class140.archive2.method5806(15)) {
			var2 = class140.archive2.getGroupFileCount(15);
		}
		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-480825511")
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-27")
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? ((Integer) (var2)) : -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "-1848287137")
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-1873976363")
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? ((String) (var2)) : "";
	}

	@Deprecated
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "-1935222332")
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@Deprecated
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;", garbageValue = "29")
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "654985106")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ZS)Lpn;", garbageValue = "-4151")
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class67.getPreferencesFile("2", class285.field3313.name, var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "117")
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
						var2 += ScriptEvent.stringCp1252NullTerminatedByteSize(((String) (var7)));
					}
					++var3;
				}
			} 
			Buffer var24 = new Buffer(var2);
			var24.writeByte(2);
			var24.writeShort(var3);
			Iterator var25 = this.map.entrySet().iterator();
			while (var25.hasNext()) {
				Entry var13 = ((Entry) (var25.next()));
				int var14 = ((Integer) (var13.getKey()));
				if (this.intsPersistence[var14]) {
					var24.writeShort(var14);
					Object var8 = var13.getValue();
					class432 var9 = class432.method7561(var8.getClass());
					var24.writeByte(var9.field4655);
					class428 var10 = class432.method7577(var8.getClass());
					var10.vmethod7583(var8, var24);
				}
			} 
			var1.write(var24.array, 0, var24.offset);
		} catch (Exception var22) {
		} finally {
			try {
				var1.close();
			} catch (Exception var21) {
			}
		}
		this.unwrittenChanges = false;
		this.field1321 = class115.method2692();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "32768")
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);
		label212 : {
			try {
				byte[] var2 = new byte[((int) (var1.length()))];
				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}
				Buffer var14 = new Buffer(var2);
				if (var14.array.length - var14.offset < 1) {
					return;
				}
				int var15 = var14.readUnsignedByte();
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;
						while (true) {
							if (var7 >= var16) {
								break label212;
							}
							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class432 var10 = ((class432) (Actor.findEnumerated(class432.method7566(), var9)));
							Object var11 = var10.method7565(var14);
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var11);
							}
							++var7;
						} 
					} else {
						var16 = var14.readUnsignedShort();
						for (var7 = 0; var7 < var16; ++var7) {
							var8 = var14.readUnsignedShort();
							var9 = var14.readInt();
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}
						var7 = var14.readUnsignedShort();
						var8 = 0;
						while (true) {
							if (var8 >= var7) {
								break label212;
							}
							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						} 
					}
				}
			} catch (Exception var25) {
				break label212;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}
			}
			return;
		}
		this.unwrittenChanges = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1207260156")
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1321 < class115.method2692() - 60000L) {
			this.write();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1353615463")
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/io/File;ZI)Z", garbageValue = "1566405601")
	static boolean method2474(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-27")
	static int method2475(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			var3 = class140.getWidget(var4);
		} else {
			var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		}
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class446.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}
			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}
			var3.scrollY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}
			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class446.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 5];
			ChatChannel.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					ChatChannel.invalidateWidget(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					ChatChannel.invalidateWidget(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class446.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class446.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				ChatChannel.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var4 >> 16], var3, false);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class362.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				ChatChannel.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				FillMode var6 = ((FillMode) (Actor.findEnumerated(StudioGame.FillMode_values(), var8)));
				if (var6 != null) {
					var3.fillMode = var6;
					ChatChannel.invalidateWidget(var3);
				}
				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					var3.field3402 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					class446.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3405 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					ChatChannel.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5619(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], class138.urlRequester, BoundaryObject.method4536());
					return 1;
				} else if (var0 == 1131) {
					class446.Interpreter_intStackSize -= 2;
					var3.method5621(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5622(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}