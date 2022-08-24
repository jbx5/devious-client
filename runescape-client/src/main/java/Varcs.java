import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.util.Map;
import java.io.EOFException;
import net.runelite.mapping.Export;
@Deprecated
@ObfuscatedName("cg")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive14")
	static Archive archive14;

	@ObfuscatedName("hc")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("w")
	@Export("intsPersistence")
	boolean[] intsPersistence;

	@ObfuscatedName("v")
	@Export("map")
	Map map;

	@ObfuscatedName("c")
	@Export("strings")
	String[] strings;

	@ObfuscatedName("q")
	@Export("unwrittenChanges")
	boolean unwrittenChanges = false;

	@ObfuscatedName("i")
	@ObfuscatedGetter(longValue = 3851811378176756195L)
	long field1317;

	Varcs() {
		int var1 = Renderable.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];
		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = UserComparator10.method2598(var2);
			this.intsPersistence[var2] = var3.persist;
		}
		var2 = 0;
		if (Renderable.archive2.method5722(15)) {
			var2 = Renderable.archive2.getGroupFileCount(15);
		}
		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-484330896")
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "95")
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? ((Integer) (var2)) : -1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "1554838200")
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-534941773")
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? ((String) (var2)) : "";
	}

	@Deprecated
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "374777002")
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@Deprecated
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1057672624")
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-903379858")
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ZI)Lpn;", garbageValue = "-1782789520")
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class433.getPreferencesFile("2", class20.field111.name, var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "30")
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
						var2 += class309.stringCp1252NullTerminatedByteSize(((String) (var7)));
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
					class433 var9 = class433.method7490(var8.getClass());
					var24.writeByte(var9.field4658);
					class429 var10 = class433.method7504(var8.getClass());
					var10.vmethod7506(var8, var24);
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
		this.field1317 = class181.method3483();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "64")
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);
		label226 : {
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
								break label226;
							}
							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class433 var10 = ((class433) (GameEngine.findEnumerated(class433.method7494(), var9)));
							Object var11 = var10.method7493(var14);
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
								break label226;
							}
							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						} 
					}
				}
			} catch (Exception var25) {
				break label226;
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
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "45")
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1317 < class181.method3483() - 60000L) {
			this.write();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1795921631")
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;I)V", garbageValue = "1476782288")
	static void method2418(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(NetFileRequest.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}
			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}
	}
}