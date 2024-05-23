import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field1452;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 592748769
	)
	static int field1456;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -464348323
	)
	static int field1450;
	@ObfuscatedName("aj")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("az")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("af")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("aa")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8668677638035651351L
	)
	long field1448;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class260.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = class144.method3208(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class260.archive2.method7176(15)) {
			var2 = class260.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "43"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1147502140"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2111494155"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2125428487"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "910084128"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1989984596"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1057226799"
	)
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lue;",
		garbageValue = "0"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return UserComparator8.getPreferencesFile("2", class111.field1431.name, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "390056671"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class432.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var32 = new Buffer(var2);
			var32.writeByte(2);
			var32.writeShort(var3);
			Iterator var33 = this.map.entrySet().iterator();

			label183:
			while (true) {
				Entry var20;
				int var21;
				do {
					if (!var33.hasNext()) {
						var1.write(var32.array, 0, var32.offset);
						break label183;
					}

					var20 = (Entry)var33.next();
					var21 = (Integer)var20.getKey();
				} while(!this.intsPersistence[var21]);

				var32.writeShort(var21);
				Object var8 = var20.getValue();
				Class var10 = var8.getClass();
				class533[] var11 = class533.method9515();
				int var12 = 0;

				class533 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class533 var13 = var11[var12];
					if (var10 == var13.field5268) {
						var9 = var13;
						break;
					}

					++var12;
				}

				var32.writeByte(var9.field5271);
				Class var34 = var8.getClass();
				class533[] var15 = class533.method9515();
				int var16 = 0;

				class533 var14;
				while (true) {
					if (var16 >= var15.length) {
						var14 = null;
						break;
					}

					class533 var17 = var15[var16];
					if (var34 == var17.field5268) {
						var14 = var17;
						break;
					}

					++var16;
				}

				if (var14 == null) {
					throw new IllegalArgumentException();
				}

				class529 var22 = var14.field5269;
				var22.vmethod9521(var8, var32);
			}
		} catch (Exception var30) {
		} finally {
			try {
				var1.close();
			} catch (Exception var29) {
			}

		}

		this.unwrittenChanges = false;
		this.field1448 = class129.method3033();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label230: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2);
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte();
					if (var15 < 0 || var15 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label230;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class533 var10 = (class533)MenuAction.findEnumerated(class533.method9515(), var9);
							Object var11 = var10.method9508(var14);
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var11);
							}

							++var7;
						}
					} else {
						var16 = var14.readUnsignedShort();

						for (var7 = 0; var7 < var16; ++var7) {
							var8 = var14.readUnsignedShort();
							var9 = var14.readInt();
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var14.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label230;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label230;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1273488440"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1448 < class129.method3033() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "293856255"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}
}
