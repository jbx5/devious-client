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

@ObfuscatedName("em")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ak")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("aj")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ai")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ay")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -374131008840126959L
	)
	long field1458;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class59.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method3909(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class59.archive2.method7591(15)) {
			var2 = class59.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-96873113"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2033227244"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1159355197"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1490075636"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-582120170"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "205126563"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1337875578"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lun;",
		garbageValue = "1117172637"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return IgnoreList.getPreferencesFile("2", WorldMapRenderer.field3156.name, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-304774006"
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
						var2 += World.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class544 var9 = class544.method9926(var8.getClass());
					var23.writeByte(var9.field5383);
					class544.method9929(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1458 = class77.method2338();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "780843614"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label246: {
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
									break label246;
								}

								var8 = var14.readUnsignedShort();
								var9 = var14.readUnsignedByte();
								class544 var10 = (class544)class177.findEnumerated(class544.method9937(), var9);
								Object var11 = var10.method9932(var14);
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
									break label246;
								}

								var14.readUnsignedShort();
								var14.readStringCp1252NullTerminated();
								++var8;
							}
						}
					}

					return;
				}
			} catch (Exception var25) {
				break label246;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1489115595"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1458 < class77.method2338() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1088650053"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}
}
