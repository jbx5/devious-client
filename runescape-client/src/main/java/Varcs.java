import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.Map;
import java.io.EOFException;
import net.runelite.mapping.Export;
@Deprecated
@ObfuscatedName("ce")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("f")
	@Export("intsPersistence")
	boolean[] intsPersistence;

	@ObfuscatedName("u")
	@Export("map")
	Map map;

	@ObfuscatedName("c")
	@Export("strings")
	String[] strings;

	@ObfuscatedName("w")
	@Export("unwrittenChanges")
	boolean unwrittenChanges = false;

	@ObfuscatedName("z")
	@ObfuscatedGetter(longValue = -5311417398100206119L)
	long field1312;

	Varcs() {
		int var1 = class20.archive2.getGroupFileCount(19);
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
					var4.method3382(new Buffer(var5));
				}
				VarcInt.VarcInt_cached.put(var4, ((long) (var2)));
				var3 = var4;
			}
			this.intsPersistence[var2] = var3.persist;
		}
		var2 = 0;
		if (class20.archive2.method5813(15)) {
			var2 = class20.archive2.getGroupFileCount(15);
		}
		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1842555953")
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-96")
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? ((Integer) (var2)) : -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V", garbageValue = "-42")
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "2020259438")
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? ((String) (var2)) : "";
	}

	@Deprecated
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "1903894508")
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@Deprecated
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;", garbageValue = "38")
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-31")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ZI)Lpi;", garbageValue = "1901755006")
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return Actor.getPreferencesFile("2", AbstractByteArrayCopier.field3293.name, var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2087003236")
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);
		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();
			while (var4.hasNext()) {
				Map.Entry var5 = ((Map.Entry) (var4.next()));
				int var6 = ((Integer) (var5.getKey()));
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class92.stringCp1252NullTerminatedByteSize(((String) (var7)));
					}
					++var3;
				}
			} 
			Buffer var26 = new Buffer(var2);
			var26.writeByte(2);
			var26.writeShort(var3);
			Iterator var27 = this.map.entrySet().iterator();
			while (var27.hasNext()) {
				Map.Entry var15 = ((Map.Entry) (var27.next()));
				int var16 = ((Integer) (var15.getKey()));
				if (this.intsPersistence[var16]) {
					var26.writeShort(var16);
					Object var8 = var15.getValue();
					class433 var9 = class433.method7590(var8.getClass());
					var26.writeByte(var9.field4672);
					Class var11 = var8.getClass();
					class433 var12 = class433.method7590(var11);
					if (var12 == null) {
						throw new IllegalArgumentException();
					}
					class429 var10 = var12.field4673;
					var10.vmethod7609(var8, var26);
				}
			} 
			var1.write(var26.array, 0, var26.offset);
		} catch (Exception var24) {
		} finally {
			try {
				var1.close();
			} catch (Exception var23) {
			}
		}
		this.unwrittenChanges = false;
		this.field1312 = class131.method2916();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1618555169")
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);
		label211 : {
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
								break label211;
							}
							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class433 var10 = ((class433) (class271.findEnumerated(class433.method7604(), var9)));
							Object var11 = var10.method7602(var14);
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
								break label211;
							}
							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						} 
					}
				}
			} catch (Exception var25) {
				break label211;
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "46")
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1312 < class131.method2916() - 60000L) {
			this.write();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "239")
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1999395641")
	public static boolean method2546() {
		return class273.musicPlayerStatus != 0 ? true : class273.midiPcmStream.isReady();
	}
}